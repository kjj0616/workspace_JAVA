import java.util.Scanner;

/*
 * String ��ü
 * 	�� é�Ϳ��� ���캼 ��ü�� ���ڿ��� ���õ� ��ü���̴�.
 *  ���� ù��° �˾ƺ� ��ü�� String �̴�.
 *  
 *  ���ڿ��� new ���� �����Ǵ� Ư���� ������ ��ü�� (�⺻�������� ����),
 *  ���� String ��ü�� ���ڿ��� ���ο� char[] ���·� ������ �ϰ� �ִ�.
 * 
 */
public class Source01_String {
	public static void main(String[] args) {
		// String ��ü�� ������ �����
		char[] c = new char[] {'��','��','��','��'};
		System.out.println(c);// char[] �迭�� ��½� ���ڰ����� ��µȴ�.
		
		String s = new String(c); // ��ü char[]�� �� ����ؼ� �����,
		System.out.println(s);
		String s1 = new String(c, 1,2); // char[], �迭 ���۰�, ����
		System.out.println(s1);
		// String �������� ���ڿ� ��ü���� ���� �ִ�.
		String s2 = new String(c, 0, 4); // ������ �����ϸ� ���α׷� ������ ����
		System.out.println(s2);
		System.out.println(s == s2); //false, ���� ��ü�� �ƴ�
		//----------------------------------------------------------------------
		String r = s.intern(); // intern pool(String pool)�� ���ڿ��� ��� (=="")
		System.out.println("s code = "+System.identityHashCode(s));
		System.out.println("s code = "+System.identityHashCode(s));
		System.out.println(r == s);	
		// intern()�� c1�Ʒ��� ������ r ==s �ƴ϶� r ==c1�� true�� ���.
		// �� String��ü�� �������ִ� char[]�� ���� ������ ��� �ִ� String ��ü��
		// ã���ִ°�, ������ ����� ��.
		
		// new ���̵� String ��ü�� ��������µ�,
		String c1 = "���α׷�";
		//intern()�� c1�Ʒ��� ������ r ==s �ƴ϶� r ==c1�� true�� ���.
		
		//""���� ������ ���ڿ��� �����ϰ� �Ǹ� �˾Ƽ� String ��ü�� ������ �ǰ� ���ְ�,
		// ������� ��ü���� String ������ ����ȴ�.
		String c2 = "���α׷�";
		System.out.println("c1 = "+c1+" / c2 = "+c2);
		System.out.println(c1==c2); //true ? why?
		// �ֵ���ǥ�� �̿��ؼ� ǥ���Ͽ� �ڵ� �����ǰ� �Ǵ� ���ڿ� ��ü����,
		// ���� JVM�� ���Ͽ� ������ �ǰ�, ���߿� �̹� �ѹ��̶� ������� ��ü����
		// �ٽ� ������ ���ϰ�, �ش� ��ü���� �ٽ� ��Ȱ��ȴ�.
		
		/*
		 * System.identityHashCode(); JVM�� ���Ͽ� �ο��� ���� ��ü���� �˾Ƴ��� ���
		 *  
		 *  "" ����� literal String�̶�� �Ҹ���µ� "���α׷�" ��� ���ڿ���
		 *  intern pool �̶�� ���� �����ϰ� ������ �ٽ� ������ ���ڿ��� ����ɶ���
		 *  cache �� ���ڿ��� �����Ѵ�
		 */
		System.out.println( System.identityHashCode(s) );
		System.out.println( System.identityHashCode(s2) );
		System.out.println( System.identityHashCode(c1) );
		System.out.println( System.identityHashCode(c2) );
		
		System.out.println(s == c1);
		
		
		// String ��ü��, ���� �������� char[]�� ���� ���ڵ�� ������ ���ִٰ� �ϴ���,
		// == ���� ��ü�İ� �����, false�� ��� �ִ�.(Ư����쿡�� true��� ����)
		
		Scanner cin = new Scanner(System.in); //ctrl+shift+O : import java.util.Scanner
		String input = cin.nextLine(); // ������Է����κ��� ���� String ��ü�� ��������
		//input.intern(); ���ϴ°� ��õ
		System.out.println(input =="1q2w3e"); 
		// "" �̷��� ǥ���ϴ°� JVM�� String ��ü�� ���� �����ؼ� ����
		// ��ü�񱳰� �Ͼ�� ������ false��
		
		// ���� ��ü������ �ñ��Ѱ� �ƴ϶�, char[] ���� ��ü�� ���İ� ����� ������,
		    //equals �� ������ �صξ��� ������ ������ ����� ��밡��
		/* --- String.class ---
			    public boolean equals(Object anObject) {
			        if (this == anObject) {
			            return true;
			        }
			        if (anObject instanceof String) {
			            String anotherString = (String)anObject;
			            int n = value.length;
			            if (n == anotherString.value.length) {
			                char v1[] = value;
			                char v2[] = anotherString.value;
			                int i = 0;
			                while (n-- != 0) {
			                    if (v1[i] != v2[i])
			                        return false;
			                    i++;
			                }
			                return true;
			            }
			        }
			        return false;
		*/
		System.out.println(input.equals("1q2w3e"));
		System.out.println("1q2w3e".equals(input)); // �� 1
		
		String[] ar = new String[5];
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]==null);
		}
		
		// String ��ü�� ����� ���� ���캸��.
		
	}
}
