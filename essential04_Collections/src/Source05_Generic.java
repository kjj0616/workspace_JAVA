import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Source05_Generic {
	static int[] makeArray() {
		int[] ar = new int[3];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = 1 + (int) (Math.random() * 10);
		}
		return ar;
	}

	public static void main(String[] args) {
		Set<int[]> set = new LinkedHashSet<>();
		set.add(makeArray());
		set.add(makeArray());
		set.add(makeArray());
		System.out.println(set.size());
		
		// 3ĭ¥�� �迭�� 3�� ������ �� ����, �� �迭�� int������ ���� ���Ϸ���
		// �迭��ü�� �ϳ��� ���� ó���� �ؾߵǴµ�,
		
		System.out.println(set.toString());
		
		// 1. enhanced for
		
		for (int[] s : set) {
			System.out.println(s);
			for (int i = 0; i < s.length; i++) {
				System.out.println("-> "+s[i]);
			}
		}
		System.out.println();
		
		// 2. enhanced for�� �� �Ʒ����·� �ٲ��� �۵��Ѵ�
		
		for (Iterator<int[]> i = set.iterator(); i.hasNext();) {
			int[] s = i.next();
			System.out.println(s);
			for (int m : s) {
				System.out.println("-> "+m);
			}
			
		}
		String m = "string";
		
		/*
		for (String s : m) {   
			//Can only iterate over an array or an instance of Iterable(�÷���)
		}
		*/
		
		// enhanced for�� ��ȸ������ ��ü�� �迭�� Iterable �ν��Ͻ��� �÷��� ��ü

			
	}
}
