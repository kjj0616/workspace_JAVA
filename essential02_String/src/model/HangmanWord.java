package model;

public class HangmanWord {
	//hang man game
	//파일선택 F2 이름변경
	
	int life;
	String answer;
	StringBuilder builder;
	
	public HangmanWord(String a) {
		this.answer = a;
		life = 5;
		builder = new StringBuilder(answer);
		for (int i = 0; i < builder.length(); i++) {
			builder.setCharAt(i, '?');
		}
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(builder+" ");
		switch(life) {
		case 5: str.append("[♥♥♥♥♥]"); break;			
		case 4: str.append("[♥♥♥♥]");	break;
		case 3: str.append("[♥♥♥]");	break;
		case 2: str.append("[♥♥]");	break;
		case 1: str.append("[♥]");	break;
		default: str.append("You Are DEAD!");			
		}
		return str.toString();
	}
	
	public boolean mark(char c) {
		boolean flag = false;
		char[] ans = answer.toCharArray();
		for (int i = 0; i < ans.length; i++) {
			if(c == ans[i]) {
				builder.setCharAt(i,c);
				flag = true;
			}			
		}
		if(flag)
			return true;
		else
			life--;
		return false;
	}
	
	public boolean isRevealed() {
		
		return new String(builder).equals(answer);
	}
}
