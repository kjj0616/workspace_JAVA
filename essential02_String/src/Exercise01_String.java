
public class Exercise01_String {
	public static void main(String[] args) {
		String word = "Ÿ������"; // ��������
		/*
		 * word�� ������ �ִ� char ���� ��ġ�� ��� ���ο� ���ڿ��� �����޶�
		 * 
		 */
		char[] ar = word.toCharArray();
		for (int cnt = 0; cnt < 10; cnt++) {
			int i = (int)(Math.random()*ar.length);
			int j = (int)(Math.random()*ar.length);
			char c = ar[i];
			ar[i] = ar[j];
			ar[j] = c;
		}
		String cword = new String(ar);
		System.out.println(cword);
		
		/* �ȵǳ�.. �������
		char[] c = word.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		char[] cr = new char[c.length];
		boolean find = false;
		int idx = 0;
		for (int i = 0; i < cr.length; i++) {
			int rand = (int)(Math.random()*c.length);
			System.out.println(rand);
		}
		while(idx <c.length) {
			int rand = (int)(Math.random()*c.length);
			for (int i = 0; i < c.length; i++) {
				if(cr[i] == c[rand]) {
					find = true;
					break;				
				}
			}
			if(!find)
				cr[idx++] = c[rand];
		}
				
		String cword = "";
		cword = new String(cr);
		System.out.println(cword);
		*/
	}
}
