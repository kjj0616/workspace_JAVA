import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * �ʼ�ó�� Exception �� extends Exception ���� ��ü�� ����
 */

class CriticalException extends Exception {
								//�߿� Exception�� Exception�� extends �޾Ƽ� ����
								//-->��Ȳ�� ����ÿ� throws ExceptionName�� �ɰ� �����ؾ��ϴ� �������ο�
}

class Account {
	int balance;
									//����� throws�� �ɰԵǸ� try~catch�۾��� �����ȴ�.
	public void addBalance(int m) throws CriticalException{
		if (m < 0) {
			// �ͼ����� ������, �̰� �ʼ������� ó���� ������ �ͼ����� ��Ʈ������ �Ѵٸ�
			// �׳��� �ȵǰ�, �����Ҷ� �ͼ����� �߻���Ű�ڴ�(����Ѱ������� �ѱ�ڴ�.)��
			// ������ �ϰ� ������ �Ѵ�.
			throw new CriticalException();
		}
		if(m %100 !=0) {
			throw new InvalidException();
		}
		balance += m;
	}
}

public class Source04_Exception {
	public static void main(String[] args) {
		Account ac = new Account();
		try {
			ac.addBalance(1000); 	// �� �۾��� �Ҷ� CriticalException�� �߻��ϰ� �ɶ�
									// ��� �ϰڴٶ�� ó���� �ؾ����� ����Ҽ� �ִ�.
			System.out.println("try success");
		}catch(CriticalException e) {
			System.out.println("CriticalException");
			System.out.println("try fail");
		}
		//-----------------------------------------------
		try {			//millis, nano  Thread.sleep(-1);
			Thread.sleep(1000,100);			//���α׷��� �����̸� �ְ��� �ϴ� ��Ȳ
											//��Ƽ�������Ȳ���� �߻��ϴ� ���ܻ�Ȳ�� �� ����ó���ؾ� ��밡��
											//�ڵ�� ������ ���� �ͼ��ǿ� ���� ó���� ������
											//�� ���� ��Ȳ�� ���ؼ��� ������ �ƴ�(���û���)
			System.out.println("try success");
		} catch (InterruptedException e) {
			 System.out.println("try fail");
		}
		
		try {
			new DatagramSocket(3702);	//5353 ������ ����
										//�ڱ���ǻ���� ����� ���ϼ���
		} catch (SocketException e) {
			System.out.println("SocketException...try fail");
		}
	}
}
