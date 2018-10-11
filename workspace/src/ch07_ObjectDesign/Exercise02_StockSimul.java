class Exercise02_StockSimul {
	public static void main(String[] args)	{
		/*
			1. Player ��ü�� ���鶧 ����� �̸��� �Է�
			 �̰� ���� Player ��ü�� ����, �⺻�ڻ��� 20���� �����ؼ�
		*/
		Stock.turn++;
		System.out.print("����� �� �Է� : ");
		String pName = System.console().readLine();
		Player p = new Player(pName, 200000);
		//p.name
		//p.balance
		/*
			2. Market ��ü�� ����, 
		*/
		Market m = new Market();
		/*
			3. �ݺ��� Player �ڻ� (�ܾ� + �����ֽ��� ��ġ) �� 0���ϰ� �ȴٰų�,
			   7���� �Ѿ�ԵǸ� �۵��� ���߰� ����
		*/
		int val = m.totalValue();
		//System.out.println(p.balance + val);
		while((p.balance + val)>=0 &&  (Stock.turn <8)){
		
			System.out.println(m.s1.current());
			System.out.println(m.s2.current());
			System.out.println(m.s3.current());
			System.out.println(p.current());

			int c, stockNo, cnt ;
			boolean r;
			do{	
				System.out.print("�ֽ� ����(1), �Ǹ�(2), �� ����(�ϳѱ��)(0) : ");
				c = Integer.valueOf(System.console().readLine());
				switch(c){
				case 1 : // buy
					System.out.print("���� �ֽ� -��ȣ �Է� (1~3) : ");
					stockNo = Integer.valueOf(System.console().readLine());

					System.out.print("���� �ֽ� -���� �Է� : ");
					cnt = Integer.valueOf(System.console().readLine());
					
					r = m.buyStock(stockNo, cnt, p);
					System.out.println("==============================================");
					if(r){
						System.out.println("�ż��� ���������� ó���Ǿ����ϴ�.");
					}else{
						System.out.println("�ż��� ó���� �Ұ����մϴ�.");
					}
					System.out.println("==============================================");
					System.out.println(m.s1.current());
					System.out.println(m.s2.current());
					System.out.println(m.s3.current());
					System.out.println(p.current());
					break;
				case 2 : //sell
					System.out.print("�Ǹ� �ֽ� -��ȣ �Է� (1~3) : ");
					stockNo = Integer.valueOf(System.console().readLine());
					System.out.print("�Ǹ� �ֽ� -���� �Է� : ");
					cnt = Integer.valueOf(System.console().readLine());
					r = m.sellStock(stockNo, cnt, p);
					System.out.println("==============================================");

					if(r){
						System.out.println("�ŵ��� ���������� ó���Ǿ����ϴ�.");
					}else{
						System.out.println("�ŵ��� ó���� �Ұ����մϴ�.");
					}
					System.out.println("==============================================");
					System.out.println(m.s1.current());
					System.out.println(m.s2.current());
					System.out.println(m.s3.current());
					System.out.println(p.current());
					break;
				
				}
			}while(c != 0);
			Stock.turn++;
			m.s1.change();
			m.s2.change();
			m.s3.change();
			val = m.totalValue();
		}
		int a = p.balance+val-200000;
		double b = (p.balance+val-200000)/(double)200000;

		System.out.println("==============================================");
		System.out.println("������¥ = "+ (Stock.turn-1));
		System.out.println(m.s1.current());
		System.out.println(m.s2.current());
		System.out.println(m.s3.current());
		System.out.println(p.current());
		System.out.println("ȸ�� �ݾ� = " + (p.balance+val));
		System.out.println("���� �ݾ� = " + 200000);
		System.out.println("==============================================");
		System.out.println("������ = " + a);
		System.out.println("���ͷ� = " + b);

		/*	
			4-1. �ݺ����鼭 �ؾ�����
				- ���� ���Ͽ��� �������� �ֽ� ���¶�, �÷��̾� �ڻ��� ����ְ�

				- �ֽ��� 1)�첫�� 2)�Ȳ��� 3)�ƹ��͵� ���Ҳ��� ������� �Է¸� �޾��ְ�,
				 �� �Է°��� ���� if Ȥ�� switch�� brench ó���Ҽ� �ְ� ������ �����ְ�

				- ���� �� �������� �Ѱ��ּ���
		*/

	}
}
