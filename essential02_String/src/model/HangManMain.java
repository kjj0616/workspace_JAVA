package model;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HangManMain {
	public static void main(String[] args) {
		String[] jewals = "DIAMOND,RUBY,EMERALD,PEARL,SAPPHIRE".split(",");
		//���� ���ؼ�, ���ڿ� ���� �̰� ������ �ݺ��� ���鼭
		//HangmanWord ��ü �迭�� ����ð�, ���߿��� ��������
		//�ϳ��� HangmanWord ��ü�� �̾Ƽ� ������ ���۵ǰ� ����
		
		//����� ���� ���
		//�Է�
		//mark�ϰ� ��� �˷��ְ�
		//revealed �ɶ����� Ȥ�� life�� ���������� �ݺ�
		
		/*
		 * ���ڸ� �Է¹޴� ����� ����, String���� �޴µ�,
		 * �� ���ڿ��� ���Խ����� �빮�� 1���ΰ� matches üũ�ؼ�
		 * �ƴϸ� ó���� ���� ����, �������� ó�����ְ�,
		 * �´ٸ� �Է¹��� ���ڿ����� charAt(0); �ϸ� ���� �Է��̴�.
		 */
		HangmanWord[] hg = new HangmanWord[jewals.length];
		for (int i = 0; i < jewals.length; i++) {
			hg[i] = new HangmanWord(jewals[i]);			
		}
		int a = (int)(Math.random()*(jewals.length-1));
		HangmanWord g = hg[a];
		
		Scanner c = new Scanner(System.in);
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		LinkedHashSet<Character> mainset = new LinkedHashSet<Character>();
		for (char i = 'A'; i <= 'Z'; i++) {
			mainset.add(i);
		}
		
		System.out.println("HangmanGame Started");
//		StringBuilder re = new StringBuilder();;
				
		while(!g.isRevealed() && g.life!= 0) {
			System.out.println(g.toString());
			System.out.print("�빮�� 1���� �Է� : ");
			String in = c.nextLine();

			// �ٸ� ��� - ���� ���ڸ� ���������� ǥ���� 
			if (in.matches("[A-Z]")) {
				boolean r = set.add(in.charAt(0));
				if(r) {					
					System.out.println(g.mark(in.charAt(0)));
				}
				System.out.print("	���� ���� = ");
				mainset.removeAll(set);					
				System.out.println(mainset);
			}else {
				System.out.println("�빮�� 1���� �Է� : ");
			}
			
//			if (in.matches("[A-Z]")) {
//				boolean r = set.add(Character.valueOf(in.charAt(0)));
//				if(r) {					
//					System.out.println(g.mark(in.charAt(0)));
//				}else if(!r){
//					System.out.print("�̹� �Է��� ���� = ");
//					System.out.print(set.toString()+"\n");										
//				}
//			}else {
//				System.out.println("�빮�� 1���� �Է� : ");
//			}
			
//			if (in.matches("[A-Z]")) {
//				if(re.indexOf(in) == -1) {
//					re.append(in);
//					System.out.println(g.mark(in.charAt(0)));
//				}else if(re.indexOf(in) != -1){
//					System.out.print("�̹� �Է��� ���� = ");
//					System.out.print(new String(re+"\n"));
//										
//				}
//			}else {
//				System.out.println("�빮�� 1���� �Է� : ");
//			}
		}
		if(g.isRevealed()) {
			System.out.println();
			System.out.println("You Win!");
		}else if(g.life==0) {
			System.out.println();
			System.out.println("You Are DEAD");
		}
		System.out.println();
		System.out.println("HangmanGame Terminated");
		
		c.close(); // ������ Ŭ�ν��� ����� ������ �����Ұ�
				   // �ݰ��� �ٽ� �����ص� �ȵǴ� ��찡 ����
		
		/*
		//teacher A
		String[] jewals = "DIAMOND,RUBY,EMERALD,PEARL,SAPPHIRE".split(",");
		HangmanWord[] words = new HangmanWord(jewals.length);
		for (int i = 0; i < jewals.length; i++) {
			words[i] = new HangmanWord(jewals[i]);		
		}
		
		HangmanWord w = words[(int)(Math.random()*words.length)];
		
		Scanner sin = new Scanner(System.in);
		while(w.life > 0) {
			System.out.println(w.toString() + " > ");
			String in = sin.nextLine();
			if(!in.matches("[A-Z]{1}")) {
				System.out.println("Invailed Characteres. Only 1 UpperCase Character.");
				continue;
			}
			char c = n.CharAt(0);
			boolean b = w.mark(c);
			System.out.println("mark result is "+b);
			
			if(w.isRevealed()) {
				break;
			}
			
		}
		*/
		
		
		
		
		
	}
}
