import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/*
 * 
 * # Collection �� ��ü���� ũ�� �з��� 4�����̴�. �� �迭���� Ư¡�� ���ݾ� �ٸ���.
 *  (���� �������̽� Interface)
 * 
 *  Collection ��Ӱ迭
 *    - Set �迭 : HashSet, TreeSet, LinkedHashSet
 *    - List �迭 : vector, ArrayList, LinkedList 
 *    - Queue �迭 : ArrayDeque,..
 * 
 *  (+ �߰�)
 *  - Map �迭 : Hashtable, HashMap
 *  
 *  // ����Ÿ�Թ迭 ���� �� ����Ÿ�� ��ü ������ ����
 */

public class Source02_Set {
	public static void main(String[] args) {		
		/*
		 *  Set �迭�� �÷��� ��ü�� Ư¡
		 *   - ���Ͽ��(��ü)�� �ߺ����� �����Ҽ� ���� Ư¡�� ���� ��ü
		 *   
		 *   	: HashSet : ���� ���� (����,����)������ ó��������, ���������� ����.
		 *   
		 *   	: TreeSet : ũ�⿡ ���� ������ ����������, HashSet ���ٴ� ������ ����
		 *   
		 *   	: LinkedHashSet : �������� ����������, HashSet ���ٴ� ������ ����
		 *   
		 *   �� 3�� �ܿ��� Set �� �÷����� �� ����������, �� 3���� ��ǥ���� �͵�
		 */
		Set set;			
			set = new HashSet();
		//	set = new LinkedHashSet();
		//	set = new TreeSet();
		 
		//List[] list = new List[] {}; //ctrl+shift+o --java.util.List
		//Queue[] queue;
			
		//Map map;
		
		// ���÷��ǰ�ü�� ����Ҷ��� � ��ü���� �����Ұ������� �����صΰ� ����ϴ°� ����������,
		// �� �����ϸ�, Object ������ ó���� �ȴ�.
			
		// Set ��ü�� ���
		int size = set.size(); // ����� ��ü ��(�������� ��ü ��)
		System.out.println("size = "+size);
		
		boolean b = set.isEmpty(); // �������� ��ü�� ����? (size==0 ���� Ȯ��)
		System.out.println("isEmpty = "+b);
		
		// ��ü������ ���Ǵ�
		// boolean add(Object o), boolean contains(Object o), boolean remove(Object o)
		
		boolean t1 = set.add("������");
		System.out.println(t1);
		boolean t2 = set.add("������");
		System.out.println(t2);
		
		int[] ar = new int[3];
		boolean t3 = set.add(ar);
		System.out.println("size = "+set.size());
		boolean t4 = set.contains(ar);
		System.out.println("contains = "+t4);
//		set.add("�ݿ���");
		System.out.println(set.contains("�ݿ���"));
		
		System.out.println("remove ? "+set.remove(ar)); //����(�Ѱ��� ��ü�����Ҷ�) ����Ȯ�� true
		
		
		System.out.println("set.size = "+set.size());
		set.clear(); // ��� ��ü���� �� ��������
		System.out.println("set.size = "+set.size());
		
		// ��ü ���尳������ ������ ���� (�ڹ� ���� �޸� limit)
		for (int cnt = 1; cnt <= 100000 ; cnt++) {
			int[] z = new int[5];
			set.add(z);
		}
		System.out.println(set.size());
		
		// �� ��ü�� Ư¡�� ���캸��
		
	}
}
