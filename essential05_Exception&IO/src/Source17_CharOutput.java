import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataOutput(Input), ObjectOutput(Input)��
 *  �����͸� �������� ���߿� �ٽ� �о �������� ����ϴ� ��ü
 *  
 *  ����� ������ �α����ϰ��� ����� �˾ƺ��� ������ ��찡 �ִ�.
 */
public class Source17_CharOutput {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.log")) {
			System.out.println("[SYSTEM] READY...");
			
			fos.write(Integer.parseInt("B9", 16));
			System.out.println(Integer.parseInt("B9",16));
			fos.write(Integer.parseInt("AE", 16));
			System.out.println(Integer.parseInt("AE", 16));
			fos.write(13);
			fos.write(10);
			// �ٹٲ� ǥ�⸦ byte�� �����Է�
			String d= "���ڿ� ���";
			byte[] b = d.getBytes(); //String�� 16���� byteǥ�����·� �����ϴ� method
			fos.write(b);
			
			System.out.println("[SYSTEM] DONE");
			
		} catch (IOException e) {
			System.out.println("[SYSTEM] exception..."+e.toString());
		}
	}
}
