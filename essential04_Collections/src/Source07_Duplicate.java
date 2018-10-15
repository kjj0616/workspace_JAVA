import java.util.LinkedHashSet;
import java.util.Set;

public class Source07_Duplicate {
	public static void main(String[] args) {
		/*
		 * Set �� �÷����� �ߺ���ü�� �������� �ʴ´�.
		 *  (��ü���� �޶� � ������ �����ϸ�, ���� ��ü�� �ν��Ѵ�.)
		 *  : integer ��ü�� �װ� ó���� �Ǿ��־ �׷���.
		 */
		Set<Integer> s = new LinkedHashSet<>();
		s.add(3);	//Boxing�Ǽ� Integer ��ü�� ����ȴ�.
		s.add(Integer.valueOf(3));
		s.add(new Integer(3));
		System.out.println(s.size());
		
		Integer i1 = new Integer(31);
		Integer i2 = new Integer(31);
		System.out.println(i1==i2);
		System.out.println(s.add(i1));
		System.out.println(s.add(i2)); // i2��ü�� ������ �ִٰ� �Ǵ�����
		System.out.println(i1.equals(i2));
		// equals �� ����� ���� hashCode�� ���Ƽ� ������ü��� �ν���
		// hastCode�� ��ü�� �����ɶ� �ο��Ǵ� ����������ε�,
		// Integer ��ü ���� ���� �ؽ��ڵ带 �ܺο��� Ȯ���Ҷ�,
		// �ڵ�� ����ϰ� �صξ���  (Override) hashCode() ----> Object
		System.out.println(System.identityHashCode(i1)+ ", "+System.identityHashCode(i2));
		
		/* cf)
		
			���� hashCode()�޼ҵ带 ȣ���ؼ� hashCode�� ������ �Ǻ��Ѵ�.
			
			���� hashCode�� ������ equals �޼ҵ带 �����غ��� ������ �Ǻ��Ѵ�.
			
			���� ���� ������, �� ��ü�� ���� �������̹Ƿ� equals�޼ҵ带 �������� �ʴ´�.
			
		*/
		
		// �ڹٿ��� ���� �����ϴ� ��ü�� ���� ��쿣 �̷��� ó���� �صа͵��� ������,
		// �����ڰ� �ʿ信 ���ؼ� �����ϴ� ��ü�� ��쿣 �������� ó���� �صξ�� �Ѵ�.
		// ���..?
		
	}
}
