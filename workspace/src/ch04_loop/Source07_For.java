package ch04_loop;
class Source07_For {
	public static void main(String[] args)	{
		/*
			for�� Ư�� ȸ����ŭ loop ó���� �ϴ»�Ȳ �����̳�...
		*/
		for(int cnt=1; cnt<=10; cnt++){
			int r = (int)(Math.random()*5);
			System.out.println("[for loop]"+r);
		}
		// �� Ư¡�� �̿��ؼ�.. �������� ����غ��µ� for loop�� ó���غ���.
		// 2�� 5���� ? 32 , 3�� 4���� ? 81
		
		int number = 1;
		// ���۰��� 1�� , �ʿ���� 3�� 4���� : 3�� 4�� ���ϱ�
		number *= 3;
		number *= 3;
		number *= 3;
		number *= 3;
		System.out.println("number = "+ number);
		
		System.out.print("���� = ");
		int n = Integer.valueOf(System.console().readLine());
		System.out.print("�� ���� =");
		int step = Integer.valueOf(System.console().readLine());
		/*
			for loop ���� int ���� �ϳ� ��Ƽ� 1�� �����صΰ�,
			step ������ŭ 1 �����ص� ������ n�� ���ϴ� �۾��� �Ͼ�� loop����
		*/
		int n2 = 1;
		// for( ) �ȿ��� ���������� �ߴٸ�, for loop�� ������ ������� �ȴ�.
		// for(int c=1, result=1;....)
		for (int i=1 ; i<=step ; i++){ //for�� �ȿ��� ����� ������ �ܺο��� ���Ұ�
			n2 *= n;			
			System.out.println(i+"��° :"+n2);
		}
		System.out.println("value = "+n2);

		
	}
}
