import java.util.ArrayDeque;
import java.util.Queue;

public class Source12_Queue {
	public static void main(String[] args) {
		/*
		 * Queue (1)
		 *  �⺻ �÷����� �Ѱ迭�� ���� ���� ��ü�δ� ArrayDeque, PriorityQueu
		 *  ������ �����ϴµ�,
		 * ������ѵ� ��ü�� �ϳ��� �����ϸ鼭 ������ �ְ� �������ѵ� �÷����̴�.
		 * (�ߺ���ü �����)
		 */ 
		//Queue<String> que = new PriorityQueue<>(); // ���� ����
		Queue<String> que = new ArrayDeque<>();		 // ���� ����
		// �⺻�÷����� �������� �� ������ �ְ�,
		que.add("Monday");
		que.add("Monday");
		System.out.println(que.size());
		System.out.println(que.contains("Monday"));
		que.add("Friday");
		System.out.println(que.toString());
		/*
		 * Queue �迭�ȿ� Ư������� , 
		 * 
		 * peek(), element(), poll(), remove(), offer() �� �ִ�.
		 */
		System.out.println(que.peek()); //ù��° ��ü
		System.out.println(que.peek()); //ù��° ��ü
		System.out.println(que.element()); // ù��° ��ü
		
		String s = que.poll();	// �÷��ǿ� �� ��ü�� ���ܵ�
		System.out.println("poll = "+s); 
		System.out.println(que.size() + " / "+que.toString() );
		
		que.remove("Friday");	// Queue �� ��ü�� ��������� �ƴ϶�, ��ü �ְ� �����޶�°� ��� �÷��ǿ� �� ����
		String s1 = que.remove(); //poll() �̶� ����
		System.out.println("remove = "+s1);
		System.out.println(que.size() + " / "+que.toString());
		
		que.offer("Sunday"); // add()�� ����
		System.out.println(que.size() + " / "+que.toString());
		
		// list.add ��Ű�� remove(0) �̴°� remove(), poll(), list.get(0)�ؼ� Ȯ�� element(), peek()
		// ���� ��ü�� �޶� equals()�� Ȯ��
		
		
	}
	
}
