/*
	�̿�� �濵 Ÿ���� ������ ������� ��.
	�մ�, �������̳�, �Ƹ�����Ʈ�� ��ü�� �ʿ���.

	(public Ŭ������ �ƴϹǷ� ���Ͽ� class ������ ��������)

	����� ����
	 2. �����ؾߵ� ��ü�� ������ �������� �����ؼ� �ϳ��� �����ΰ�,
		�������� �� Ȯ����� �߰��κи� ���������ν� ȿ�������� ���谡 �����ϴ�.
*/
class Sims {	
	int age;
	boolean gender;
	Sims(){ // �⺻�����ڰ� �����ϸ� �ڽ�Ŭ�������� super�� ������ʿ�� ����.
			// �ٸ� �ڽĻ����ڿ��� ��ġ�� �κ��� �ִٸ� ��Ȱ�� �������� ����ϴ°��� ����
			// �ڵ� ȿ������������ ��õ
	}

	Sims(int a, boolean g){
		age= a;
		gender = g;
	}

	String inform(){
		return "("+age+"��/"+(gender? "����":"����");
	}
	// �� �ȿ� ������� ��ü���߿� ��ġ�ºκ��� �� ����
}

//=======================================================================
class Guest extends Sims{
	long create;
	Guest(int a, boolean g){
		super(a,g);	// �Ű������� �Ѱܹ���, ���� ������ ���� ����
		create = System.currentTimeMillis();		
	}

	boolean handle(){
		long now = System.currentTimeMillis();
		if(now - create <=5000){
			return true;
		}else
			return false; 
	}
}
//=======================================================================
class HairDesigner extends Sims{
	String name;
	boolean special;

	HairDesigner(String n, int a, boolean g, boolean s){
		super(a,g);	// �Ű������� �Ѱܹ���, ���� ������ ���� ����
		name = n;
		special = s;
	}

	String detail(){
		return name + " / "+inform() +" / �߰��ɷ� " + (special?"����":"����");
	}

}