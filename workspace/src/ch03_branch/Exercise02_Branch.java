class Exercise02_Branch {
	public static void main(String[] args) 	{
		
		//Ư�������� ���� �ֽ��� ����/���� ���
		System.out.println("[StockHelper] START");

		System.out.print("[StockHelper] Price> ");
		int p = Integer.valueOf(System.console().readLine());
		System.out.println("[StockHelper] input data is " + p);

		// ũ�� branch�� ��������. ���������� ó���� branch�� �׷��� ���� branch
		// 1,000�̻� ~ 5,000�̸��� 5������
		// 5,000�̻� ~ 10,000�̸��� 10������
		// 10,000�̻� ~ 50,000�̸��� 50�� ����
		// 50,000�̻� ~ 100,000�̸��� 100�� ����
		/*
		if (p>=1000 && p<5000 && p%5==0){
			System.out.println("[StockHelper] 1000���̻� 5000�� �̸� 5������");
		}else if(p>=5000 && p<10000 && p%10==0){
			System.out.println("[StockHelper] 5000���̻� 10000�� �̸� 10������");
		}else if(p>=10000 && p<50000 && p%50==0){
			System.out.println("[StockHelper] 10000���̻� 50000�� �̸� 50������");
		}else if(p>=50000 && p<100000 && p%100==0){
			System.out.println("[StockHelper] 50000���̻� 100000�� �̸� 100������");
		}else{
			System.out.println("[StockHelper] ERROR");
		}
		*/
		// &&, || �ΰ��� ���� ���Ǹ� && ����� �� ������
		if ((p>=1000 && p<5000 && p%5==0) ||
			(p>=5000 && p<10000 && p%10==0) || 
			(p>=10000 && p<50000 && p%50==0) ||
			(p>=50000 && p<100000 && p%100==0) ){

			System.out.println("[[StockHelper] data handle. start wait plz");

			if(p>=1000 && p<5000 && p%5==0){
				
			}else if(p>=5000 && p<10000 && p%10==0){

			}else if(p>=10000 && p<50000 && p%50==0){

			}else if(p>=50000 && p<100000 && p%100==0){

			}

		}else{
			System.out.println("[[StockHelper] invakud data");
		}
		// 30�ۼ�Ʈ ����� ��� �ִ�ġ, 30�ۼ�Ʈ �϶��� �϶��ִ�ġ
	}
}
