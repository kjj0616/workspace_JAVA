/*
 * 	Wrapper ��ü�� ������� Ȱ��Ǵ���?
 * 
 */
import java.util.LinkedHashSet;

public class Exercise01_Wrapper {
	public static void main(String[] args) {
		/*
		 *  LinkedHashSet �� Collection(=��ü�� �����ϴ� �뵵) ��ü�� �ϳ���,
		 *   ������ü��(Ȥ�� equals ��� true)�� ������ ���ϰ� ���谡 �Ǿ��ִ�.
		 */
		
		// �ٷ� �������� ����, �� ��ü�� ���� � ��ü���� ó���Ҳ��� ������ �ؾ��Ѵ�.
		// < > �ȿ� ��üŸ�� ����, 
		// �⺻������ ����Ұ�, ��ü���� ���尡��, �迭 ���
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for (int cnt = 0; cnt <= 15; cnt++) {
			int n = 1+(int)(Math.random()*15);
			System.out.print(cnt + " 's pick = "+n);
			//boolean b = set.add(n); // ���强�����ΰ� ����, ����ڽ����� Integer�� ��ȯ�Ǿ� ��
			// boolean b = set.add(Integer.valueOf(n));
			boolean b = set.add(new Integer(n));
			System.out.println(" / add result = " +b);
			// ��� ��ü���� equals�� ������ 
			//  �������� ���� �ź�false, �ƴϸ� ����true
		}
		System.out.println(set.toString()); //����� ������� ���
		// ������ �ִ� �����͸� ���ڿ��� �������
		
		// �� �ܿ��� �� �߰����� ����� �ִµ�, Collection �� ��ü�� �ٷ궧 ���Ե� ����
		
		// ������ Wrapper ��ü�� ��� ����� �Ǵ��� ���� �Ѿ�� �ȴ�. 
	}
}
/*
 *  ���� ���� HangmanWordMain ��
 *   char�� ��üŸ���� �����Ҽ� �ִ� LinkedHashSet�� �������Ѽ�
 *   ����ڰ� �Է��� ���ڸ� mark������ ����, add ���Ѽ� true �� �߸� mark ��Ű��
 *   false�� �߸� �̹� �Է��� ���ڶ�� �˷��ְ�, �̶����� �Է��� ���ڵ��� ���� �� ���
 *   ���ڰ�ü�� ������ LinkedHashSet ���� 
 */ 
