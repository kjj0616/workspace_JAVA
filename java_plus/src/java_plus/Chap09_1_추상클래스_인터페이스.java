package java_plus;
	/*
	1. ������ : Ŭ������ ����� ���� �� ������ ������ ����
	
		static - ���� : Ŭ���������� ����ƽ ������ �޸𸮿� �Ҵ� ����, �����Ҵ� ���� ���ٰ���
		
		final - �������� ���, ĸ��ȭ �޼ҵ� ���Ұ�, ����Ұ� : ������ ������ ������ ���� --> ���ȭ

		�߻�ȭ : ��ü���� �������κ��� ����� �κи� �߷����� �Ϲ�ȭ �ϴ� ���� �ǹ�, �Ϲ����� ����� �� �ִ�
				�ܰ谡 �ƴ� ���� �̿ϼ��� ����
		
		�߻�޼ҵ� : �޼ҵ� ���ǽ� �޼ҵ� �� �����ϰ� ���� �� brace( { } ) �� �����Ͽ� ������ �޼ҵ���
		 			���๮�� ������ ��. �޼ҵ� �տ� abstract ���þ� ���
		 			
		 			abstract �޼ҵ��();
	 */

class final_1{
	int a=10;
	static int b = 20;
	final int c = 30; //���ȭ: ����Ұ�
}

abstract class ab_per{
	//abstract int d = 40; abstract�� ��������� �������� ����
	
	abstract void ab_cal();
	abstract int child_get(); // �ڽ�Ŭ������ ��� ������
}

class ab_child extends ab_per{
	int ab_a=111;
	int child_get() { //�ڽ�Ŭ�������� �ڽ��� ��������� ����
		return ab_a;
	}
	void ab_cal() { //�ڽ�Ŭ�������� �ݵ�� abstract �޼ҵ带 �����ؾ� �Ѵ�
		System.out.println("�� �߻��̾�");
	}
}

public class Chap09_1_�߻�Ŭ����_�������̽� {
	public static void main(String[] args) {
		final_1.b = 200;
		final_1 ff = new final_1();
		ff.a = 100;
		ff.b = 2000;
		//ff.c=300; --> ���ȭ
		System.out.println("ff.c="+ff.c);
		//ȣ�⿡�� ���� ����
		
		//ab_per pp = new ab_per();
		//�߻�޼ҵ��� ���� ���� ������ �����Ƿ� �ܵ����� ���Ұ�
		
		//ab_per pp = new ab_per(){ void ab_cal(){} };
			//�ܵ����� ����ϱ� ���ؼ���
			//�����ÿ� �߻�޼ҵ忡 ���� ���Ǹ� ���־�� �Ѵ�
		
		ab_per p1 = new ab_child();
		ab_child cc = new ab_child();
		//�θ�Ŭ������ �ڽ�Ŭ������ �Ҵ� �޾� �����ϰų�
		//�ڽ�Ŭ������ ����
		System.out.println("p1.child_get() : "+p1.child_get());
			
		}
		
	}

//-----------------------------------------------------------------------



