/*
 * String ��ü�� ���ִ� �͵�...
 */
public class Source03_String {
	public static void main(String[] args) {
		/*
		 * �ٸ� ���ڿ���ü�� ���ؼ� �񱳰���� �˷���
		 */
		
		// 1. boolean equals(Object) : ���ڱ����� ������ Ȯ��
		
		// 2. boolean endsWith(String) : boolean StartWith(String)
		//	  - �ش� ���ڿ��� ������ �Ѵٰų�, �����ٰų�
		
		// 3. int compareTo(String) : ũ��� / abc�������� ������ ������ ���ڰ� Ŀ��
		
		// 4. boolean matches(String) : Ư�� ����(���Խ�)�� �����ϴ��� Ȯ��
		
		String[] names = "����,����,����,Ȳ��,���ĵ�,����,�縶��,������,�Ͽ쿬".split(",");
		for (int i = 0; i < names.length; i++) {
			String s = names[i]; //names[i]�� �ص� �ǰ�
			System.out.println(s + "..."+ s.equals("����"));
			System.out.println("	..."+ s.startsWith("����")+"..."+s.endsWith("��"));
			System.out.println("    ..."+s.compareTo("����")); // s - "����"
			// �ڱⰡ ���� ���ڿ������� �� ������ ����, ������ 0 , ũ�� ���
			System.out.println(" .. "+s.matches("��[��-�R]{1}"));
		}
		
		// ���Խ�?
		
		
	}
}
