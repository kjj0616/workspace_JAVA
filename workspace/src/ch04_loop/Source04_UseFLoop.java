package ch04_loop;
class Source04_UseFLoop {
	public static void main(String[] args)	{
		/*
			loop�� �̿��ؼ� �ʿ��� �����͸� Ȯ���ϴ� �Ϻκп��� �̿��غ��Ҵµ�,
			���α׷��� ��ü �帧�� �����µ��� ����� �ȴ�.

			���� ��� ����� ������ �������, 
			����� �Է¹ް�, ó���ϰ�, �Ϲٲ��ִ� �۾��� ũ�� loopó���ϸ� �ϼ��ȴ�.

			ex flag ���� �������� ���, ������ ����Ǵ� ��Ȳ���� flag���� �����ϸ� �ȴ�.
		*/
		boolean flag = true;
		boolean attack = Math.random()>0.5;

		System.out.println("���� �����! - �ڻ쳻�� AI");
		System.out.println();

		System.out.println((attack ? "���":"AI")+"�� �������� �����մϴ�.");

		do {
			System.out.print("�̹����� ����(��:0, ��:1, ��:2) : ");
			int choice = Integer.valueOf(System.console().readLine());
			if ( choice !=1 || choice !=2 || choice !=3){
				System.out.println("�ٽ�");
				continue;
			}
			int auto = (int)(Math.random()*3); // 0, 1, 2
			System.out.println("\n==============");
			System.out.print("���� ���� : ");
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
			System.out.println("==============\n");

			if(choice == auto){
				System.out.println("�ºΰ� ����!");
				if (attack){
					System.out.println("������ '��'�� �¸�!, AI�� �й�!");
				}else{
					System.out.println("������ '��'�� �й�!, AI�� �¸�!");
				}
				flag = !flag;
			}else{
				System.out.println("�ºΰ� ���� �ʾҴ�.");
				if( choice==0 && auto==2|| choice==1 && auto==0|| choice==2 && auto==1 ) {
					if(attack) { 
						attack = !attack ;
						System.out.println("���ݱ��� �ٲ����. -> AI�� ����");
					}else{
						System.out.println("���ݱ��� �ٲ��� �ʾҴ�. "+(attack ? "��":"AI")+"�� ����!");	
					}
				}else if( choice==0 && auto==1 || choice==1 && auto==2 || choice==2 && auto==0  ){
					if(attack) {
						System.out.println("���ݱ��� �ٲ��� �ʾҴ�. "+(attack ? "��":"AI")+"�� ����!");
					}else{
						attack = !attack;
						System.out.println("���ݱ��� �ٲ����. -> ���� ����");
					}											
				}else {
					System.out.println("���ݱ��� �ٲ��� �ʾҴ�. "+(attack ? "��":"AI")+"�� ����!");			
				}
			}	
		}while(flag);
	}
}
