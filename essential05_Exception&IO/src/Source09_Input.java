/*
 *  �̹����� ���Ϸκ��� �����͸� �о���̴� �۾��� �Ϸ��� �Ѵ�.
 */
import java.io.*;
public class Source09_Input {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("output.data"); 
			// ������ ���� ���(����)�� �����Ҷ� �����߻�
			// ������ �������� �ְ�, ���͸��ų�, ������ ���ٸ� ���ܹ߻�
			System.out.println("try success");
			for (int cnt = 1; cnt <= 30; cnt++) {
				int a = fis.available(); // ������ �о�� �ִ� ����Ʈũ�� int�� ����
										 // �� �о�� �ִ� (�����ִ� byteũ��)
				System.out.print("available "+a);
				int r = fis.read(); // �ش������� 1����Ʈ�� �о�� int����
									// �� ���� �о ��
									// (������ 1byte), available=0�϶��� -1 ����
				System.out.println(" / read = "+r);
			}
			/*
			available 25 / read = 0
			available 24 / read = 69
			available 23 / read = 153
			available 22 / read = 69
			available 21 / read = 64
			available 20 / read = 9
			available 19 / read = 33
			available 18 / read = 250
			available 17 / read = 252
			available 16 / read = 139
			available 15 / read = 0
			available 14 / read = 122
			available 13 / read = 1
			available 12 / read = 0
			available 11 / read = 9
			available 10 / read = 237
			available 9 / read = 153
			available 8 / read = 141
			available 7 / read = 234
			available 6 / read = 184
			available 5 / read = 184
			available 4 / read = 235
			available 3 / read = 143
			available 2 / read = 153
			available 1 / read = 30
			available 0 / read = -1
			available 0 / read = -1
			available 0 / read = -1
			available 0 / read = -1
			available 0 / read = -1
			 */
			fis.close();
			// fis.read(); // error
			FileInputStream fiss = new FileInputStream("output.data");
			// ����Ҷ��� test�� �������� byte[] �� ����� �ȴ�.
			for (int cnt = 0; cnt <= 11; cnt++) {
				byte[] b = new byte[3];
				System.out.print("available = "+fiss.available());
				int r = fiss.read(b);	
				//byte[] �迭�� read ��Ű�� �󸶸�ŭ ����ߴ��� ��밪 ����
				System.out.println(" / read = "+r);
			}
			// �����б��� �⺻������ ���캸�Ҵ�.
			
			/*
			available = 25 / read = 3
			available = 22 / read = 3
			available = 19 / read = 3
			available = 16 / read = 3
			available = 13 / read = 3
			available = 10 / read = 3
			available = 7 / read = 3
			available = 4 / read = 3
			available = 1 / read = 1
			available = 0 / read = -1
			available = 0 / read = -1
			available = 0 / read = -1
			*/
			
		} catch (IOException e) {
			System.out.println("Catch..."+e.toString());
		}
		
	}
}
