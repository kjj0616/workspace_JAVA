class Source03_RobotUse {
	public static void main(String[] args)	{
		// ������ ��ü �۵�Ȯ�� test

		Robot r1 = new Robot(); //�������������� ������ũ�������� ��밡��
			r1.name = "���";
			r1.type = 2;
		String s1 = r1.greet(); // ���ϰ����� �λ�
		System.out.println(s1);

		Robot r2 = new Robot();
			r2.name = "���İ�";
			r2.type = 1;
		System.out.println(r2.greet());
		r2 = r1;
		System.out.println();
		System.out.println(r2.greet());
		r2.name = "Ÿ�뽺";
		System.out.println(r1.greet());

		System.out.println(r2 == r1);
	}
}
