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
		}
}

class Shop{
	static Unit gaChya() {
		String[] names = "���,��ó,ȭ��,�̴Ͼ�,����,���".split(",");
		String n = names[(int)(Math.random()*names.length)];
		return new Unit(n);
	}
}

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
			}else {
				units.add(unit);
			}
		}
		Comparator<Unit> c = new UnitComparator();
		units.sort(c);
		System.out.println("�ý��� : 10�� �̱� ��!");
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