class Exercise01_Procedure {
	/*
		���ν��� ��� �����ؼ� �װ� ���� �۵��ϴ� ���α׷��� �ϳ� ������.
		�����ٿ� ?
			����ߵǴ� ���ڴ� �������ְ�,
			����ڷκ��� �Է¹޾Ƽ� ����ڰ� �Է��� ���ڰ� ���� ��ǥ���� �������ڴ� Ȥ�� �������ڴ�
			��°� �˷��ָ鼭 ���ڸ� ���߰� �����ϴ� ���� ����
		
		������ �����ʹ� ��ǥ����, ����, �õ��� ȸ�� �� �����Ϸ��� ��.
	*/
	// 1~200 ������ �������� ������ ��� : 1-0, int random(){...}
	// Ư������ ������ ���������� ������ ��� : int random(int n1, int n2){...}
	// �� ���߿� ū���� ������ִ� ��� : int greater(int n1, n2){...}
	// �� ���߿� �������� ������ִ� ��� : int less(int n1, int n2){...}
	// �����ϳ��� ������ ��� : int handle(String data, int min, int max){...}

	/*
			int input;
			switch(input){
			default:
				input = Integer.valueOf(input);
				break;
			case "":
				input = random(min,max);
			}
	*/

	static int random(){
		//return (int)(Math.random()*201); //ERROR
		return 1 + (int)(Math.random()*200);
	}
	static int random(int n1, int n2){
		return n1+(int)(Math.random()*(n2-n1+1));
	}
	/*	
		############################���� ���� ���� �����ϱ�################################

		= firstNumber + (int)(Math.random() *         numberCount	     );
		= firstNumber + (int)(Math.random() * (lastNumber+firstNumber+1) );

		###################################################################################
	*/
	static int greater(int n1, int n2){
		if (n1>n2)	return n1;
		else		return n2;
		// return n1 > n2 ? n1 : n2;   <- ���׿��� �����ϰ� ���� (���ǹ� ? A : B;)
	}
	static int less(int n1, int n2){
		if (n1>n2)	return n2;
		else		return n1;
	}
	static int handle(String data, int min, int max){// ""(enteró��) switch�� ó�� ��õ (if �ȵȴٳ�)
		switch (data){
		default :
			return Integer.valueOf(data);
		case "" :
			return random(min,max);
		}
		/*
		###########################################
		if(data=="") return Integer.valueOf(data);
		else return random(min,max);
		###########################################
		-> ERROR
		*/
	}


	public static void main(String[] args)	{
		
		int min = 1;
		int max = 200;
		int target = random();
		int tried = 0;
		//----------------------------------------------------
		System.out.println("[SYSTEM] UP_AND_DOWN");
		while(tried<10){
			System.out.println("[SYSTEM] "+ (++tried)+" tried ("+min+" - "+max+") : " );
			String in = System.console().readLine();
			int got = handle(in,min,max);
			/*
			if(got == -1){
				got = random(min,max);
			}
			==>�� ������ Enter�Է��ϸ� ó���Ҽ��ְ�
			*/
			if(got == target){
				System.out.println("[SYSTEM] CORRECT VALUE !!! "+ target);
				break;
			}else if(got<target){
				System.out.println("[SYSTEM] TARGET VALUE is GREATER THEN "+got);
				min = greater(got, min);
			}else {
				System.out.println("[SYSTEM] TARGET VALUE is LESS THEN "+got);
				max = less(got, max);
			}
		}
		/*
			19:30 Time Limit
			
			���⼭ �۾��ߴ��� �������,
			��ǻ�Ϳ� ���� �� ���� ���߱�� �ٲ��ֽø� �˴ϴ�.

				1. ����� �Ǵ� ���� ����ڿ� ��ǻ�Ͱ� �ٸ��� �����ش޶�. (������)
				 -�������� �ϳ��� �� �ʿ����� ������

				2. ������Ϻ��� ó���� �ϰ�, ����ڽ¸�? ������? �ƴϸ� �����Ͽ� ���� ���߸� ������?
				 ����ڰ� ���߸� ������ �Ҳ��� �ƴϸ� ��ǻ�Ϳ��� ��ȸ�� �ѹ� �� �༭ ���ºη� �߰�
				 �Ұ����� ���� ����

			UpDown_KJJ.class �� ���� �ϼ��Ǹ� ���ε�
				 




		*/


	}
}
