import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Source03_Set {
	public static void main(String[] args) {
		/*
		 * Set �� ��ü�� ���� Ư¡�� ���캸��
		 *  - ��Ȯ���� ��� �����Ͱ� �����°�?
		 */
		Set set;
		if(Math.random()>0.666) {
			System.out.println("HashSet");
			set = new HashSet();	// ����X, �����Ͱ����ӵ� ����	
		}else if(Math.random()>0.5) {
			System.out.println("TreeSet");
			set = new TreeSet();	// ũ������� ���Ľ��� ��ü�� Ȯ����
		}else {
			System.out.println("LinkedHashSet");  
			set = new LinkedHashSet(); // �� ������ ����, �ߺ��� ����
		}
		//=====================================================================
		System.out.println(set.add("����"));
		System.out.println(set.add("����"));
		System.out.println(set.add("����"));
		System.out.println(set.add("����")); // � set�̵� ������ false (�ߺ�x)		
		System.out.println(set.add("�縶��"));
		System.out.println(set.add("�Ͽ쵷"));
		System.out.println(set.add("����"));
		
		System.out.println("set.size() : "+set.size());
		System.out.println("set.toString() = "+set.toString());
		//��ü�� toString()�ؼ� ���ڿ��� ������ش�. ����� ��ü���� toString()�� ��
		
		//HashSet
		//set.toString() = [����, �縶��, ����, ����, �Ͽ쵷, ����]

		//TreeSet
		//set.toString() = [����, �縶��, ����, ����, ����, �Ͽ쵷]
		
		//LinkedHashSet
		//set.toString() = [����, ����, ����, �縶��, �Ͽ쵷, ����]
		
		// �ϳ��� �̾Ƽ� ��� �ϰ� �ʹٸ�..? ��ü���� ��� �̾Ƽ� ����ϳ�?
		
		// 3���� ������� ��ȸ �Ҽ��ִ�.
		// 1. toArray
		Object[] ar = set.toArray(); //���� ���� ��ü�� �迭�� �Ű��ش�.
		for (int i = 0; i < ar.length; i++) {
			// �� �ȿ� ����� ��ü���� ���� String ��ü���̶��
			String s = (String)ar[i];
			System.out.println(ar[i]+ " : "+s+" / "+s.startsWith("��"));
		}
		
		// 2. Iterator �� Ȯ���ؼ� ó���ϴ� ���
		// 		 : �÷��ǿ� ����� ��ü�� �����Ҷ� ����ϴ� Ŀ�� ��ü
		Iterator i = set.iterator(); //java.util.
			// Iterator ��ü�� hasNext(), next(), remove()
		for (int cnt = 1; cnt <= 6; cnt++) {
			System.out.println(i.hasNext());//����ĭ�� ��ü���� �ִ��� boolean������ ����
			Object o = i.next();			//Ŀ���ʱⰪ , �̵�(����), ���������� next���� ����
//			i.remove(); //
			System.out.println(o);
		}
		System.out.println("set.isEmpty? "+set.isEmpty());
		//================================================================
		// ���� ����ϴ� ���
		for( Iterator ii = set.iterator(); ii.hasNext() ; ){
			String o = (String)ii.next();
			System.out.println(o+"//"+o.startsWith("��"));
		}
		
		// 3. enhanced for (Iterator�� �ڵ� �����ؼ� �����ִ� for)
		for (Object obj :  set) {
			System.out.println("=="+obj+" / "+(obj instanceof String));	
			
		}
	}
}
