class Source01_UseRobots {
	public static void main(String[] args)	{
		Robot b = new Robot();
			b.name = "���İ�";
		String g = b.greet();
		System.out.println(g);

		Android a = new Android("�����",1,60);
		System.out.println(a.greet());
		for(int cnt=1;cnt<=5;cnt++){
			boolean rs= a.doCleaning();
			System.out.println("doCleaning == "+rs);
		}
		System.out.println(a.tell());

	}
}
