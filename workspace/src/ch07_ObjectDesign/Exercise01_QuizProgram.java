class Exercise01_QuizProgram {
	public static void main(String[] args)	{
		/*
			1. Stage ��ü�� 2�� ���� �غ� ���ѵνð�
			(�����ڷ� ��ü�� player �����صΰ�)
		*/
		Stage user = new Stage("�����");
		Stage com = new Stage("��ǻ��");
		/*
			2. �ݺ� ������ while�� �صδµ� (for����)
			Stage�� round�� 10�� �ɶ����� �۵��ǰ� ����
		*/
		while (Stage.round<10){
			Stage.execute();
			System.out.println(Stage.current());
			
			long t1 = System.currentTimeMillis();
			// String a1 = Integer.valueOf(System.console().readLine());

			String a = System.console().readLine("1:");
			int a1;
			switch(a){
			case "": a1 = 0; break;
			default: a1 = Integer.valueOf(a);
			}


			long t2 = System.currentTimeMillis();
			user.cheak(a1);
			System.out.println((t2-t1)/1000L);
			//System.out.println(((t2-t1)/1000L); 
			//ms -> s�� ��ȯ Ȯ�� ????
			int coma = 0;
			if((t2-t1)/1000L>3){
				coma += Stage.answer;
				com.cheak(coma);
				System.out.println("2:"+coma);
			}else{
				if(Math.random()>0.5){
					coma += Stage.answer;
					com.cheak(coma);
					System.out.println("2:"+coma);
				}else{
				coma += (Stage.answer-10);
				com.cheak(coma);
				System.out.println("2:"+coma);
				}
			}

			System.out.println(user.status());
			System.out.println(com.status());		
			System.out.println();
		}

		if (user.score>com.score){
			System.out.println(user.player+" �¸�!");
		}else if(user.score<com.score){
			System.out.println(com.player+" �¸�!");
		}else{
			System.out.println("���º�!");
		}
		System.out.println();
		/*
			3. �ݺ��� ���鼭 ó��������, Stage ���� ���� ������ְ�
			����ڷκ��� �Է¹޾Ƽ� cheak �����ְ�,
			��ǻ�ʹ� ����ڰ� 3�� �̳��� Ǯ�� 
				���� answer���� 10 �������� üũ������ �Ϻη� Ʋ���� ���ְ�
			3�� �ʰ��Ǹ� answer ������ cheak ������ ������ ���߰� ����

			����ڰ�ü�� ��ǻ��ó����ü���� cheak�� �Ѵ� �ϰ� ���� ������ status()�� �̿��ؼ�
			���� ���������� ���� ������ ���
		*/
		/*
			4. �ݺ��۾��� �̿��ؼ� 10 round ���� �۾��� �ϸ�, �������ڸ� ���
		*/

	}
}
