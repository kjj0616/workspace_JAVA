import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 
 */
public class Source05_Exception {
	public static void main(String[] args) {
		/*
		 * catch�� �ͼ��� ��Ƽ� �ó���� �Ҳ���...?
		 * 
		 * 1. �����޽��� ����ְ� ���α׷� ���Ḧ ��Ű����,
		 * 
		 * 2. �� ��Ȳ�϶��� �ٸ������� �۵��Ҽ� �ְ� �����Ѵٴ���
		 * 
		 */
		
		/*
		 * ��Ʈ��ũ ���α׷��� ����ٰ� ����������, ������ �ȵǸ�
		 *  ���̻��� �۾��� ���ǹ��ϴ�.
		 */
		Socket s = null;
		try {
			s = new Socket("192.168.10.27",5040);
			System.out.println("try success");
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage()); //�ͼ��� �߻��� ������ ������ ���ִµ� �װ� Ȯ���غ��ٴ���,
			System.exit(0);		//���α׷� ��������
		} catch (IOException e) {
			System.out.println(e.toString()); //toString()���� Ȯ���غ��ٴ���,
			System.exit(0);		//���α׷� ��������
		} 
		
		System.out.println(s.isConnected());
		//java.net.ConnectException: Connection timed out: connect
		//========================================================================
		//���� ���̺�ε�� �Ͼ�� �ִ� ��� (��ü��� �ۼ�)

		Triangle t = null;
		try {
			t = new Triangle(1, 2, 1);
			System.out.println("try success");
		} catch (NonTriangleException e) {
			System.out.println("try fail");
			t = new Triangle(1, 1, 1);
		} finally {
			System.out.println("finally object = " + t);
		}
		// try~catch �۾��ϸ鼭 finally block ������ �����ѵ�,
		// finally ó���� �κ��� try success �ϴ�, fail�� �ϴ� 
		// ������ �۵��ؾߵǴ� �۾��� �����Ҷ� ���
	}
}
