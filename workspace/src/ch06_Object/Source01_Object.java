package ch06_Object;
import java.awt.Rectangle;	
// �⺻���� ������ �Ǵ� �͵��� ó���ϱ� ���ؼ� �ۼ��ϴ� �ڵ�

class Source01_Object {
	public static void main(String[] args)	{
		/*
			��ü? ���ν����� ����ü 
				+ ����������ɷ��� �ְ�,
				�۵��Ҷ� �ڽ��� �����ϰ� �ִ� ������ ������� ���ν����� �۵��ϰ� �ȴ�.				

			��ü��°� �����ϱ� ���� ,
			�ڹٿ��� �����ϴ� 2���� �������� ���Ǵ�	Ractangle�̶�°� ���캸��.
		*/
		
		// ��ü��°� ����ϱ� ���ؼ��� ���������� ���� �Ǵµ�, �׶� new ��� Ű���尡 ���̰Եȴ�.
		new Rectangle();	// �����͸� ó���Ҽ� �ִ� ��ü�� �ϳ� ��������� �ȴ�.
		new Rectangle();	// ���� ������ �ϰԵǸ� �� �ٸ� ��ü�� �ϳ� �� ��������� �ȴ�.
		// ������Ų ��ü�� ���� ���ؼ��� new �ؼ� �߻��ϴ� ��ü���� �޾Ƶ־� �ϴµ�, 
		// ��ü������ ������� �����ؼ� ���� �޾��ָ� �ȴ�.
		Rectangle r1 = new Rectangle();
			// Rectangle ��ü�� x, y, width, height ��(int)�� �����ϴ� �ɷ��� �ִ�.
			r1.x = 10;
			r1.y = 100;
			r1.width = 400;
			r1.height = 300;
		String s1 = r1.toString();
		System.out.println(s1);
		boolean b1 = r1.contains(200,200);

		System.out.println(b1); // true  0,0 �����Ʒ��� 1600,900

		Rectangle r2 = new Rectangle();
			r2.x = r2.y =20;
			r2.width = r2.height = 100;
		String s2 = r2.toString();
		System.out.println(s2);
		boolean b2 = r2.contains(200,200);
		System.out.println(b2); // �� ��ü�� �������� ���� ������� ���ν����� ������ false

		r1.grow(10,5);
		System.out.println( r1.toString());
		// ��ǥ(����)���ؿ��� 2������(�����¿�)�� ���� 10(�¿�), 5��(���Ʒ�) �þ

		// r2 (20,20,100,100)
		r2.grow(20,10);
		System.out.println( r2.toString());
		// r2 ( 0,10,140,120)

		/*
			��ü =>	data storage + procedure

			��ü ��ü�� ���鶧�� ��ü�� �ϴ����� procedure ���·� ������ ��
		*/
	}
}
