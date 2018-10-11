
import sample.Coord;

public class Source10_Array {
	static Coord[] makeCoord() {
		Coord[] cs = new Coord[10];
		cs[0] = new Coord(0,0);
		cs[1] = new Coord(0,0);		
		for(int idx=2;idx<cs.length;idx++) {
			int x = (int)(Math.random()*4);	
			int y = (int)(Math.random()*4);
			cs[idx] = new Coord(x,y);
		}
		return cs;
	}
	public static void main(String[] args) {
		Coord[] box = makeCoord();
		for(int i=0;i<box.length;i++) {
			System.out.println(i+" : "+box[i].toString());
		}
		System.out.println(box[0]== box[1]); //false
		// ��ü���� == ���� �񱳴� ���� ��ü������ Ȯ��
		
		System.out.println(box[0].equals(box[1])); //true
		// ������ ���� ������ ������ü���̳� �츮�� Override�س���
		
		// 10�� ��ǥ�� �ߺ��� 1���� ó���ϰ� ��� ��ǥ�� Ȯ�����ΰ�?
		// homework
		
		int count=0;
		int cnt=0;
		String[] a = new String[10];
		for (int i = 0; i < box.length; i++) {
			for (int j = i+1; j < box.length; j++) {
				if(box[i].equals(box[j])){
					System.out.println(i+","+j);
					a[j] = String.valueOf(j);
					count++;					
				}
			}		
		}
		System.out.println("�ߺ���ǥ�� = "+count);
		System.out.println("�ߺ�ó�� ��ǥ����Ʈindex :");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) {				
				cnt++;
			}else {
				System.out.print(a[i]+" ");
			}			
		}
		System.out.println("");
		System.out.println("�ߺ����� ��ǥ����Ʈ :");
		for (int i = 0; i < box.length; i++) {
			if (a[i] == null) {
				System.out.println(i+" : "+box[i].toString());			
			}
		}
		System.out.println("�ߺ����� ��ǥ�� = "+cnt);
		
		//another ##########################################################
		int ct = 0;
		for (int i = 0; i < box.length; i++) {
			Coord pick = box[i];
			System.out.println(i+"th Coord "+ pick);
			for (int srch = 0; srch < box.length; srch++) {
				Coord cmp = box[srch];
				System.out.println("  vs  " +srch+"'s coord : "+ cmp+" / "+pick.equals(cmp) );
				//if(srch == i)//(or srch = i+1)
				//	continue;
				if(pick.equals(box[srch])) {
					System.out.println(" FInd Duplicate Coord");
					//System.out.println("find duplicate Coord at"+srch+" : "+box[srch].toString());
					ct++;
					break;
				}
			}
		}
		System.out.println("duplicated cnt = "+cnt);
		System.out.println("cnt = "+(10-cnt));
		System.out.println("================1st end==============");

		//another ##########################################################
		int ct2 = 0;
		for (int i = 0; i < box.length; i++) {
			Coord pick = box[i];
			System.out.println(i+"th Coord "+ pick);
			for (int srch = 0; srch < i; srch++) {
				Coord cmp = box[srch];
				System.out.println("  vs  " +srch+"'s coord : "+ cmp+" / "+pick.equals(cmp) );
				//if(srch == i)//(or srch = i+1)
				//	continue;
				if(pick.equals(box[srch])) {
					System.out.println(" FInd Duplicate Coord");
					//System.out.println("find duplicate Coord at"+srch+" : "+box[srch].toString());
					ct2++;
					break;
				}
			}
		}
		System.out.println("duplicated cnt = "+cnt);
		System.out.println("cnt = "+(10-cnt));
		System.out.println("================2nd end==============");
		
		//another��� #######################################################
		
		boolean[] rst = new boolean[box.length];
	}
}
