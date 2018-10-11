package sample;

import java.util.Scanner;

public class LineBingoMain {
	public static void main(String[] args) {
		/**
		 * LineBingo ��ü ������ ���� ����ڷκ��� �Է¹޾ư��鼭 �� ��ü�� �����ؾߵǴµ�
		 */
		// System.console.readLine(); // ��Ŭ���� ���ĸ�����==> ����
		// Console c = System.console();
		// c.readLine();

		// Eclipse������ testing ������ �Է�ó���� �˾ƾ��Ѵ�.
		// Scanner cin = new Scanner(System.in); // ��ü �����ѹ� ���ѵΰ�,

		// String in1 = cin.nextLine(); // ��ü.nextLine();
		// System.out.println(in1);
		// String in2 = cin.nextLine(); // ������ ������ų�ʿ����, �ѹ��� �����ؼ� ���
		// System.out.println(in2); // readLine() ��ɰ� ���������� String���� return�ȴ�.
		// Integer.valueOf(); ó��

		// ������� ���� + ������ ���� �Ѵ�, toHiddenString ���

		// ���߿� �ϳ��� revealed �Ϸ�Ǹ� �Ѵ� toString

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
			//�ߺ�ó��.. ��Ʈ�迭���� �ְ�
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
