/*
 * 
 */
public class Source06_StringBuilder {
	public static void main(String[] args) {
		/*
		 * StringBuilder ��ü
		 * :����ϰ��� �ϴ� ���ڿ��� ȿ�������� �������� �Ҷ� ����ϴ� ��ü
		 * 
		 *  �⺻������ ��ü�ȿ� ������ ����� String �� ���� �����
		 *  �߰����� ��ɵ��� �ִ�.
		 *  
		 *  �ٸ� ���� �ִٸ� 
		 *  ���ο� ������ �ִ� char[] �迭�� ���ڸ� �����Ҽ� �ְ� �����ϸ�,
		 *  									���̵� �˾Ƽ� ������ �ȴ�.
		 *  
		 */
		
		/*
		 * ��ü ������ �⺻(�Ű�����)���̵� ����, int�� �ǰ�, String�� ��
		 */
		StringBuilder sb = new StringBuilder("String"); 
		System.out.println(sb.length()); 	// int : ������ �ִ� ���ڿ��� ����
		System.out.println(sb.capacity());  // int : ���ڿ��� ����� ���ؼ� ������ char[]ũ�� (default=16)
											// StringBuilder (int) 		- �ʱ� char[] ����ũ�� ����
											// StringBuilder (String)   - ���ڿ�ũ�� +�⺻16ũ�� char ���� �� String����
		
		System.out.println(sb.append("String")); //���ο� ���ʴ�� ���� +6
		System.out.println(sb.toString());		 // ����� �ִ� ���ڿ��� String ȭ �����ش�.
		sb.append("Builder");
		sb.append(true); 						 // �����͸� ���ڿ�ȭ �ؼ� char[] �迭�� �ǵڿ� �ٿ�����
		
		System.out.println(sb.toString());
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		//===============================================================
		String str = "";
		System.out.println(System.identityHashCode(str));
		str += "String";
		System.out.println(System.identityHashCode(str));
		str += "Builder is ";
		System.out.println(System.identityHashCode(str));
		str += true; 										//���������� ���ڿ�ȭ ���Ѽ� ����
		System.out.println(System.identityHashCode(str)); 	// ��ü���� ��� �ٲ�
		System.out.println(str);
		
		// String��ü�� �ѹ� �����Ǹ� ������ �Ұ�����, ���������� ��� ���� �����Ǵ� ��
		
		// Immutable Class - String
		
		// String���� ���� ��Ư�� ����� �ִ�.
	}
}
