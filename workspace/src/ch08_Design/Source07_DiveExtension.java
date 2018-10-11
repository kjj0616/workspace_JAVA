class Stone {
	int x, y;
	Stone (int x, int y){
		this.x = x;
		this.y = y;
	}
	void move(int nx, int ny){
		System.out.println("stone.move()");
		x= nx;
		y= ny;
	}
	String inform(){
		return "(x="+x+",y="+y+")";
	}
	// �̰� ���� �� ����� �ִٰ� �����ϰ�... �� ��ü�� �������� �������
	// �Ŀ�, �������� �ؾߵǴ� ��Ȳ��
}
//========================================================================
class MemoryStone extends Stone { // ����ȸ���� ����ϴ� Stone
	int cnt;
	MemoryStone(int x, int y){
		super(x,y);
	}
	void memoryMove(int nx, int ny){
		System.out.println("memorystone.memoryMove()");
		cnt++;
		super.move(nx,ny);
	}
	// extends �ɰ� �����ϸ鼭 ���� ���·� �Լ��� �����ϸ� ������ ���� ���������
	// �� ��ü�� ����Ҷ�, ���� �ٽ� ������� ���·� �۵��ϰԵȴ�.

	// �Լ� �缳�踦 ���ؼ� ��������� �������� �Ǹ� �̶� super�� �����ؾߵȴ�.
	// extends �� �ɰ� �����ϴ� �ʿ��� ������ �Լ�(�޼ҵ�)�� ���������(�缳��) ��°�

	// ==> Override ��� �θ���.
	// �ڹٴ� �̰� �����Ѵ� - 
	// �������̵�(������) �ÿ��� ���� �͵鿡 ���ؼ��� �����ϰ�, access�� �ּ��� �����ؾ߸� �Ѵ�.
	//							(not final)			(not private, �� ���ϰԺҰ�,�ּ� ���� (public)->public)
	// ������ �ٸ��� �������̵尡 �ƴϴ�.(-> �����ε� �߰�)

	// �Լ��� final�� ���̸� �����Ұ�
	// ������ final�� ���̸� extends �Ұ�
	void move(int nx,int ny){ 
		System.out.println("memorystone.move()");
		cnt++;
		super.move(nx,ny);
	}
	String inform(){
		return "�̵�ȸ��:"+cnt+", ������ġ"+super.inform();
	}
}
/*
	����� �߰��ؼ� �����ص� ������,
	���� ����� �ٲ㼭 �����ϴ°͵� �����ϰ�,(�۵��Ǹ� �ȵǴ°͵��� �������صδ�)
	�̷��� �Ǿ����� �� ��ü�� �����ؼ� �Լ� ���� �ϰ� �Ǹ�,
	������ ����� �۵���Ű�°� ������ �۵��ǰ� �ȴ�.

*/

//========================================================================
class Source07_DiveExtension {
	public static void main(String[] args)	{
	/*	Stone s = new Stone(1,1);
		System.out.println(s.inform());
		s.move(3,5);
		System.out.println(s.inform());
	*/	
		MemoryStone ms;
		ms = new MemoryStone(5,2);

		ms.move(4,5);
		ms.memoryMove(5,5);
		System.out.println(ms.inform());
		System.out.println(ms.cnt); // �ϳ��� ī��Ʈ��
		
		// Override�� ���� ȿ���� ���°� �������� �¹��������̴�.

		Stone s = new MemoryStone(0,0); // ���� Ÿ������ �� ��ü�� �����ϴ���
		s.move(5,5);					// �۵��ϴ°� MemoryStone ��ü�̱� ������
		System.out.println(s.inform()); // �� ��ü�� ������ ������ �ִ� �Լ��� �۵��� �ϰ� �ȴ�.
										// override�� �Լ��� ��ȯ�� �Լ� �״�� �۵��Ѵ�.

		/*
			s ��� ������ ��� �Ǵ� ��ü�� Stone ��üŸ������ ���ֵǾ� �νĵǾ� ���ȴ�.
			Stone ��ü�� ��������� ������ ������ ��ɵ鸸�� ȣ���Ҽ� ����
		*/
		//s.memoryMove(4,5); // �߰��� �κп� ���� �κ��� ��� �ȵ�

		// �̶����� ����� ���鶧 �������̵带 �ؼ� �����ߵǴ� ��Ȳ�� �����.

	}
}
