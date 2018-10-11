
public class Source07_StringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("JavaPrograming");
		// ���� String��ü�� �ѱ�鼭 �����ϸ�, toCharArray() �ڽ��� �迭�� ī�Ǹ� �ص�
		
		// �ڽſ��� ������ char[] �� �����Ҽ� �ְ� �صξ���.
		
		char c = sb.charAt(4);	// String�� ó���� ���ִ� ���
		System.out.println(c);
		
		sb.delete(3,6);					 	// delete(����<= <��) char ���� �����ϰ� char[]�� �ڵ�����
		System.out.println(sb.toString()+"/"+sb.length());
		sb.deleteCharAt(0);
		System.out.println(sb.toString()+"/"+sb.length());
		
		sb.insert(5, "BAAAM!");				// insert(������ġidx, ���� ����)
		System.out.println(sb.toString()+"/"+sb.length());
		
		sb.replace(0,4,"?"); 				// replace(����<=  <�� , �ٲ��������)
		System.out.println(sb.toString()+"/"+sb.length());
		sb.setCharAt(5, '��');				// setCharAt(��ġ, char) ����idx��ġ ���� ����
		System.out.println(sb.toString()+"/"+sb.length());
		
		StringBuilder sbb = sb.reverse();	// reverse() ������ ����� ���ϰ�ü ��ȯ
		System.out.println(sb.toString()+"/"+sb.length());
		System.out.println(sbb == sb);
		/*
		 *     @Override
    			public StringBuilder reverse() {
        		super.reverse();
        		return this;
    			}
		 */
		
		// �� ��ü�� Ư���� �� ?
		// - ������ �ϴ� ��ɵ��� ��κ��� ������ StringBuilder �ڽ��� ��ü���� this�� ���Ͻ�Ų��
		
		sb.reverse().insert(3,"12345").reverse(); // ���� �̷� ����� ����
		
		System.out.println(sb.toString()+"/"+sb.length());
		
		// StringBuffer  - jdk 1.0���� ���
		// StringBuilder - jdk 1.5���� ���
		
		// ���� java 8 - 1.8.1.181
		// JDK 1.5 ���� String��ü�� �����Ͻ� �ڵ����� StringBuilder�� ��ȯ�Ǽ� ����
		// ���� ���ɻ��� ���̴� ���� ����
		
		// StringBuffer ��� ��ü�� �ִ�. �̰� StringBuffer �ϰ� ����� �Ȱ���
		// �ڹ� ��â�� �������� �����ϴ� ��ü�̰� �̰� �跮���Ѽ� �����а� StringBuffer
		// �跮�� ���� ��Ƽ������ ���� ����, ��Ƽ������ ����ȭ�� �������� �ʴ´�.
		
		/*
		 * 1. ��Ƽ ������ ȯ�濡�� ���ڿ��� ��ȯ�� ������ ����ϸ� ���� Ŭ������? 
				�� : StringBuffer
				
		   2. ���� ������ ȯ�濡�� ���ڿ��� ��ȯ�� ���� �� ����ϸ� ���� Ŭ������?
				�� : StringBuilder
				
		   3. ���ڿ��� ��ȯ�� ���� �б⸦ ���� �� ��� ����ϸ� ���� Ŭ������?
				�� : String
				
 		   4. String, StringBuffer, StringBuilder ���� ��ü�� ������ �ð��� �޸�
 		      �ڿ��� ���� ���� �ʿ�� �ϴ� Ŭ������?
				�� : StringBuffer
		 */
		//�ٸǰ���
	}
}
