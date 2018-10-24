package ch03_branch;
class Source04_Switch {
	public static void main(String[] args) 	{
		/*
			������ó���������� branch �۾��� �ʿ��Ҷ� ����Ҽ� �ִ� ��������
			switch case ��°͵� �����Ѵ�.

			if - else : �����Ϳ� ���¿� ���� branch �۾�
			switch - case : ������ ���� Ekfms branch ó��
				/ int, char �� ������, String ������, enum �����Ϳ��� ��밡��
		*/
		int d = 5;
		System.out.println("d == " + d + " / switch branch start");
		// switch(�����͸� ����ִ� ����)
		switch(d){
		case 5 :
			System.out.println("case ..5 handle");
			System.out.println("case ..5 handle");
			System.out.println("case ..5 handle");
		case 3 :
			System.out.println("case ..3 handle");
			System.out.println("case ..3 handle");
		default :
			System.out.println("default handle");
		}
		System.out.println("switch branch end\n");
		/* <���>
		d == 5 / switch branch start
		case ..5 handle
		case ..5 handle
		case ..5 handle
		case ..3 handle
		case ..3 handle
		default handle
		switch branch end
		*/

		/*
			�ش� case �� �۵��ϴ°� �ƴ϶�, �ش� case���� ������ �ȴ�.
			default �� case ó�� �ȵ� �����Ͱ��϶� �۵�
			�ش� ���̽��� �۵���Ű�� �ʹٸ�,
			�ٸ� ���̽� �۾���������  break �� �����صθ� �ȴ�.
		*/
		/*
		double r = 3.14;
		switch(r) {
		
		}
		//�Ұ�
		*/
		
		String str = "java";
		switch(str){
		case "java":
		case "JAVA":
			System.out.println("�ڹ� ���α׷��� JRE�� ���ؼ� �����Ű�� ��ɾ��̴�.");
			break;
		case "javac":
		case "JAVAC":
			System.out.println("�ڹ� �ҽ��ڵ带 JDK�� ���ؼ� ���α׷�ȭ ��Ű�� ��ɾ��̴�.");
			break;
		}

	}
}
