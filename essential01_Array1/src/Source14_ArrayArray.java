
class Sim {
	static String[] first;
	static String[] last;
	static {
		first = new String[] {"��","��","��","��","��","��","��","��","��","��"};
		last = new String[] {"����","����","����","�ÿ�","����","�Ͽ�","����","����","����","����"};
	}
	//������ �����̶�⺸�ٴ� �޸���������
	
	String name;
	int age;
	boolean gender;
	
	public Sim() {
		
		int fidx =(int)(Math.random()*first.length);
		int lidx =(int)(Math.random()*last.length);
		
		name = first[fidx]+last[lidx];
		age = 7+(int)(Math.random()*50);
		gender = Math.random()>0.5;
		
		name.intern(); //String��ü ���� --> �ڽÿ� trueó��
					   //String��ü ���� ���ζ� �ٽ� �� ����
	}
	@Override
	public String toString() {
		// �̸�(xx��/����)
		return name+"("+age+"��/"+((gender)?"����":"����")+")";
		// return name+"("+age+"��/"+(gender?"��":"��")+")";		
	}
}


//==========================================================================
public class Source14_ArrayArray {
	static Sim[] makeFamily() {
		int size = 2 +(int)(Math.random() *4);
		Sim[] t = new Sim[size];
		for (int i = 0; i < size; i++) {
			Sim s = new Sim();
			//System.out.println(s.toString());
			t[i] = s;
		}
		return t;
	}

	
	public static void main(String[] args) {
		Sim[][] families = new Sim[7][];
		//============================================================
		// �� Sim[] �迭 7���� �����Ҽ� �ִ� ������ ������µ�,
		// ������ũ��(2~5�� ����)�� �迭�� Sim��ü�� �����ؼ� families �� ���
		
		/* �߸��� ����
		 * for(int row = 0 ; row < families.length ; row++) {
		 * 		for(int col = 0; col < families.[row].length ; col++){
		 * 			families[row][col] = new Sim();
		 * 		}
		 * }
		 * ------------------------------------------------------
		 * for(int r = 0 ; r < families.length ; r++) {
		 * 		Sim[] each = families[row];
		 * 		for(int c = 0 ; c < each.length ; c++){
		 * 			each[c] = new Sim();
		 * 		}
		 * }
		 * ------------------------------------------------------
		 * �йи�� Sim�迭�� �ִٴ� �����Ͽ� Sim�� ������ �ڵ�
		 * Sim �迭���� ����� ���� Sim�迭�� �����Ѱ�, 1�پ��� �߰��ϸ� ��
		*/
		//============================================================
		// ���� �Ϸ�ǰ���.. 
		// ��ü �йи������� ���� ���
		
		/* teacher A
		for (int r = 0; r < families.length; r++) {
			System.out.println(r+ "family set start");
			int size = 2 +(int)(Math.random()*4);
			Sim[] t = new Sim[size];
			for (int c = 0; c < size; c++) {
				Sim s = new Sim();
				System.out.println(s.toString());
				t[c] = s;
			}
			families[r] = t;
			System.out.println(r+"family set end");
		}
		or
		static ���������
		
		for (int i = 0; i < families.length; i++) {
			System.out.println("family set start");
			Sim[] tmp = makeFamily();
			families[i] = tmp;
		}
		
		��ü���
		
		for (int r = 0; r < families.length; r++) {
			System.out.println(r +"'s Family");
			Sim[] ar = families[r];
			for(int i=0; i<ar.length;i++){
				Sim s = ar[i];
				System.out.println(" -> "+i+" : "+ar[i] );
			}
			
		}
		*/

		
		
		int[] ran = new int[families.length];
		for (int i = 0; i < families.length; i++) {
			int sum =2+(int)(Math.random()*4);
			ran[i] = sum;
		}
		for (int i = 0; i < ran.length; i++) {
			System.out.println("families "+i +"- ������ ["+ran[i]+"] ��");
			families[i] = new Sim[ran[i]];
			for (int j = 0; j < families[i].length; j++) {
				families[i][j]= new Sim();
				System.out.println("	f["+i+"]["+j+"] = "+families[i][j].toString());
			}
		}			
		
		//============================================================
		int maleCount = 0;
		int femaleCount = 0;
		int twoCount = 0;
		int tenCount = 0;
		boolean psuCount =false;
		Sim pick = null;		
		
		for (int i = 0; i < families.length; i++) {
			for (int j = 0; j < families[i].length; j++) {
				if(families[i].length == 2) {
					twoCount++;
				}
				if(families[i][j].age >=10 && families[i][j].age <20) {
					tenCount++;
				}
				if(families[i][j].name == "�ڽÿ�") {
					psuCount = true;
				}
				if(families[i][j].gender) {
					maleCount++;
				}else {
					femaleCount++;
				}
			}
		}
		System.out.println();
		// �� �������߿� ���� ���, ���� ��� ���� Ȯ��
		System.out.println("���� : "+maleCount+"�� / ���� : "+femaleCount+"��");		
		// 2�ΰ����� ��ΰ�?
		System.out.println("2�ΰ��� : "+twoCount+"����");
		// 10�� ����ΰ�? (10~19)
		System.out.println("10�� : "+tenCount +"��");
		// "�ڽÿ�" ��� �̸��� ���� Sim�� �ִ°�? ( =="�ڽÿ�" )
		System.out.println("�ڽÿ찡 �����ϴ°�? ... "+((psuCount)?"�����Ѵ�":"���������ʴ´�"));
		// �� families�� ���� �ִ� Sim�߿� �ϳ��� random()���� �̾ƶ�, ������ + ����ĭ 2��
		int rand = (int)(Math.random()*7);
		pick = families[rand][(int)(Math.random()*(families[rand].length))];		
		
		System.out.println(pick.name + " ��/�� ��� �������� Ī���� �޽��ϴ�.");
		
		// ���� ���ڼ��� A
		int[] cnt = new int[2];
		for (int i = 0; i < families.length; i++) {
			Sim[] ar = families[i];
			for (int j = 0; j < ar.length; j++) {
				Sim s = ar[i];
				if(s.gender)	//families[r][c].gender
					cnt[0] += 1;
				else
					cnt[1] += 1;
			}			
		}
		// 2�ΰ��� A
		int two=0;
		for (int i = 0; i < families.length; i++) {
			Sim[] ar = families[i];
			if(ar.length ==2)
				two++;			
		}
		
		// 10�� A
		int teenager = 0;
		for (int i = 0; i < families.length; i++) {
			for (int j = 0; j < families[i].length; j++) {
				if(families[i][j].age /10 ==1)
					teenager++;
			}			
		}
		// �ڽÿ� A
		boolean find = false;
		for (int i = 0; i < families.length; i++) {
			Sim[] ar = families[i];
			for (int j = 0; j < ar.length; j++) {
				Sim s = ar[i];
				if(s.name == "�ڽÿ�") {
					find = true;
					break;					
				}					
			}			
		}
		// random A
		int randRow = (int)(Math.random()*families.length);
		Sim[] pickFamily = families[randRow];
		Sim pick1 = pickFamily[ (int)(Math.random()*pickFamily.length)];
		System.out.println(pick + " ��/�� Ī���� �޽��ϴ�.(in " + randRow +" family)");
	}
}
