package ch04_loop;
class Source03_While {
	public static void main(String[] args)	{
		/*
			do ~ While �̶�� �������ε� loop ������ �����ѵ�,
			while�� �ٸ�����,
			�������Ŀ� �ݺ� ���࿩�θ� �����ȴ�.

			do {�ݺ���-�ϴܽ���}while(����);
		*/
		int viewer = 0; //���� while���̾������� 0�϶� �ƿ� ���� X ������ 
		String str = "";
		int cnt = 0;

		do{				//do~while��  �ּ� 1���� ������ �ȴ�.
			cnt++;
			str = (viewer%10) +str;
			viewer /= 10;
			
			System.out.println("[Loop] str =	"+str+"	/ viewer =	"+viewer+"	/ cnt = " +cnt);

			if (cnt%3==0 && viewer!=0) //viewer>0
				str = "," + str;
		}while(viewer >0 );

		System.out.println("str = " +str);
		System.out.println("");
		//===============================================================
		/*
			Ư�����ǿ��� do ~ while���� ���� �ڵ尡 ���������� Ư���� �ִ�.
			-�ϴ� ������ �����ϰ� ������ ������ ���
		*/

		char c1, c2, c3;
		// char �� ���� 3���� ���ĺ�(�빮��)�� �����صΰ� �ʹ�.
		// ���δ� �ٸ� ���ĺ����� ������ �Ϸ��� ��.
		// �ϴ� c1, c2 ,c3 : 'A'~ 'Z' �߿� �������ڸ� �����ؾߵ�.
		// c1==c2 || c1 ==c3 || c2 == c3 �� ��Ȳ�̶�� �ٽ��ѹ��� loop�� �����ؾ� �Ѵ�.
		
		do{	
			
			c1 = (char)('A'+(int)(Math.random()*('Z'-'A'+1)) );
			c2 = (char)('A'+(int)(Math.random()*('Z'-'A'+1)) );
			c3 = (char)('A'+(int)(Math.random()*('Z'-'A'+1)) );
			
			//c/[1-3] = (char)('A'+(int)(Math.random()*('Z'-'A'+1)) ); ??
			System.out.println("do - loop excuted");

		}while(c1==c2||c1==c3||c2==c3); // do{}while() ; ����

		System.out.println(c1 + ","+ c2 + ","+ c3);
		System.out.println("");

	}
}
