import java.util.HashMap;
import java.util.Map;

/*
 * �÷����� ��ü�� Map�迭�� ���ؼ� ���캸��
 *   Map�� �ٸ� �÷���(Set,List,Queue�迭)���� ������ ���� �ٸ���.
 *   �� ���� 3���� ��ü���� �����ϱ� ���ؼ� add�� ��ü���� �Ѱ��ָ� �Ǿ���.
 *   Map�迭�� ��ü���� �ѱ�°� �ƴ϶�, ��ü���� �ο��� Key���� ���� �����ؼ� ������Ѿ� �Ѵ�.
 *   ���߿� ��ü�� ����ų�, �� Ȯ���ؾߵǴ� ��Ȳ�� �ο��ߴ� Ű���� ���ȴ�.
 *  
 *  ���� ��ü�� �����ϸ鼭 Ű�� �����ϴµ�,
 *   �� Ű�� �̹� ���ǰ� �־��ٸ�, ��������� (���ϵ�)
 *   
 *  ��ǥ���� Map �� ��ü�δ� Hashtable, HashMap, TreeMap, LinkedHashMap �� �ִ�.
 *   ������ ���̴� Key�� ������ �ִ�.
 *   
 */
public class Source13_Map {
	public static void main(String[] args) {
		// Ÿ�Լ����� �ΰ����� �ʿ�. 
		// �ϳ��� ������ ��üŸ��, �ٸ��ϳ��� Ű�� �� ��üŸ���̴�.
		Map<String, String[]> map = new HashMap<>();
		 //<ŰŸ��, ����Ÿ��>
		System.out.println(map.size()); 	// int size() : �������� ��ü
		System.out.println(map.isEmpty());  // boolean isEmpty() : �����ϰ� �ִ� ��ü ����?
		
		String[] a = "����,����,�ÿ�,����".split(",");
		
		// ��ü ������ put
		map.put("f",a);				//���� Key��ü, �ڰ� value��ü
		map.put("F",a);
		System.out.println(map.size()); //2
		
		//�� Key�� ��ü Ȯ���� ������ ���ȴ�.
		String[] got = map.get("f");
		System.out.println(got + " / "+got[0]);
		String[] got2 = map.get("F");
		System.out.println(got2 + " / "+got2[1]);
		
		map.remove("t");
		//Key�� ����� �Ű�, �ش� Ű�� ��ϵ� ��ü�� ��� ������ �߻����� �ʴ´�.		
		
		String[] got3 = map.get("F");  //Ű�� ����� ��ü�� ������ null
		System.out.println(got3+" / "+(got3==null));
		
		String[] b = "����,�Ͽ�,����".split(",");
		map.put("f", b);			// ��ü����� ���� Key�� put�� �Ǹ� �������
		String[] got4 = map.get("f");
		System.out.println(got4[0]);
		
		// Key�� ���ؼ��� ��ü���� �����Ҽ�����
		// ���� Key�� ���ؼ� �����͸� �����ص� �����߻��� ����.
		// �������� ������ ������ Ȯ���۾��� �ʿ�,
		// but, null���� ���� key�� Ÿ��� �۾��� �����Ϸ��� ������ �߻��Ѵ�.
		
		map.clear();
		System.out.println(map.isEmpty());
		
	}
}
