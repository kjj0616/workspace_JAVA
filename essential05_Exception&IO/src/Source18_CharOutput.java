import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Source18_CharOutput {
	public static void main(String[] args) {
		/*
		 * ������ ����� ���� �ְ� ����byte�� ����ؼ� ����ϴ°� ���ŷӱ� ������
		 * 
		 * OutputStreamWriter, InputStreamReader ��� ��ü�� �����ξ���.
		 * 
		 * �ַ� ���ÿ���  OutputStreamWriter >> BufferedWriter �� �����ؼ� ��� 
		 */
		try {
			
			//---------------------------------------------------------------------
			/*
			
			FileOutputStream fos = new FileOutputStream("output.log");
			OutputStreamWriter osw = new OutputStreamWriter(fos); 		
			
			//����(��)�� �ش��ϴ� byte��ü�� ã�Ƽ� �ڵ� ����ϴ� OutputStreamWriter��ü
			//�ٹٲޱ���� �����Ƿ� --> ���� BufferedWriter���� �����ؼ� ���� ���
			
			*/
			
			//==> ���ϰ��� ���,2�ܰ� �ǳʶ��
			//    �ٷ� OutputStreamWriter �� ���� ��Ȱ�� ��ü�� �������� �ִ�.
			FileWriter osw = new FileWriter("output.log");
					
			
			BufferedWriter bw = new BufferedWriter(osw); // ���� 1 �� char[] 1024ĭ (default 8)
														 // char[] ���۰� �������� writer
														 // Ȥ�� close() ����� writer
			
			bw.write("�׷쵥���� v1.0");
			bw.newLine();				//���Ͽ����� \n�� �ƴ϶� \r\n, 1310 �� �ٹٲ�
			bw.write("===================");
			bw.newLine();
			bw.write("# �������� #");
			bw.newLine(); //�߰��� �޼ҵ�
			bw.write("�� ����");
			bw.write("���� ����");
			bw.flush(); // .flush() -->���� buffer���� �������� �� buffer ����
			bw.newLine();
			bw.newLine();
			bw.write("# �� #");
			
			// ����� �Ҷ� �Է��� ����ϴ°��� �ƴ� ������ü�� �ܺο��� ���������
			// �ٷ� ���ڸ� ������ �ֵ��� ����ϴ°�			
			
			/*
			osw.write('��'); //2����Ʈ						��ȣ-1����Ʈ��
			char[] data = new char[] {'��','��','��','��','!','!'};
			osw.write(data);
			osw.write(13);
			osw.write(10);
			//���ڿ� ���ڿ� ����� ������ write�� ����ϳ� �����δ� �ٸ� (�ڵ� char[]�� ��ȯó��)
			osw.write("[SYSTEM] ���ڿ� ���");
			osw.append('.');
			osw.append("...");
			*/			
			System.out.println("[SYSTEM] DONE");
			
			bw.close();
			//�ݴ°�ü�� �������� �����Ұ� (stream�� �ݾ����� ������ ��������)
			
		} catch (IOException e) {
			System.out.println("[SYSTEM] exception..." + e.toString());
		}
	}
}
