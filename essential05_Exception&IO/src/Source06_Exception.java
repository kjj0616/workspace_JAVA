import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Source06_Exception {
	public static void main(String[] args) {
		/*
		 * ��ü ����� �Ϸ�ǰ� ����, �������� ���� Ư���۾��� �� ó���ϴ� �� �����ϴ� �͵��� �ִ�.
		 */

		Scanner cin = new Scanner(System.in);
		System.out.println(cin instanceof Closeable); // Closeable check ���

		try { // try�� catch�� ���ϴ��� �� �ʿ��ϴ�
			System.out.print("System> ");
			String line = cin.nextLine();
			String[] ar = line.split(" ");
			int s = 0;
			for (String a : ar) {
				s += Integer.parseInt(a);
			}
			System.out.println("SUM = " + s);
		} finally { // �� �ʿ��� �۾����� ���
			cin.close();
			System.out.println("Scanner closed");
		}
		// ==================================================
		// interface Closeable �� �޾Ƽ� ����°�ü�� ��κ��� �������

		// close() �۾��� ������ Closeable ��ü�� ���ؼ�
		// �������� finally�� �׻� close ó���� �Ͼ�� �߾��µ�
		// try( ) �ȿ� �������Ѽ� ����� ��ü���� �ڵ�����, close() ���� �ȴ�.

		//######################################################################
		
		// ** try ~ catch ~ finally ���� tip **
		
		// try + ( )�߰��ϰ� �ڵ�close�� ��ü�� ()�ȿ� ����+����, 2���̻� ����
		
		// stream ���� ��ü�� --close����� �� ��ü�鿡 ����
		
		//######################################################################

		// try with resource statement ( catch, finally ���������� ����)
		
		try (CustomScanner cs1 = new CustomScanner();) {
			cs1.nextLine();
			if (Math.random() > 0.5) {
				throw new RuntimeException();
			}
		}
	}
}
//---------------------------------------------------------------------------------
class CustomScanner implements AutoCloseable {
	public String nextLine() {
		return "....";
	}
	@Override
	public void close() {
		System.out.println("CustoomScanner.close()");
	}
}