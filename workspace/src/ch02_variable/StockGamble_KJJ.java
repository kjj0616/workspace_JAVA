class StockGamble_KJJ {
	public static void main(String[] args) {
		/*
			Ư������(7000��)���� ������ �ֽ��� ����ڷκ��� 
			�Է¹��� �ݾ����� ��� �ִ� ��ŭ ����ؼ� 
			� ���. �ܾ� �󸶴�. �ѹ� ���.
			
			�Է� : �� ���ڱݾ�

			�����Ǽ� ��ġ 0.0 ~ 30.0 �� �̾Ƽ�, �� ��ġ�� �̿��Ͽ�
			���ۼ�Ʈ ����߽��ϴ�. ������ �󸶴� ��� ���.

			#������´��� ��������� ����(10���������� ����)

			������ �󸶰� ����.

			money -= money%100> 0 ? ....:...;
		*/
		int realmoney = Integer.valueOf(System.console().readLine("�ʱ� ���ڱݾ� �Է�:"));
		int price=7000;
		int buy = realmoney/price;
		System.out.println("���ִ� ����: "+price);
		System.out.println("�� "+buy+"�� ����, �ܾ� :"+realmoney%price+"��");
		
		double increaseRate = ((int)(Math.random()*301))/1000.0;
		
		increaseRate = ((int)(increaseRate*100))/100.0;
		//System.out.println(increaseRate);

		System.out.print(increaseRate*100 + "% ����߽��ϴ�. �� �ְ����� ");

		double resultMoney = price*(1.0+increaseRate);

		resultMoney -= resultMoney%100 > 0 ? resultMoney-(((int)(resultMoney/100))*100) : 0;
		//System.out.println(resultMoney);
		System.out.println((int)resultMoney +"���Դϴ�.");

		System.out.print("�� �ڻ�: "+(int)resultMoney*buy +"�� + �ܾ� "+realmoney%price+"�� =");
		System.out.println((int)resultMoney*buy+(realmoney%price));
		System.out.println("�������� : "+( (((int)resultMoney*buy) + (realmoney%price))-realmoney)+"��");
		
		/*
		int price =5+(int)Math.random()*10);
		price *= 1000;
		System.out.print("���ִ� ����: " + price + " / ���ڱݾ� : ");
		int money = Integer.valueOf(System.console().readLine());

		int bought = money / price;
		System.out.print(bought+ "�� ���� ���� / �ܾ� : " +(money -(bought*price));
		System.out.println();
		System.out.println("���� �߻�");
		System.out.println("..");

		double rate = (int)(Math.random()*300)/10.0;

		int cprive =(int)(price+(prive*rate/100));
		cprice = cprice%50; //�� 50�� ������ ó���Ϸ��� ó�� �������� ����

		System.out.println(price + " >> " +cprice+"");
		System.out.println(rate+"% ���" + (cprive-price) +")" );
		
		System.out.println("���� : "+ (cprive*bought - price*bought));

		
		*/




	}
}
