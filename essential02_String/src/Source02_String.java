/*
 * String ��ü�� ó�����ִ� ���
 */
public class Source02_String {
	public static void main(String[] args) {
		String str = "����ʰ�";
		// ������ char[] �迭�� ���� ������ ��� �ش�.
		
		int len = str.length(); // �迭ũ�� : ���ڿ� ũ��
		System.out.println(len);
		char c = str.charAt(0);
		System.out.println("c ="+c);
		System.out.println(c == '��');
		
		char[] ar = str.toCharArray();
		// �ڽ��� ������ �ִ� ���ڰ��� �迭�� ��Ƽ� ���Ͻ�����
		for (int i = 0; i < ar.length; i++) {
			System.out.println(i+" : "+ar[i]);
		}
		//===============================================================

		// # ��ġ ã���ֱ� - indexOf, lastIndexOf
		
		int s1 = str.indexOf('��');
			//�ش繮���� ��ġ ,(������ -1, �������� ù��° ã�� ������ index�� ����)
		System.out.println("s1 = "+s1);
		
		int s2 = str.indexOf("����"); // ���ڿ��� ã������.
		System.out.println("s2 = "+s2);
		
		// lastIndexOf(char), lastIndexOf(String)		
		int s3 = str.lastIndexOf('��');
		System.out.println("s3 = "+s3);
		
		// indexOf, lastIndexOf �� �� Ž������(���ڿ�), int�� ������ �ϳ� �� �����ѵ�,
		// Ž�� ������ġ�� �����Ҽ� �ִ�. 
		// (default : indexOf (0)ĭ����, lastIndexOf (length-1) ���� Ž��)
		
		int s4 = str.indexOf('��',3);
		System.out.println("s4 = "+s4);
		
		//===============================================================

		// # �����ϱ� - substring, split, replace, trim
		
		// substring(int b), substring(int b,int g)
		//  : �ڱ��� �迭���� �Ϻκ��� �����ؼ� String ��ü�� ����������
		
		String b1 = str.substring(1,4); // 1<= <4
		System.out.println("b1 = "+b1);
		
		String b2 = str.substring(2);	// 2<= ������
		System.out.println("b2 = "+b2);
		
		// String[].split(String) : Ư�����ڿ��� �������� char[]�� ��� string[]�� �������
		String data ="����ʰ�,ǳ����ȭ,����糭,���󰡻�,��ȭ����";
		String[] arr = data.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// String.replace(char oldchar,char newchar) : �ڽ��� char���߿� Ư�����ڸ� �����ؼ� String�� ������Ŵ 
		// String.replace(String,String) : 
		String r1 = data.replace(',','-');
		System.out.println(r1);
		String r2 = data.replace("ǳ����ȭ","????????");
		System.out.println(r2);
		
		// String.trim() : ù���ڰ� ������ ������ �����, ������ ���ڵ��� ������ �����ؼ� ���ο� ���ڿ��� ����
		String p = "   �ƹ��ų� �ۼ� �غ���!!  ";
		System.out.println("["+p+"]");
		String tp = p.trim();
		System.out.println("["+tp+"]");
	}
}
