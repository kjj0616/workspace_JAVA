class Source12_LoopControll {
	public static void main(String[] args)	{
		/*
			���η��� loop���� continue�� ��Ű�µ� ��ü loop�� ������ �ְ� �ʹٰų�
			���η��� loop���� break�� ��Ű�µ� ��ü loop�� ���߰� �Ѵٰų�
			switch �ȿ��� loop�� ���ߴ� break�� �ؾ��Ѵٸ�...?

			labeled loop (named loop)
		*/

		a : 
		while(Math.random()>0.1){
			System.out.println("main - loop ����");

			b :
			for(int cnt=1;cnt<=5;cnt++){
				if(Math.random()>0.75){
					System.out.println("�ܺη��� continue");
					continue a;
				}else if(Math.random()>0.75){
					System.out.println("���η��� continue");
					continue b; // break; ��� ��� ��
					
				}
				System.out.println("���η��� "+cnt);

			}
			System.out.println("main - loop ȸ����");
		}
		System.out.println("...");

	}
}
