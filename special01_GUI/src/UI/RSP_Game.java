package UI;

import java.util.Scanner;

public class RSP_Game {
	int choice;
	int auto;
	boolean attack;
	boolean isRun;

	void start() {		
		isRun = true;
		attack = Math.random()>0.5;
	}
	
	int[] input() {
		//System.out.println("AI�� ���� : " + auto);
		//System.out.print("���� ���� : ");
		// String [] mode = new String[] {"��","��","��"};		
//		switch(choice) {
//		case 0:System.out.println("��"); break;
//		case 1:System.out.println("��"); break;
//		case 2:System.out.println("��"); break;
//		}
//		System.out.print("AI�� ���� : ");
//		switch(auto) {
//		case 0:System.out.println("��"); break;
//		case 1:System.out.println("��"); break;
//		case 2:System.out.println("��"); break;
//		}		
		auto = (int)(Math.random()*3);
		int [] rst = {choice, auto}; 
		return rst;
		
	}
	String tell() {
		String str;
		if(choice == auto){
			str = "�ºΰ� ����! \n";
			if (attack){
				str +="������ '��'�� �¸�!, AI�� �й�!\n";
				isRun = false;
			}else{
				str +="������ '��'�� �й�!, AI�� �¸�!\n";
				isRun = false;
			}
		}else{			
			str = "�ºΰ� ���� �ʾҴ�.\n";
			if( choice==0 && auto==2|| choice==1 && auto==0|| choice==2 && auto==1 ) {
				if(attack == true) { 
					attack = !attack ;
					str +="���ݱ��� �ٲ����. \n";
				}else 
					str +="���ݱ��� �ٲ��� �ʾҴ�.\n";	
			}else if( choice==0 && auto==1 || choice==1 && auto==2 || choice==2 && auto==0  ){
				if(attack == false) {
					str +="���ݱ��� �ٲ����.\n";
					attack = !attack;
				}else 
					str +="���ݱ��� �ٲ��� �ʾҴ�.\n";					
			}else {
				str +="���ݱ��� �ٲ��� �ʾҴ�.\n";	
			}
		}
		return str;
	

	}	
}