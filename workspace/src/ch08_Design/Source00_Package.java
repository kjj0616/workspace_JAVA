import java.awt.Rectangle;
// ���ϰ� �������ؼ��� import

class Source00_Package {
	public static void main(String[] args)	{
		java.awt.Rectangle r1 = new java.awt.Rectangle();

		Rectangle r2 = new Rectangle();

		design.Box b1 = new design.Box();

		//b1.flag = true;
		/*
		---------- ������ ----------
		Source00_Package.java:12: error: flag has protected access in Box
				b1.flag = true;
				  ^
		1 error

		��� �Ϸ� (0�� ���) - ���� ����
		*/
		/*
			�ء� ������ ���̱� �ء�

			��üŸ��

			-	(defalut) / public 

			����, ������, �Լ� 

			: private	-���� ��Ű�������� ���� ������ ������ ��

			: (defalut)	-�⺻���� : ������Ű�������� �����Ӱ� ���

			: protected	-Ÿ��Ű���� �Ϻ��� ��� ������ �Ǵ� ��Ȳ�� ����

			: public	-��𼭵� �����Ӱ� ���� ����
		*/
	}
}
