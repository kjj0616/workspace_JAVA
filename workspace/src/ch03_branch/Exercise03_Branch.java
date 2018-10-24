package ch03_branch;
class Exercise03_Branch {
	public static void main(String[] args) 	{
		/*
			switch - case�� Ư���⵵�� Ư������ �ϼ� ����ϱ�
		*/
		System.out.println("[SYSTEM] �⵵ �Է� : ");
		int year = Integer.valueOf(System.console().readLine());

		System.out.println("[SYSTEM] �� �Է� : ");
		int month = Integer.valueOf(System.console().readLine());
		/*
			�ش�⵵ �ش���� ���ϱ��� �ִ��� ����ؼ� ���

			if - else �� month ������ ��ȿ�� üũ �Ͻð� (1-12 �����϶��� ����� ó��)
			��ȿ�������϶� �۵��Ǵ� branch����
			switch case / 4,6,9,11 �� ���̽��� ��Ƽ� ���� ���
			       case / 2 ��Ƽ� ���� ���
				   case / default / ���� �޵� �Ѳ����� ó��
			�� case 2 ó���Ҷ� ���� ó���ؾߵ� :
				4�ǹ�� �⵵�̸�, 100�� ����� �ƴϾ���Ѵ�(400�ǹ���� ����ó����)
			1900 : ����X, 2004 : ����O , 2000 : ����O, 2100 : ����X
			400�� ����ų� Ȥ�� 4�� ����̸鼭, 100�� ����� �ƴϸ� ����
		*/
		if (month>0 && month<13){
			System.out.println("[SYSTEM] valied data");
			System.out.print("[SYSTEM] "+year+"�� "+month+"���� ������ "); 
			switch(month){
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("30���̴�");
					break;
				case 2:
					if (year%400==0 || (year%4==0 && year%100 !=0))
						System.out.println("29���̴�");
					else 
						System.out.println("28���̴�");
					break;
				default:
					System.out.println("31���̴�");
			}
		}else{
			System.out.println("[SYSTEM] invalid data ");
		}
		System.out.println("[SYSTEM] Exit");

	}
}
