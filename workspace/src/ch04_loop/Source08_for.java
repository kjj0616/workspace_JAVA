package ch04_loop;
class Source08_for {
	public static void main(String[] args)	{
		/*
			for �� Ư�������� ��ġ�� �̿��� loopó�� �������� ������
		*/
		for(int val = (int)'��'; val <='��'; val++){
			System.out.println("val = "+val+ " / "+ (char)val);
		}

		for(int val = (int)'��'; val >='��'; val--){
			System.out.println("val = "+val+ " / "+ (char)val);
		}
		System.out.println();

		// 2018�⸸ ó���Ѵٰ� �����ϰ�, (�Էµ����� -��ȿ�����ͷ� ����)
		// ��� ������ 1���� ����° �Ǵ� ���ΰ�..?
		System.out.println("���?: ");
		int month= Integer.valueOf(System.console().readLine());
		System.out.println("����?: ");
		int day= Integer.valueOf(System.console().readLine());
		int total = 0;
		/*
			month ���� �ޱ��� �����ϼ� + day�� ���Ѱ� �� �ϼ���.
		*/		
		for (int i=1;i<month;i++){
			switch(i){
			case 4:	case 6:	case 9:	case 11:
				total += 30;
				break;
			case 2:
				total += 28;
				break;
			default:
				total += 31;
			}
			System.out.println(i+"�� ������ �� "+total+"��");
		}
		total += day;

		
		System.out.println(month+"�� "+ day+"���� 1���� "+total+"��° ���̴�.");
		// 1��1���� ��������, �׷� �Է¹��� ���� ���� �����ϱ� (������ 7�ϸ��� �ݺ���)
		// total%7= num
		// switch(total%7){
		int res= total%7;
		String a = ", ";
		switch(res){
			case 1: a+="�ſ����̴�"; break;
			case 2: a+="�������̴�"; break;
			case 3: a+="⩿����̴�"; break;
			case 4: a+="�ʿ����̴�"; break;
			case 5: a+="�ݿ����̴�"; break;
			case 6: a+="�Ͽ����̴�"; break;
			case 0: a+="������̴�"; 			
		}
		System.out.println(month+"�� "+ day+"���� 1���� "+total+"��° ���̰� " +a);

	}
}
