import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercise01_Set {
	public static void main(String[] args) {
		String[] heros = "����,����,����,���,���,����".split(",");
		Set set = new TreeSet();
		for (int i = 0; i < heros.length; i++) {
			set.add(heros[i]);
		}
		System.out.println(set.size());
		//============================================================
		Scanner cin = new Scanner(System.in);
		// �̸� 3���� �Է¹޾ƾߵǴµ�,
		// �� 3���� ��ġ�� �ȵǰ�, heros[] �迭�� �ִ� �����;� �Ѵ�.
		// Set�� Ư¡�� �̿��ؼ� �ذ�
		// �Է��� ���� ��, ���õ� �ο��� ������ְ�,
		// �̼��õ� �̸����� �� ������ּ���
		
		TreeSet sel = new TreeSet();
		while(sel.size()<3) {
			String name = cin.nextLine();
			if(set.contains(name) && !sel.contains(name)){
				sel.add(name);
				set.remove(name);
			}				
		}
		System.out.println("Selected heros : "+sel.toString() );
		System.out.println("NonSelected heros : "+set.toString() );
		
		
		//Teachers A===================================================
		Set pick = new HashSet();
		while(pick.size()<3) {
			System.out.print("�̸�>");
			String in = cin.nextLine();
			if(!set.contains(in)) {
				System.out.println("�߸��� �����Դϴ�. �ִ� �����͸� �Է����ּ���.");
				continue;
			}
			if(pick.add(in)) {
				System.out.println("�߰��Ǿ����ϴ�.");
			}else {
				System.out.println("�̹� �Ͻ� �����Դϴ�.");
			}
		}
		//-----------------------
		Set remain = new HashSet();
		for (Object obj : set) {
			if(!pick.contains(obj)) {
				remain.add(obj);
			}			
		}
		System.out.println("Pick .. ");
		for (Iterator i = pick.iterator(); i.hasNext();) {
			Object o = (Object) i.next();
			System.out.println(" => "+o.toString());			
		}
		System.out.println("remain....");
		Object[] ar = remain.toArray();
		for (int i = 0; i < ar.length; i++) {
			System.out.println("  - "+ar[i].toString());
		}
		//Teachers A===================================================

		
	}
}
