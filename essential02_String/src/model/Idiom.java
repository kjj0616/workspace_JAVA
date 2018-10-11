package model;

public class Idiom {
	static char[] ar;
	static {
		ar = new char[] {'��','��','��','ȸ','ȣ','��','õ','��','��','��','��','��'};
	}
	String answer;
	String hint;
	
	public Idiom(String answer,String hint) {
		this.answer = answer;
		this.hint = hint;		
	}
	
	public Idiom(String[] a, String[] h) {
		int num = (int)(Math.random()*a.length);
		String answer = a[num];
		String hint = h[num];
		this.answer = answer;
		this.hint = hint;
	}
	public Idiom(String[][] input) {
		this(input[0],input[1]);
	}
	
	public String mixChars() {
		// 6���� ���ڿ��� ����� �Ǵµ�,
		// ���� answer ���ڿ��� 4���ڴ� �ݵ�� ����,
		// ������ 2���ڴ� static���� ������ ar���� 2�� �̾Ƽ� ���ڿ��� ������ش�.
		char a = ar[(int)(Math.random()*(ar.length-1))];
		char b = ar[(int)(Math.random()*(ar.length-1))];
		String rs = answer + a + b;
		System.out.println(rs);
		char[] ans = rs.toCharArray();				
		for (int cnt = 0; cnt < 10; cnt++) {
			int i = (int)(Math.random()*(ans.length));
			int j = (int)(Math.random()*(ans.length));
			char c = ans[i];
			ans[i] = ans[j];
			ans[j] = c;	
		}
		String result = new String(ans);
		return result;	
		
	}
	public String mixChars_A() {//techers A
		char[] s = new char[6];
		for (int i = 0; i < answer.length(); i++) {
			s[i]= answer.charAt(i); //0,1,2,3			
		}
		s[4] = ar[(int)(Math.random()*ar.length)];
		s[5] = ar[(int)(Math.random()*ar.length)];
		for (int cnt = 0; cnt < 10; cnt++) {
			int i = (int)(Math.random()*(s.length));
			int j = (int)(Math.random()*(s.length));
			char c = s[i];
			s[i] = s[j];
			s[j] = c;	
		}
		return new String(s);
	}
	
	public boolean mark(String input) {
		if(input.equals(this.answer))
			return true;
		return false;
		
		//input.toCharArray();
		//answer.toCharArray(); ..?
		
		//���� one line
		//return answer.equals(input);
	}
	@Override
	public String toString() {
		// answer ù���ڿ� hint�� ���ļ� ���ڿ���
		
		return this.hint+" : "+answer.substring(0,1)+"???";
						 	  //answer.charAt(0)
	}
	
}
