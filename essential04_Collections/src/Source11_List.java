import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class CustomComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// o1��ü�� �۴ٰ� ó���ϰ� �ʹٸ� -1
		// o1��ü�� ũ�ٰ� ó���ϰ� �ʹٸ� 1
		// o1��ü�� o2��ü�� ũ�Ⱑ ���ٰ� ó���ϰ� ������ 0
		int c = o1.compareTo(o2);
		return c < 0 ? -1 : (c > 0 ? 1: 0);
	}
}
class ParseComperator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		Integer i1 = Integer.parseInt(o1,2);
		Integer i2 = Integer.parseInt(o2,2); //���ں��� ��� 2���Ľ����� �ʾƵ� ����
		int c = i1.compareTo(i2);
		return c < 0 ? -1 : (c > 0 ? 1: 0);
	//	or
	//	return i1-i2;
			
	}
}

//===================================================================
// Set�� �ٸ��� List�� �������̻� �ѷ��� ��������ҷ� ������ �ʴ´�.
public class Source11_List {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("111");
		li.add("101");
		li.add("10");
		li.add("100");
		li.add("110");
		li.add("1001");
		li.add("111");
		System.out.println(li.toString()); //[111, 101, 10, 100, 110, 111]
		System.out.println("contains? "+li.contains("101")); //true
		String data = new String("10");
		System.out.println("contains? "+li.contains(data)); //true
		//List �迭�� contains �� indexOf ��ü �Ǻ��Ҷ� equals�� ����Ѵ�. (hashCode�Ⱥ�)
		
		System.out.println("indexOf..."+li.indexOf(data)); // equals(value�� ����)
		System.out.println(li.get(2) == data); //false, ���� ������ü�� �ƴ�
		System.out.println(li.get(2).equals(data)); //true
		
		// List�ȿ� ����� ��ü�� ������ ��ų���� �ִµ�, ��ü��ü�� compareTo�� ���Ǵ°� �ƴ϶�,
		// ũ��񱳸� �� ��ü�� �����ؼ� �Ѱ���� �Ѵ�.
		// ���� ���, String ��ü���� ����ִ� List�� Ư���������� ������ �ϰ� �ʹٸ� �� ��ü(class)����
		
// 		class Ŭ�����̸� implements Comparator<E>{
//			@Override
//			public int compare(String o1, String o2) {
//				return 0;
//			}
//		}
		
		// iterator ���, inhanced for���, + �߰��� ���ٹ�Ŀ� ���
		
		Comparator<String> c = new CustomComparator();
		li.sort(c);
		// == li.sort( new CustromComparator() );
		for (int idx = 0; idx < li.size(); idx++) {
			String m = li.get(idx);
			System.out.println("-->"+m+" / "+Integer.parseInt(m,2)); //2���� �Ľ�			
		}
		System.out.println();
		Comparator<String> b = new ParseComperator(); //���ڿ� �޾Ƽ� 2�����񱳷� �����Ұ�!
		li.sort(b);
		for (Iterator i = li.iterator(); i.hasNext();) {
			String d = (String) i.next();
			System.out.println("-->"+d+" / "+Integer.parseInt(d,2));
			
		}
		
		// �⺻ ���� ��� (Custom��ü�� �ƴ� ��쿡)
		// Collections.sort(li);
		// or
		// li.sort(null);
		
		//######### List���� �⺻���� �� ���� sort(����)�� �ʿ��� ��� ##########
		
		//######### Comparator�� �񱳱����� �ʿ��Ҷ����� class�� �����ؼ� ���� ###########
		
		// 	----->	List�� �� ���� ���ǹǷ� �� �˾Ƶ� �ʿ伺�� ����
		
	}
}
