package ch04_loop;
class Source10_LoopControll {
	public static void main(String[] args)	{
		/*
			while�� ������ �ߴ�, for�� ������ �ߴ�����
			�ش� �ʱ� ������ ��� �صξ��Ŀ� ���� �׾ȿ� �����ص� ó���� �۵��ϰ� �Ǵµ�,

			�̰� break(�������),
			     continue(������ �ѱ��)
			�� �̿��ؼ� loop ��ü�� �����Ҽ� �ִ�.
		*/
		int sum = 0;
		for(int cnt=1; cnt<=5;cnt++){
			int r = (int)(Math.random()*10);
			if(r%2==0){
				System.out.println(r +" loop skip");
				continue; // ����(for)�� �Ʒ��κ� ����ʰ� ������(ó��)���� �ٷ�����
				/*
					���� �߰����� �ַ� �����ϰ�,
					ó�� ���ص� ��Ȳ�� �ǳʶ���� �Ҷ� ����Ҽ� �ִ�.
				*/
			}
			System.out.println("r = " +r);
			sum += r;
			System.out.println("current sum = " +sum);
		}

	}
}
