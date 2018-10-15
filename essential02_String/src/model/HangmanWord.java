package model;

public class HangmanWord {
	//hang man game
	//���ϼ��� F2 �̸�����
	
	int life;
	String answer; //char[]
	StringBuilder builder; //char[] (boolean[]) �� ó���ص� ���� 
	
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
		case 5: str.append("[����������]"); break;			
		case 4: str.append("[��������]");	break;
		case 3: str.append("[������]");	break;
		case 2: str.append("[����]");	break;
		case 1: str.append("[��]");	break;
		default: str.append("You Are DEAD!");			
		}
		return str.toString();	
		
		/* teachers A
		  
		StringBuilder heart = new StringBuilder();
		for (int i = 1; i <= life; i++) {
			heart.append("��");
		}
		return heart.toString();
		
		//return builder.toString()+ "(life : " +life+")";
		
		//�޸𸮹���
		//String heart="";
		//heart ++"��";
		  
		 */
	}
	
	public boolean mark(char c) {
		/* teachers A
		 
		// answer�� c ������ ��ġ�� ã�Ƽ� bulider���� ĭ�� �ش繮�ڸ� ����
		char[] ar = answer.toCharArray();
		boolean find = false;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] == c) {
				builder.setCharAt(i,c);
				find =true;
			}
		}
//		for (int i = 0; i < answer.length(); i++) {
//			if(answer.charAt(i)==c) {
//				builder.setCharAt(i,c);
//				find = true;
//			}
//		}
		if(find) {
			return true;
		}else {
			life--;
			return false;
		}
		
		*/
			
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
		
//		//builder.equals(answer) ��ü�񱳵�(override�ȵ�) ����
//		return builder.toString().equals(answer);
		
		return new String(builder).equals(answer);
	}
}
