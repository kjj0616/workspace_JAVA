import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
 *  
 */

class Unit{
	String name;
	int lv;
	
	public Unit(String name) {
		this(name, 1);
	}
	
	public Unit(String name, int lv) {
		this.name = name;
		this.lv = lv;
	}
	
	@Override
	public String toString() {
		return "["+name+" "+lv+"lv]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// �̸��� ������ ���� �ض�, �ߺ��Ǹ� ���� ������ü lv�� �������
		if(obj instanceof Unit) {
			Unit other = (Unit)obj;
			return name.equals(other.name);				
		}else {
			return false;
		}
		/* ----------------teachers A---------------------------------
		if(obj instanceof Unit) { //��Ŭ���� �ڵ� casting����--> obj.name-->(Unit)obj.name
			unit u = (Unit)obj;
			if(((Unit)obj).name.equals(this.name))
				return true;
			else
				return false;
				
			// ���ver
			//return ((Unit)obj).name.equals(this.name);
		*/
	}
}

class Shop{
	static Unit gaChya() {
		String[] names = "���,��ó,ȭ��,�̴Ͼ�,����,���".split(",");
		String n = names[(int)(Math.random()*names.length)];
		return new Unit(n);
	}
}
//========================================================================
class UnitComparator implements Comparator<Unit>{
	@Override
	public int compare(Unit o1, Unit o2) {
		int c = o1.name.compareTo(o2.name);
		if(o1.lv>o2.lv) {
			return -1;
		}else if(o1.lv<o2.lv) {
			return 1;
		}else {
			return c < 0 ? -1 : (c > 0 ? 1: 0);
		//	return o1.name.compareTo(o2.name);
		}
	}
}
//=========================================================================
public class Exercise03_List {
	public static void main(String[] args) {
		List<Unit> units = new LinkedList<>();
		units.add(new Unit("���",3));
		units.add(new Unit("�̴Ͼ�",2));
		System.out.println("���� �� : "+units.toString());
		System.out.println("�ý��� : 10 ���ӻ̱� ����");
		System.out.println("�ý��� : 10��°�� �� ���� ����!");
		
		for (int cnt = 1; cnt <= 10; cnt++) {
			Unit unit = Shop.gaChya();
			if(cnt==10) {
				unit.lv=3;
			}
			System.out.println(unit.toString());
			if(units.contains(unit)) {
				Unit i = units.get(units.indexOf(unit));
				i.lv += unit.lv;
				/*
				 * int idx = units.indexOf(unit);
				 * Unit got = units.get(idx);
				 * got.lv += units.lv;
				 * // Unit renew = new Unit(ggot.name, got.lv+unit.lv); 
				 * // ���� ��ü�� �ƴ� ���� ���� ��ü�� ���� ��� set�� �ؼ� �缳���ؾ���
				 * System.out.println(got == units.get(idx); //�̱⶧����
				 * //units.set(idx,got); 					 //��������
				 * System.out.println("�ռ���� = "+got.toString());
				 */
			}else {
				units.add(unit);
			}
		}
		System.out.println("�ý��� : 10�� �̱� ��!");
		/*
		  Unit ��ü�� ���� Comparator ��ü�� �ʿ��ؼ� ������ ������ ���״µ�,
		  �̰� �ٽ� ����� ���Ұ� ���ٸ�, �����ϸ鼭 ������ �� �ִ�.
		  
		  Ư���Ѱ�츸 ����
		  (implements �ɰ� ���踦 �ؾߵǴ� ���, extends �ɰ� �����ؾߵɶ�.)
		*/
		//--------------1. ���� ----------------------------------------
		Comparator<Unit> c = new UnitComparator();
		units.sort(c);		
		//--------------2. �ܼ�ȭ --------------------------------------
		//units.sort(new UnitComparator());
		
		//---------------3. ����+���� ---------------------------------
		Comparator<Unit> t = new Comparator<Unit>() {
			@Override
			public int compare(Unit o1, Unit o2) {
				if(o1.lv>o2.lv) {
					return -1;
				}else if(o1.lv<o2.lv) {
					return 1;
				}else {
					return o1.name.compareTo(o2.name);
				}
			}
		};
		// < �͸��� > 
		//  - ���� ��ü�� �������� ������ ��ü���� �͸� ��ü (Anonymous Object)
		
		// �͸�ü... compile  ������ü$1 �����ϰ����(\bin����)
		//							-->   Exercise03_List$1.class
		
		// 1���̻� ����Ҷ��� �Ұ����� ����̴�. (Only 1ȸ�� ��ü����)		
		//----------------------------------------------------------

		System.out.println("���� �� : "+units.toString()); 
		// lv�� ���� ������� ����, ���� �����̸� �����ټ� 
		
		
	}
}
/*
	�� ����Ʈ���� ���� �̸��� ���� Unit��ü�� ������ �Ѵٸ�
	���� ��ü�� lv�� ���� Unit��ü�� lv��ŭ �����ִ� �۾��� for �ȿ��� ó���ϰ�
	
	���������� list�� add�� �� ó���ǰ� ����, �̰� lv�� ��������, ���������� �̸� ������������ 
	���ĵǰ� Comparator �����ؼ� sort�ϰ� ����ض�
	
*/