class Source05_UseUtils {
	public static void main(String[] args)	{
		Utils u = new Utils();
		int v = u.max(3,5);
		System.out.println(v);
		int vv = Utils.max(5,6);
		System.out.println(vv);
		// ��ü���� �̶�⺸�ٴ� ���ν�����Ŀ���
		Math.random();
		/*
			main �� �� static �� �ֳ�...?
		*/
		Source04_Time s = new Source04_Time();
		s.main(null);
		/*
			java.Source05_UseUtils ==>
			main�� static�� �ƴ϶��, ��ü������ �ؼ� call�� �ؾ߸� ������ �ȴ�.
			JVM �����ڵ� ������ �ش簴ü�� ������Ű�� �ɷ��� ���
		*/
		Source01_UseBot.main(null);
		//  �̷��� �������� �����ȴ�.
		//  main�Լ��� �������� ���� ȣ���� �����ϴ�.
		//  �� ���ѹݺ��ϰ� (�Լ������� ���Լ��� �ٽ�ȣ��) �ϸ� ����

		//  static �� �ƴ϶�� new�� ���� �����ؼ� ����ϴ� �� �ۿ� ����.
		//  �� ��Ȳ�� private�� �ܺο��� ���� new ������ ������ �ִ�.
	}
}
