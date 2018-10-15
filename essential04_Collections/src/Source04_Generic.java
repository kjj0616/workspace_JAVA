import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * �÷��� ��ü�� ��üŸ���� �����ϰ� ����ϴ� ���� �����Ѵ� (���ʸ� ������ �Ҽ��ְ� �صξ���)
 * 
 * ���ʸ��� ����ϰ��� �ϴ� Ÿ���� ������Ž�� ���������� �ְ� ����ó�� �صа��� ���ϴ� ���̴�.
 * (�������� ������ Object�� ó�� ��)
 */

class Box<E>{
	E one;
	E other;
	
	boolean	setData(E e) {
		if(one==null) {
			one = e;
			return true;
		}else if(other==null) {
			other = e;
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "one = "+ one + ", other = "+ other;
	}
}

public class Source04_Generic {
	public static void main(String[] args) {
		Box b = new Box();
		// boolean setData(Object e) �� ó���ȴ�
		Box<String> bb = new Box<String>(); //����ڰ� ó��Ÿ���� ����
		bb.setData("33");
		//����ó���� - ����ڰ� �����ؼ� ��� - �����ϴܰ迡�� ������ ��
		//bb.setData(1); �̹� ���ʸ������� �ؼ� �����Ǿ����Ƿ� �Ұ�
		
		// �����ϰ� ����� ��� ����?
		Set<String> filter = new HashSet<>(); // �ڴ� ������ �ص� �ȴ�. new HashSet<String>(); �ᵵ ��
		//filter.add(3);
		filter.add("MON");
		filter.add("MON");
		// �� Ÿ�Ը� ������ �ǰ�
		// Iterator�� ���ٰų�, enhanced for�� ������ �ٷ� ���尴üŸ������ ��ü���� �������� �ִ�.
		// -->Casting�� ���ص� ��
		Iterator<String> it = filter.iterator();
		while(it.hasNext()) {
	//		Object o = it.next(); //�̼����� Object�� �޾Ƽ� casting�������
			String m = it.next();	
			System.out.println(m+ "..."+m.charAt(0));
		}
	//	for (Object o : filter) // �̼�����
		for (String o : filter) {
			System.out.println(o+ "..."+o.charAt(1));
		}
	}
}
