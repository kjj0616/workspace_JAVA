import java.util.Set;
import java.util.TreeSet;

/*
 *	Exercise02_Card ���� ,
 *  LinkedHashSet�̳� hashSet�� �̿��ؼ� Card ��ü�� ó���ϸ� ���ٸ� ������ ������,
 *  TreeSet ��ü�� �̿��ؼ� Card��ü�� �����ϸ� ó������ error�� �߻��Ѵ�.
 *  
 *  TreeSet �� ũ��� �������ĵǼ� �����͸� Ȯ���Ǵ� Set��ü�ε�,
 *  ���� ��ü������ ũ�Ⱑ ���� ������, ũ��񱳰� ������ ��ü�� ���ؼ��� ������ �ǰ�,
 *    
 *  TreeSet ��ü��, hashSet / equals �� �ߺ���ü��� �Ǵ��ϴ°� �ƴ϶�
 *  
 *  ũ��񱳰���� 0�϶� ������ü�� �ν��� �Ѵ�
 */
public class Source09_Duplicate {
	public static void main(String[] args) {
		Set<Double> ds = new TreeSet<>();
		Double d1 = new Double(3.14);
		Double d2 = new Double(3.13);
		System.out.println(ds.add(d1)); 
		
		System.out.println(ds.add(d2)); 
		System.out.println(d2.compareTo(d1));
		//�� �۾��� TreeSet���� add�� �ɶ� ���ϰ� return ����� ���
		// -1�̸� �տ� ���� 1�̸� �ڿ� ����
		System.out.println(ds.toString());
		
		String s1 = "����";
		String s2 = "����";
		int n = s1.compareTo(s2); // s1-s2�� ������ ������ �ϸ� �ȴ�.
		System.out.println(n); 
		//���� TreeSet�� �� �ΰ�ü�� ��������� ������� ����
		
		Integer n1 = 3;
		Integer n2 = -1;
		int n3 = n1.compareTo(n2);
		System.out.println(n3);
		
		
		Card p1 = CardShop.random();
		Card p2 = CardShop.random();
		//System.out.println(p1-p2); //��ü���� ���°��� �Ұ���
		
		//TreeSet�� ��ü�� ũ��񱳰����ϰ� ����
		// p1.compareTo(p2); �����ϰ�
	}
}
