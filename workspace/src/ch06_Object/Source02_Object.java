package ch06_Object;
import java.awt.Rectangle;

class Source02_Object {
	public static void main(String[] args)	{
		/*
			��ü��°� ������ �ؼ� ���� ��ü���� �޾���� ����� �����ϴ�?
			��ü���� �����ΰ�?
			�����Ǹ鼭 JVM���� �ο��Ǵ� ������ ��ü�� ����ؾߵ� �� ���̴� �������ٰ�(������)�̴�.
			��Ȯ�� ���� Ȯ�κҰ���.
		*/
		new Rectangle(); // strage + procedure ���� 
		//--> �̰��� �����ϰ� �Ҽ��ִ� ��ü��, �ּҰ�, ������, ���۷���...
		Rectangle r1 = new Rectangle();
			r1.x = 5;
		Rectangle r2; // ��ü�� ����� �ƴϴ�.
		// Rectangle ��ü���� ������ ������ �����

		r2 = r1;	// r2�� Rectangle ��ü�� ����뵵�̱⿡, r1�ȿ� ����Ǿ��ִ� ��ü��(�ּҰ�)�� ������ �ִ�.
		System.out.println(r2.x);
		r2.y = 100;
		System.out.println(r1.toString());
		r1 = new Rectangle();
		r1.y = 500;
		r2 = r1;
		System.out.println(r2.y); // �ּҰ��� ����� �����ѵ�
		// ��ü�� �����ϰ� �Ǹ� ��ü�� �����ϴµ� �ʿ��� �޸𸮸� ����ϰ� �Ǵµ�
		// ����, �� �̻� ������ �ʴ� ��ü���� �ڹٰ���ӽ��� ���α׷� �����߿� ������ �س����鼭
		// �˾Ƽ� ��ü�� ���������鼭 ���ʿ��� �޸𸮵��� �����س�����.
		// �� ������ "�ڹٰ���ӽſ����� ������ �÷����� �Ͼ��"�� ǥ���Ѵ�.
		Rectangle one = new Rectangle();
			one.x = one.y = one.width = one.height = 100;
		System.out.println("one = "+ one.toString());


		Rectangle other = new Rectangle();
			other.x = other.y = other.width = other.height = 100;
		System.out.println("other = "+ other.toString());

		//��ü������ ���� �۾��� ==, != �� �ΰ��ۿ� ���µ�, ���� ��ü�ΰ� �ƴѰ� ��
		System.out.println(one == other);
		Rectangle t = other;
		other = one;
		System.out.println(one == other);
		// ==> ��ü�� ���ν����� void ���°� ���� (�Ϲ����� �۾�����)


		/*
		������: ���ϰ� Ȯ��
		System.out.println(r1.getClass());
		Object obj = r2;
		System.out.println("return type = "+ obj.getClass().getName());
		*/

	}
}
