import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Source14_Map {
	public static void main(String[] args) {
		Map<Integer, String[]> map = new HashMap<>();
		/*
		 * �� �ȿ� ���尴ü�� �����Ҷ�,
		 *  put, remove, get �� ���� ���� put����, remove�� �Ȱ��� Ȯ���Ϸ��� ���Ϻ����� ������ �ȴ�.
		 *  ó������� valueŸ������ �߻��Ѵ�. ������ �ִ� ������ ��µ�.
		 *  �� ��ü�� ���� �Ǵ��� �� �� �ִ�.
		 *  
		 *  �ƴϸ�, boolean containsKey(Key) Ư��Ű�� ���ǰ� �ִ����� Ȯ�ΰ���
		 *  put �ϱ� ���� üũ�ؼ� ������ ����put, ������ �����
		 *  get �ϱ� ���� üũ�ؼ� ������ ��ϰ�ü ���°�, �ִٸ� ����
		 *  remove �ϱ� ���� üũ�ؼ� ������ ���� ����, ������ ���� 
		 */
		
		String[]a = map.put(2, new String[] {Integer.toString(2,2),"��","��","�","two","��"} ); // �Ϻ����Է� : �� + right_ctrl(or����Ű);
		System.out.println(a == null); // ����put�̸� �� Key�� ����� value�� ���� ���� null�̹Ƿ�
		String[]b =map.put(1, new String[] {"��","�ϳ�","��","one","����"} ); 
		System.out.println(b == null); // ����put�̸� ���� ���� null�̹Ƿ�
		map.put(3, new String[] {"��","��","߲","three","����"} ); 
		map.put(4, new String[] {"��","��","��","four","��"} ); 
		map.put(5, new String[] {"��","�ټ�","��","five","��"} ); 
		map.put(6, new String[] {"��","����","�","six","��"} ); 
		
		
		//1���� 99������ ���ڸ� Ű�� �ؼ� �װ� ǥ���ϴ� ���ڿ� �迭�� 2~3���� put
		
		Integer key = 2;
		String[] obt = map.get(key);
		if(obt == null) {
			
		}else {
			System.out.println(key+"�� Ű���ϴ� String[] ");
			for (String m : obt) {
				System.out.println("=>"+m);
			}
		}
		
		String[] abc =map.remove(1); 
		System.out.println(abc);
		System.out.println("contains = "+map.containsKey(1));
		/*
		 * containsKey�� ����ϰ� containsValue�� ����
		 */
		boolean f = map.containsValue(new String[] {Integer.toString(2,2),"��","��","�","two","��"});
			// equlas ������ ����·� ���ִ� ��ü�Ŀ� ����, ��ü���� �޶� true�� ���ü��� �ִ�.
		
			// cf# containsKey�� � Map�� ����ϳĿ� ���� ��ü���� �޶� ���ϰ�ü�� �ǴܵǼ� true�� ���´�.
			//		hash -> hashCode, equals ,  TreeMap -> equals
			//      hashMap�� key�� hashSet���� ����
			//      LinkedHashMap -> key�� LinkedHashSet���� ����
			// equals, hashCode, compare..�� ��� �����Ǿ��ִ°��� ���� �޶���
		
			// Hash�迭�� key ���� hashSet���� �����ϰ� �����Ǿ�����
		
		System.out.println(f);
		
		/*###########################################
		 
		  *** Map �� ������ ��¹ް��� �ϴ� ��� ***
			
			1. map.keySet();		--Only key
			
				=> return [ Set	]
				
			2. map.values();		--Only value
			
				=> return [ Collection ]
				
			3. map.entrySet();		--Key + Value
			
				=> return [ Set<Entry<K, V>> ]	
								
		*///#########################################
		
		
		// Map���� �����Ǵ� ��� ��ü�� Ȯ���غ����� �ϸ�, keySet()�� ����,
		// Ű �ݺ�ó���ϸ鼭 ��ü�� Ȯ��
		Set<Integer> k = map.keySet();
		System.out.println(k);
		for (Integer i : k) {		//	for( Integer i : map.keySet() )
			System.out.println(i +"..."+map.get(i));			
		}
		
		// � Key�� �����ִ����� ���� �ǰ�, ��ü�鸸 �� ����ϰ� ������
		Collection<String[]> vs = map.values(); 
		//�ֻ��� Collection���� ��ȯ��
		for (String[] s : vs) { 	//	for( String[] c : map.values() )
			System.out.println(s);
		}
		
		System.out.println(map.toString());
		
		// entrySet()
		
		// Entry�� ���ʸ��κ� ������ Map�̶� �����ϰ� ����
		Set<Entry<Integer,String[]>> eset = map.entrySet();
		for (Entry<Integer, String[]> e : eset) {
			System.out.println("=> "+e);
			Integer ek = e.getKey();
			String[] ar = e.getValue();
			System.out.print(ek);
			System.out.println("---"+ar);
		}		
	}
}
