class Source05_NullValue {
	public static void main(String[] args)	{
		/*
			null �̶�� �����Ͱ� �ִ�, �� �����ʹ� ��ü�������� ������ �ִ� �������̴�.
		*/
		//	int a = null; error
		Sphere s = null;
		Robot r = null;
		System.out.println(s == null);
		System.out.println(r != null);
		/*
			��ü�������� ���� ���� null �̶�� ���� �������� ��ü�� ���� ��Ȳ�� ��Ÿ����.
		*/
		//r.greet(); // error

		Legion g1 = new Legion();
			g1.one = new Robot();
			g1.one.name= "���";
			
			Robot f = new Robot();
			f.name = "���İ�";
			g1.other = f;
		String ss = g1.introduce();
		System.out.println(ss);
		
	}
}
