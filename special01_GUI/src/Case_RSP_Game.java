import java.util.Scanner;

public class Case_RSP_Game {
	public static void main(String[] args) 	{
		Scanner cin = new Scanner(System.in);
		boolean attack = Math.random()>0.5;
		System.out.println("���� ������? " +attack + " / ������? " +!attack);
		System.out.print("�̹����� ����(��:0, ��:1, ��:2) : ");
		int choice = Integer.valueOf(cin.nextLine());
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
		System.out.println("===========");

		if(choice == auto){
			System.out.println("�ºΰ� ����!");
			if (attack = true){
				System.out.println("������ '��'�� �¸�!, AI�� �й�!");
			}else{
				System.out.println("������ '��'�� �й�!, AI�� �¸�!");
			}
		}else{
			System.out.println("�ºΰ� ���� �ʾҴ�.");
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