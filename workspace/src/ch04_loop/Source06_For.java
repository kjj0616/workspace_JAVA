class Source06_For {
	public static void main(String[] args)	{
		/*
			loop �� �����ϱ� ���ؼ� while �̳� for ������ �̿��� ������ �����ϴ�.
			�̶������� while loop�� �̿��ϴ� ����� ���캸�Ұ�,
			for loop�� ����ϴ� ����� ��Ȳ�� ���ؼ� �˾ƺ���.

			for loop�� while +(loop ���۽� ó������ + �� loop�� �ؾߵ���) ��
			�Ѳ����� �����Ҽ� �ְ� �ص� �����̴�.
		*/

		int sum = 0;
		int data = (int)(Math.random()*10000);
		int data2 = data;
		while(data>0){ //while �� ���Ǻκ��� ���� ����
			sum += data%10;
			data /= 10;
			System.out.println("������ : "+data);
		}
		System.out.println("while loop �� ... "+ sum);
		//================================================================
		int sum2 = 0;
		// (   [loop���۽�����];   [����]; [�� loopó������ ����] ){ }
		// �� ��Ҹ� �̿��ϴ� �� ����(��������)
		// for �� ���Ǽ��� ���������� ���ѷ���?
		for( System.out.println("������"); data2>0 ; System.out.println("���ڸ�ó���Ϸ�, ������ "+data2)){
			sum2 += data2&10;
			data2 /= 10;
		}
		System.out.println("for loop ��.... "+sum2);
		/*
			��κ��� ��� for ���� ���� ���º��ٴ� �ٸ����°� ���� ����� �ȴ�.
		*/
	}
}
