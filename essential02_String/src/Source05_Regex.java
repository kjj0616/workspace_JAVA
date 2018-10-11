import java.util.Scanner;

public class Source05_Regex {
	public static void main(String[] args) {
		/*
		 * ��� ���캻�͵��� �����ϳ��� �����Ѱ��̰�,
		 * 
		 * [Ư���׷�] <���ѹ���>
		 * 
		 * 				?	�ְų� ���ų� {0,1}
		 * 
		 * 				+	1�� �̻� �־�� �ȴ� {1,}
		 * 
		 * 				*	��� �ǰ� �������� �־ �ȴ�. {0,}
		 * 	
		 * 				{n}		��Ȯ�ϰ� ��� �־�� �ȴ�
		 * 
		 * 				{n,}	�ּ��� ��� �־�� �Ѵ�
		 * 
		 * 				{n,m}	�ּ� � �̻�, �ִ� � ����
		 * 
		 */
		String[] s1 = "A1,A-1,B-14,C-".split(",");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]+ " matches "+ s1[i].matches("\\w-?\\d"));
		}
		System.out.println();//---------------
		String[] s2 = "A1,A-1,B-14,C-".split(",");
		for (int i = 0; i < s1.length; i++) {
			//System.out.println(s2[i]+ " matches "+ s2[i].matches("\\w-?\\d+")); //1���̻�
			System.out.println(s2[i]+ " matches "+ s2[i].matches("\\w-?\\d*"));
		}
		System.out.println();//---------------
		String[] s3 = "41��9135,97 ��4539,1��3211".split(",");
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]+ " matches "+ s3[i].matches("\\d{2}\\s?[��-�R]\\d{3,}"));
								// �����޸�����x,������� //����2,����1�־�,�����ϳ�,����3���̻�
		}
		
		Scanner cin = new Scanner(System.in);
//		System.out.println("��� ����ó? (�޴���ȭ ��ȣ) : ");
//		String in = cin.nextLine();
//		System.out.println(in.matches("[0][1]\\d[-]?\\d{4}[-]?\\d{4}"));
								    // "01[01789]-?\\d{3,4}-?\\d{4}"
									//01046148225
									//kyoungho@kgitbank.co.kr
		
		/*
		 *  ������ ©�� . + * ? [ ] { } �̷����� �ǹ̸� ����ִ� �����ε�
		 *  
		 *  �̰� ������ü�� �νĽ�Ű���� \\�� ���̰� ��� 
		 *  
		 *  Ư�������� �׷�ó���� ������ ( )
		 *  (���������) {1,2}
		 *  (���������) +
		 */
		
		System.out.println("���� �̸���? ");
		String addr = cin.nextLine();
		boolean rr = addr.matches("\\w{1,}@\\w{1,}(\\.\\w{1,}){1,2}"); // (.-> �׳� �Է½� ��繮��)
								  // \\w{1,}@\\w{1,}\\.\\w{1,}(\\.\\w{1,})*
		System.out.println("arr = "+rr);
	}
}
