package ch02_variable;
class Source05_AutoConvert {
	public static void main(String[] args) {
		/*
			��ġ�������� int < long < float < double ������ �ڵ����� ��ȯ�� �Ͼ��.
			1. �ٸ�Ÿ���� �����Ͱ� ������ �Ͼ���� ū������ �ڵ���ȯ�� �Ͼ��.
			2. ���������͸� ūŸ�Կ� �����Ϸ��� �Ҷ��� �ڵ���ȯ�� �Ͼ��.
		*/

		int a = 5;
		double d = 10.4;
		long g = 30L;

		System.out.println(a + d);
		System.out.println(g >= a);
		
		double e = a + d;

		long t1 = a;
		System.out.println(t1);

		float t2 = a;
		System.out.println(t2);

		//float f3 = d; //ū���� ���������δ� ����(�ڵ����� �ȵ�)
		/*
		15: i2d
	  
		 27: i2l

		47: i2l
		*/
		//�ڵ���ȯ�� �Ͼ�� ��� - ��ġ����, ī�ǿ���

	}
}
