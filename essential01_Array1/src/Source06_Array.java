
public class Source06_Array {
	public static void main(String[] args) {
		int[] t;
		
		int[] box = new int[5];
		box[1] = 99;
		int last = box.length-1;
		box[last] = 700;
		// box ��� ������ ���� ���� int 5ĭ¥�� ����� ���ٰ�
		t = box;	// ���� type�� �̷������� = ����|������ �ȴ�.
		
		System.out.println(t == box); // ���� ��ü
		System.out.println(t.equals(box));
		System.out.println(t[1]+ ".."+t[4]);
		t[1] *= 2;
		System.out.println(box[1]);
		//=========================================================
		Sword[] ss = new Sword[3];
		System.out.println(ss[0]); // null
		ss[0] = new Sword();
		
		Sword ex = new Sword();
		ss[1] = ex;
		ss[2] = ex;
		
		System.out.println(ss[1] == ss[2]);
		
		for(int cnt=1;cnt<=10;cnt++) {
			ss[1].enchant();
		}
		System.out.println("ss[1].atk = "+ss[1].atk);
		System.out.println("ex.atk = "+ex.atk + " / ss[2].atk = "+ss[2].atk);
		System.out.println(ex == ss[1]);
		
		
		
		
	}
}
