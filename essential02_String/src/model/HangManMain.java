package model;

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
		System.out.println("HangmanGame Started");
				
		while(!g.isRevealed() && g.life!= 0) {
			System.out.println(g.toString());
			System.out.print("�빮�� 1���� �Է� : ");
			String as = c.nextLine();
			StringBuilder re = new StringBuilder();
			
			if (as.matches("[A-Z]")) {
				if(re.indexOf(as) == -1) {
					re.append(as);
					System.out.println(g.mark(as.charAt(0)));
				}else {
					System.out.print("�̹� �Է��� ���� = ");
					//for (int i = 0; i < re.length(); i++) {
					//	System.out.print(new String(re));
					//}
					// ������...ing
				}
			}else {
				System.out.println("�빮�� 1���� �Է� : ");
			}
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
	}
}
