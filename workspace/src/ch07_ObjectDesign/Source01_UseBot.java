package ch07_ObjectDesign;
class Source01_UseBot {
	public static void main(String[] args)	{
	// new Bot(); �� ��ü�� �̷������δ� ������ �Ұ���������.

		Bot b1 = new Bot(50);
		System.out.println(b1.tell());		// stamina 0, count 0
		boolean f1 = b1.move(30);
		System.out.println(f1); //false
		System.out.println(b1.tell());		// stamina 0, count 0
	
		b1.init(); 
		//init() �ʱ������ ����ߴ� stamina�� �ʱ�ȭ�� �ǰ��Ϸ���
		// ������ �ʿ�
		
		boolean f2 = b1.move(20);
		System.out.println(f2); //true
		System.out.println(b1.tell()); // stamina 98, count 1
		b1.move(11);
		b1.move(25);
		System.out.println(b1.tell()); // stamina 93, count 3



	}
}
