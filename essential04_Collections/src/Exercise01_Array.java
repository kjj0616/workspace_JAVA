import java.util.Scanner;

public class Exercise01_Array {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String[] heros = "����,����,����,���,����,����,����,����Ű,���".split(",");
		String[] pick = new String[3];
		int idx = 0;
		while(idx <3) {
			System.out.print("�̸�> ");
			String in = cin.nextLine();
			boolean chk = false;
			for(int i=0; i<heros.length; i++) {
				if(heros[i].equals(in)) {
					chk = true;
					break;
				}
			}
			if(!chk) {
				System.out.println("�߸��� �����Դϴ�. �ִ� �����͸� �Է����ּ���.");
				continue;
			}
			boolean already = false;
			for(int i=0; i<idx; i++) {
				if(pick[i].equals(in)) {
					already = true;
					break;
				}
			}
			if(already) {
				System.out.println("�̹� �Ͻ� �����Դϴ�.");
				continue;
			}
			pick[idx++] = in;
		} 
		//=====================================================
		String[] remain = new String[6];
		int ridx=0;
		remain : for(int i=0; i<heros.length; i++) {
			String m = heros[i];
			for(int ii =0; ii<pick.length; ii++) {
				if(pick[ii].equals(m))
					continue remain;
			}
			remain[ridx++] = m;
		}
		System.out.println("PICK NAMEs");
		for(int i =0; i<pick.length; i++) {
			System.out.println("�� " + pick[i]);
		}
		System.out.println("REMAIN  NAMEs");
		for(int i =0; i<remain.length; i++) {
			System.out.println("�� " + remain[i]);
		}
		
		
		
		
		
	}
}
