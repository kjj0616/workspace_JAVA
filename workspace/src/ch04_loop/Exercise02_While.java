class Exercise02_While {
	public static void main(String[] args)	{
		/*
			�ϻ��� ��..?

			132 ==ok
			1+3+2 ==> 6
			132%6=0
			
			ex 90 27 
		*/
		System.out.print("[main] input number = ");
		int data = Integer.valueOf(System.console().readLine());
		// while ������ �ؼ� �� �ڸ��� ���� ���

		// �� ���� data�� ������ ������ Harshad number
		//				  �ƴϸ� not Harshad number  - if else branch process

		// ������ data ������ �ʿ���

		int r0 = data;
		int sum = 0;
		while(r0 !=0){
			sum += r0%10;
			r0 /=10;
			System.out.println("[Loop] input number = "+r0+", sum = "+sum);
		}
		//if r0 = 0; break;
		System.out.println("[main] �� �ڸ����� �� = "+sum);

		if (data%sum==0){
			System.out.println("[main] input number = "+data+" is Harshad number.");
		}else {
			System.out.println("[main] input number = "+data+" is not Harshad number.");
		}
	}
}
