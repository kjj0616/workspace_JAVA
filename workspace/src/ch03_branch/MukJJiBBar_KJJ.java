class MukJJiBBar_KJJ {
	public static void main(String[] args) 	{
		/*
			����ڰ� ��ǻ�Ͱ��� ����� �����ϴ� ����� ������ �ٽ� branch �۾�

			����� ���ӱ����� �������Ѿ� �Ǵ� �����ʹ� ���ݱ���(������)
		*/
		boolean attack = Math.random()>0.5;
		System.out.println("���� ������? " +attack + " / ������? " +!attack);
		System.out.print("�̹����� ����(��:0, ��:1, ��:2) : ");
		int choice = Integer.valueOf(System.console().readLine());
		//==================================================================
		int auto = (int)(Math.random()*3); // 0, 1, 2
		System.out.println("\n===========");
		//System.out.println("AI�� ���� : " + auto);
		System.out.print("���� ���� : ");
		// String [] mode = new String[] {"��","��","��"};		
		switch(choice) {
		case 0:System.out.println("��"); break;
		case 1:System.out.println("��"); break;
		case 2:System.out.println("��"); break;
		}
		System.out.print("AI�� ���� : ");
		switch(auto) {
		case 0:System.out.println("��"); break;
		case 1:System.out.println("��"); break;
		case 2:System.out.println("��"); break;
		}
		
		/*
		if(choice==0) {
			System.out.println("��");
			switch(auto){
			case 0: System.out.println("AI�� ���� : ��"); break;			
			case 1:	System.out.println("AI�� ���� : ��"); break;	
			case 2: System.out.println("AI�� ���� : ��"); break;				
			}
		}else if (choice==1){
			System.out.println("��");
			switch(auto){
			case 0: System.out.println("AI�� ���� : ��"); break;			
			case 1:	System.out.println("AI�� ���� : ��"); break;	
			case 2: System.out.println("AI�� ���� : ��"); break;	
			}
		}else {
			System.out.println("��");
			switch(auto){
			case 0: System.out.println("AI�� ���� : ��"); break;			
			case 1:	System.out.println("AI�� ���� : ��"); break;	
			case 2: System.out.println("AI�� ���� : ��"); break;	
			}
		}
		*/
		/*
		switch(choice){
			case 0: 
				switch(auto){
				case 0:
					System.out.println("��");
					System.out.println("AI�� ���� : ��");
					break;
				case 2:
					System.out.println("��");
					System.out.println("AI�� ���� : ��");
					break;
				case 3:
					System.out.println("��");
					System.out.println("AI�� ���� : ��");
					break;
				
				}
				break;
			case 1:
				switch(auto){
				case 0:
					System.out.println("��");
					System.out.println("AI�� ���� : ��");
					break;
				case 1:
					System.out.println("��");
					System.out.println("AI�� ���� : ��");
					break;
				case 2:
					System.out.println("��");
					System.out.println("AI�� ���� : ��");
					break;
				}
				break;
			case 2:
				switch(auto){
				case 0:
					System.out.println("��");
					System.out.println("AI�� ���� : ��");
					break;
				case 1:
					System.out.println("��");
					System.out.println("AI�� ���� : ��");
					break;
				case 2:
					System.out.println("��");
					System.out.println("AI�� ���� : ��");
					break;
				}
				break;
			}
			*/
		System.out.println("===========");

		if(choice == auto){
			//���ӿ���
			System.out.println("�ºΰ� ����!");
			//���ݱ�Ȯ�� -> ���� �¸�
			// �� if �ȿ��� if - else�� ������ ���ڸ� �ٸ��� ����ϴ� �۾� ����
			if (attack = true){
				System.out.println("������ '��'�� �¸�!, AI�� �й�!");
			}else{
				System.out.println("������ '��'�� �й�!, AI�� �¸�!");
			}
		}else{
			System.out.println("�ºΰ� ���� �ʾҴ�.");
			// ���ݱ�
			// �� else branch �ȿ���, branch�� ���� ����,
			// ���ݱ��� �����ϰų�, ���ݱ��� �ٲ����� �Ѵ�.
			// �����߿� ���ų�, �����߿� �̰�ų� - > ���ݱ��� ��������
			if( choice==0 && auto==2|| choice==1 && auto==0|| choice==2 && auto==1 ) {
				if(attack == true) { 
					attack = !attack ;
					System.out.println("���ݱ��� �ٲ����.");
					System.out.println("���� ������? " +attack + " / ������? " +!attack);
				}else 
					System.out.println("���ݱ��� �ٲ��� �ʾҴ�.");	
			}else if( choice==0 && auto==1 || choice==1 && auto==2 || choice==2 && auto==0  ){
				if(attack == false) {
					System.out.println("���ݱ��� �ٲ����.");
					attack = !attack;
					System.out.println("���� ������? " +attack + " / ������? " +!attack);
				}else 
					System.out.println("���ݱ��� �ٲ��� �ʾҴ�.");					
			}else {
				System.out.println("���ݱ��� �ٲ��� �ʾҴ�.");
				System.out.println("���� ������? " +attack + " / ������? " +!attack);

		
			}
		}						
	}
}
	/*
		�� boolean ���� ture false ������ ���� !!

	if (attack){ //true
	
	}else{ // false
	
	}


	*/