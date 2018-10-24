import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise04_LinkWord_A {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		// Set, List, Queue- Deque �� ����ϴ� ��Ȳó���� ������ �÷��� ��ü�� ����
	
		/*
		 * �θ��� ����ڷκ��� �����ư��鼭 ���ڿ��� �Է¹޴µ�,
		 * �̹� �Է��� ���ڿ��� ���Է��Ѵٰų�
		 * ���������� �Էµ� ���ڿ��� ������ ���ڿ� �ٸ��� �����ϸ�
		 * �ش� ����ڸ� �й� ó��,(10�ϳ��� �ȵǸ� 
		 */
		List<String> li = new ArrayList<>();
		for(int cnt=1; cnt<=10; cnt++) {
			String user = cnt%2 ==0 ? "���" : "����";
			System.out.print("[�ý���] " + user +"�� ���� > ");
			String in = cin.nextLine();
			if(li.contains(in)) {
				System.out.println("[�ý���] " + in +" ��/�� �̹� ���� �ܾ��Դϴ�.");
				System.out.println("[�ý���] " + user+" �� �й�!");
				break;
			}
			if(li.isEmpty()) {
				li.add(in);
				continue;
			}
			
			int last = li.size()-1;
			String recent = li.get(last);
			char c = recent.charAt(recent.length()-1);
			if(in.startsWith(String.valueOf(c)) ) {	// in.charAt(0) == c
				li.add(in);
			}else {
				System.out.println("[�ý���] " + in +" ��/�� �ܾ �̾����� �ʽ��ϴ�.");
				System.out.println("[�ý���] " + user+" �� �й�!");
				break;
			}
			
		}
		
		
		
	}
	
}
