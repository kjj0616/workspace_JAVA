import java.util.Scanner;

class LineBingo {
	int[] num; // ���ڸ� ������ ����� ��ü
	boolean[] checked; // üũ�� ������ �ֳ� ������ ������ ���尴ü
	public LineBingo(int size) {
		num = new int[size];
		checked = new boolean[size];
		int index = 0;
		while (index < num.length) {
			boolean find = false;
			int n = 1 + (int) (Math.random() * (size * 2));
			for (int i = 0; i < num.length; i++) {
				if (num[i] == n) {
					find = true;
					break;
				}
			}
			if (!find) {
				num[index++] = n;
			}
		}
		/* ====================another======================
		int idx=0;
		while(idx<size){
			int n = 1+(int)(Math.random()*size*2);
			boolean find = false;
			for(int s = 0; s<idx; s++){
				if(num[s] == p){
					find =true;
			      	break; //���ٸ� � ���ʿ��� �۾��� �Ͼ��?
				}
			}
			if(!find){
				num[idx++] = p;
			}
		}
		*///====================another======================

		// System.out.println("linebingo created");
	}
	public LineBingo() {
		this(5);
	}
	public boolean mark(int data) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] == data) {
				checked[i] = true;
				return true;
			}
		}
		/*
		 * ���࿡ data�� ������ return true, ������ return false�� �ϴµ� �ִ� ��쿣, boolean[ ] ���� ĭ��
		 * true�� �������ټ� �ְ�
		 */
		return false;
		/* ====================another======================
		int idx = -1;
		for (int i = 0; i < num.length; i++) {
			if(num[i] == data) {
				idx = i;
				break;
			}
			
		}
		if(idx == -1) {
			return false;
		}else {
			checked[idx] = true;
			return true;
		}
		*///====================another======================
	}

	@Override
	public String toString() {
		String rep = "[";
		for (int i = 0; i < num.length; i++) {
			rep += num[i] < 10 ? "0" + num[i] : num[i];
			// if ó���ؼ� ������ index���� , ����
			if (i != num.length - 1)
				rep += ", ";
		}
		rep += "]";
		return rep;
	}

	public String toHiddenString() {
		String rep = "[";
		for (int i = 0; i < num.length; i++) {
			// num �� ������ ĭ�� boolean�迭�� ���� true��
			// false�� ??�� ������ ifó��
			if (checked[i]) {
				rep += num[i] < 10 ? "0" + num[i] : num[i];
			} else {
				rep += "??";
			}
			// if ó���ؼ� ���������� , ����
			if (i != num.length - 1)
				rep += ", ";
		}
		rep += "]";
		return rep;
	}

	public boolean isRevealed() {
		// �ڱⰡ ���� boolean[]�� ��� ���� all true���� Ȯ���ؼ� ����
		int cnt = 0;
		// checked boolean[] �迭���� true ������ ����
		for (int i = 0; i < checked.length; i++) {
			if (checked[i]) {
				cnt++;
			}
		}
		return cnt == checked.length;
		/*====================another======================
		int cnt=0;
		for (int i = 0; i < this.checked.length; i++) {
			if(checked[i] == false)
				return false;
			}
		}
		return true;
		*///====================another======================
		/*====================another======================
		int cnt=0;
		
		for(int i = 0; i<this.checked.length;i++) {
			if(checked[i]) {
				cnt++;
			}
		}
		return cnt == checked.length;
		*///====================another======================
	}

}

public class Case_LineBingo_Game {	
	public static void main(String[] args) {
			LineBingo user1 = new LineBingo();
			LineBingo user2 = new LineBingo();

			System.out.println("=====LineBingo START=====");
			Scanner cin = new Scanner(System.in);
			while (!user1.isRevealed() && !user2.isRevealed()) {
				System.out.println("user1 = " + user1.toHiddenString());
				System.out.println("user2 = " + user2.toHiddenString());
				String u1 = cin.nextLine();
				user1.mark(Integer.valueOf(u1));
				user2.mark(1 + (int) (Math.random() * 10));
				System.out.println("");
			}			
			System.out.println("======== GAME SET ========");
			System.out.println("user1 = " + user1.toString());
			System.out.println("user2 = " + user2.toString());

			if (user1.isRevealed() && !user2.isRevealed()) {
				System.out.println("======= user1 �¸� =======");
			} else if (!user1.isRevealed() && user2.isRevealed()) {
				System.out.println("======= user2 �¸� =======");
			} else {
				System.out.println("========= ���º� =========");
			}
			cin.close();
	}
}

