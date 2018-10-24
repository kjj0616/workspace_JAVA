import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Queue �� Ư���迭�� Deque��
 *  �⺻ Queue �ϰ� ������, ���ʿ����� ó���� �Ҽ� �ִ°� �ƴ϶� ���ʿ��� ó���Ҽ� �ְ� �صξ���.
 */
public class Source13_Deque {
	public static void main(String[] args) {
		//F4 ������ class ����
		Deque<String> deque = new ArrayDeque<>();
		System.out.println(deque.toString());

		deque.add("����");	//��
		deque.offer("����");	//��
		System.out.println(deque.toString());

		deque.addLast("����");
		deque.offerLast("�»���");
		System.out.println(deque.toString());
		deque.addFirst("������");
		deque.addFirst("�Ͽ쵷");
		deque.offerFirst("�縶��");
		deque.push("����");
		System.out.println(deque.toString());
		
		// peekFirst(), peekLast(), pollFirst(), pollLast();
		System.out.println(deque.peek());
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast()); //peek Ȯ�� <-> poll ����
		
		System.out.println(deque.pollFirst());
		System.out.println(deque.peekFirst());
		
		System.out.println(deque.pollLast());
		System.out.println(deque.toString());
		System.out.println(deque.pop());
		
		
		// stack ��ü�� ����ϱ����� �������ѳ��� ��ü Deque
		
		// push �� ��ü �����ϰ�, pop ���� ��üȮ���ϸ�, ���� �ֱٿ� add�� �������
		// ��ü�� Ȯ���Ҽ� �ִ�.
		
		// offer �� ��ü �����ϰ�, poll�� Ȯ���ϸ�, ���� ������ ��ü ������� Ȯ���� �� �ִ�.
	}

}
