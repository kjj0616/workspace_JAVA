package ch01_dataType;
class Source08_DataOperation {
	public static void main(String[] args) {
		/*
			���ڿ�������"" ���� �����ϴ� �۾��� �����Ѵ�.

			������ ����� �� �Ҽ� �ִ�.
		*/
		System.out.println("�ڹ�" + "���ڿ� ����");
		//	System.out.println("�ڹٹ��ڿ�" - "�ڿ�"); //�Ұ�

		//  System.out.println("�ڹ�" > "���̽�"); //�Ұ�
		System.out.println("�ڹ�" == "���̼�");
		System.out.println("�ڹ�" == "�ڹ�");
		System.out.println("�ڹ�" != "���̽�");

		/*
			Ư���� ����, ���ڿ��� �������� ����� ���ڿ��� �ƴϸ�
			�װ��� ���ڿ�ȭ ���Ѽ� ������ �Ѵ�.
		*/

		System.out.println("�ڹ�" + 30); // 30 ==> "30"
		System.out.println("�ڹ�" + 30 + 10); // �ڹ�3010
		System.out.println("�ڹ�" + (30 + 10)); // �ڹ�40
		System.out.println(10 + 30 + "�ڹ�"); // 40�ڹ�
		System.out.println((10+30)+"�ڹ�"); // 40�ڹ�

		System.out.println("�Ϸ�� " + (60*60*24) + "�� �̴�.");
	}
}
