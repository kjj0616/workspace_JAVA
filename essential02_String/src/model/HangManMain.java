package model;

import java.util.Scanner;

public class HangManMain {
	public static void main(String[] args) {
		String[] jewals = "DIAMOND,RUBY,EMERALD,PEARL,SAPPHIRE".split(",");
		//주제 정해서, 문자열 만들어서 이걸 가지고 반복을 돌면서
		//HangmanWord 객체 배열을 만드시고, 그중에서 랜덤으로
		//하나의 HangmanWord 객체를 뽑아서 게임이 시작되게 설정
		
		//행맨의 상태 출력
		//입력
		//mark하고 결과 알려주고
		//revealed 될때까지 혹은 life가 있을때까지 반복
		
		/*
		 * 문자를 입력받는 방법은 없고, String으로 받는데,
		 * 이 문자열이 정규식으로 대문자 1개인가 matches 체크해서
		 * 아니면 처리를 하지 말고, 맞을때만 처리해주고,
		 * 맞다면 입력받은 문자열에서 charAt(0); 하면 문자 입력이다.
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
			System.out.print("대문자 1글자 입력 : ");
			String as = c.nextLine();
			StringBuilder re = new StringBuilder();
			
			if (as.matches("[A-Z]")) {
				if(re.indexOf(as) == -1) {
					re.append(as);
					System.out.println(g.mark(as.charAt(0)));
				}else {
					System.out.print("이미 입력한 글자 = ");
					//for (int i = 0; i < re.length(); i++) {
					//	System.out.print(new String(re));
					//}
					// 수정중...ing
				}
			}else {
				System.out.println("대문자 1글자 입력 : ");
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
