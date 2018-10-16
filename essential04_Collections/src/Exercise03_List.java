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
			// 이름만 같으면 같게 해라, 중복되면 현재 뽑은객체 lv을 더해줘라
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
		String[] names = "기사,아처,화살,미니언,대포,고블린".split(",");
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
		units.add(new Unit("기사",3));
		units.add(new Unit("미니언",2));
		System.out.println("현재 덱 : "+units.toString());
		System.out.println("시스템 : 10 연속뽑기 시작");
		System.out.println("시스템 : 10번째는 고렙 유닛 등장!");
		
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
		System.out.println("시스템 : 10연 뽑기 끝!");
		System.out.println("현재 덱 : "+units.toString()); 
		// lv이 높은 순서대로 정렬, 같은 레벨이면 가나다순 
		
		
	}
}
/*
	이 리스트에는 같은 이름을 가진 Unit객체가 나오게 한다면
	기존 객체의 lv를 뽑힌 Unit객체의 lv만큼 더해주는 작업을 for 안에서 처리하고
	
	최종적으로 list에 add가 다 처리되고 나면, 이걸 lv을 내림차순, 같은레벨시 이름 오름차순으로 
	정렬되게 Comparator 구현해서 sort하고 출력해라
	
*/