import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise01_NoDataInOut {
	public static void main(String[] args) {
		int r = (int)(Math.random()*456120);
		System.out.println("r = "+r);
		// ���ڸ� ���� ��Ͻ�Ű��, �ٽ� �ҷ��鿩�� ��
		// DataInOut�� �Ⱦ���..?
		try {
			FileOutputStream fos = new FileOutputStream("123.data");
			
			while(r>0) {
				fos.write(r%10);
				r /= 10;
			}
			fos.close();
			System.out.println("data output complete");
		} catch (IOException e) {
			System.out.println("output fail");
		}
		/* cf)
		 * ��Ʈ���� & and, | or, ^ xor
		 * 
		 * ��Ʈ�� ��ȿ���˻�
		 * 
		 * int�� ���
		 * ��Ʈ�� 8*0=0 8*1=8 8*2=16 8*3=24 �����ʺ��� �������� 
		 */
		
		//�������� �ϴ� ���
		//��� : ������
	}
}
