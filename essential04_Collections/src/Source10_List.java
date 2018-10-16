import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * Set�� �÷����� ���캸�Ҵµ�,
 *  �� �÷����� �ߺ������͸� �����ϸ鼭 ��ü�� ������� ���ѵ�,
 *  ���߿� �� ���վȿ��� Ư����ü�� ���̷�Ʈ�� Ȯ���ؼ� ����ϱ� �����.
 *  
 * �̹��� ���캸���� �ϴ� List�� �÷�����
 *  ��ü���� �������شٴ� �� ������, �ߺ���ü�� �����ϰ� �Ǿ��ְ�,
 *  Ư����ü�� ��ġ�� �˷��ְ�, ��ġ�� �ȴٸ� �ٷ� ��ü�� Ȯ���Ҽ� �ִ�.
 *  
 * �⺻���� ����� Set�� �÷��ǰ� ����ϴ�.
 */
public class Source10_List {
	public static void main(String[] args) {
		List<String> li;
									// 1.0  <->  1.2
		//	li = new Vector<>(); //(Vector�� �÷����� ���� �Ǳ������� �ִ� ��ü, �迭 ���)
		//	li = new ArrayList<>(); // (�÷����� �����ϸ鼭 Vector�� �������� �������Ѽ� ������ ��ü, �迭���)
			
		//	li = new LinkedList<>(); // (Vector�ʹ� �ٸ����·� ��ü�� �����ϰ� ����� ��ü --�迭����� �ƴ�)
			
			// � Ư¡�� ����� ��ü������ List�� �÷����� ��� �۵��ϴ����� �˾ƺ��� ���캸��
		
		li = new Vector<>();
		System.out.println(li.size());
		System.out.println(li.isEmpty());
		
		String s = "�÷���";
		System.out.println("add ="+li.add(s));
		System.out.println("contains = "+li.contains(s));
	//	System.out.println("remove = "+li.remove(s));
		
		System.out.println("add ="+li.add(s)); // �ߺ� ��ü�� ����ǰ� ����Ǿ� ����
		System.out.println("add ="+li.add(s));
		System.out.println("add ="+li.add("collection"));
		System.out.println("add ="+li.add(s));
	//  li.Clear();
		
		System.out.println("size = "+li.size()); // contains �����ؼ� �ߺ����� ������
		li.iterator();
		for (String m : li) {
			System.out.println("--"+m);
		}
	//  ���� index ó���� �صּ�, ��ü��ġ�� ã������ �ְ�
		int idx = li.indexOf("collection");
		System.out.println("idx = "+idx );
	//	��ġ�� �ȴٸ�, �� ��ġ�� �ش��ϴ� ��ü�� �ٷ� �������� �ִ�.
	//   - index ���� 0���� �����Ǿ��ְ�, �������� index ������ Error�߻�
		String m = li.get(0);	//������ ����
		System.out.println(m);
		
	//	���� index�� ���ؼ�, set, add, remove �� �Ҽ� �ִ�.
		System.out.println("size = "+li.size()); //size = 5
		li.set(0, "set");
		System.out.println("size = "+li.size()); //size = 5
		System.out.println(li.get(0));
		System.out.println(li.toString());
		li.add(2, "HashSet"); 	//add�� ���� ������ �ƴ� �߰��� �ǰ� idx�� �и��� �ȴ�.
		System.out.println("size = "+li.size()); //size = 6
		System.out.println(li.toString()); //[set, �÷���, HashSet, �÷���, collection, �÷���]
		li.remove(4);
		System.out.println(li.toString()); //[set, �÷���, HashSet, �÷���, �÷���]

		//������ �ִ� �Ϻκ��� List�� ����Ҽ��� �ִ�.
		List<String> sub = li.subList(1, 4); // 1 <= x < 4
		System.out.println(sub.toString()); //[�÷���, HashSet, �÷���]
		
		sub.set(0,"totoro"); //sub�� ���� �޾� �����ϴ��� ���� List�� ������ �ȴ�.
		
		System.out.println(li.toString()); //[set, totoro, HashSet, �÷���, �÷���]
		
		
		// ���� index�� ��ȭ�� ���ٸ�,  Vector or ArrayList�� ���� ������ ����,
		// �߰� index�� �����Ǿ��ִ� ��ü�� ������ �������ٰų�,
		// �߰��� add�� �Ǵ� ��Ȳ�� ���ٸ� LinkedList �� ������ ����.
		
		// �迭����� �⺻�迭ũ�� ��� ��� �÷����� ����(�迭�� ���)
		// �߰� ������ ���� �߰����� �߶� ���̴� �۾��� �ʿ�(ó���۾�����)
		// LinkedList �� ���� �����迭�� �ּҰ��� �ٲٸ� �Ǳ⶧���� ����
		
	}	
}
