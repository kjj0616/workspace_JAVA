import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exercise04_LinkWord {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		// Set, List, Queue, Deque �� ����ϸ� ��Ȳó���� ������ �÷��� ��ü�� ����
		
		/*
		 * �θ��� ����ڷκ��� �����ư��鼭 ���ڿ��� �Է¹޴µ�,
		 * �̹� �Էµ� ���ڿ��� ���Է��Ѵٰų�
		 * ���������� �Էµ� ���ڿ��� ������ ���ڿ� �ٸ��� �����ϸ�
		 * �ش� ������� �й�ó��,(10�� ���� �ȵǸ�)
		 */
		
		//��Ŭ�����ѱ��Է� �ֿܼ��� => �ѱ��Է½� �ǳ��� �Է�, endŰ Ȥ�� �Ʒ��� Ű
		
		//######### �̿ϼ��� ################################################
		Deque<String> d = new ArrayDeque<>();
	
		for (int cnt = 1; cnt <=10; cnt++) {
			String user = cnt%2 ==0 ? "���" : "����";
			if(cnt==1) {
				System.out.print(user+"�� ���� > ");
				d.push(cin.nextLine());
			}else {
				System.out.println("\n������ �ܾ�:"+d.peek());					
				System.out.print(user+"�� ���� > ");
				String a = cin.nextLine();	
				if(a.indexOf(0)==d.peek().charAt(d.peek().length()-1)) {
					if(!d.contains(a)) {
						d.push(a);						
					}
					break;
				}							
				System.out.println("�й�!");
			}
		}
		//###################################################################
	}
}
/*
	�÷����� ��ü (��ü������ ���� ���ϰ� �Ҽ� �ִ� ��ü)
	-Collection
		-Set
		-List
		-Queue
			-Deque
			
	-Map

*/
