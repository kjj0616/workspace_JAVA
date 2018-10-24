import java.io.*;

public class Source08_DataOutput {
	public static void main(String[] args) {
		/*
		 *  ���Ͽ� ��µǴ� ���´� 1byte�� ��ġ�̴�.
		 *  �� �⺻ ��»��·δ�, ���ϴ� �����͸� ����ϱ� �����.
		 */
		try {
			FileOutputStream fos = new FileOutputStream("output.data");
			System.out.println("output ready..."+ (fos instanceof OutputStream));
			// DataOutputStream ��ü�� FileOutputStream ��ü���� ����Ǵ°� �ƴϰ�,
			// OutputStream ��ü�� �� �ȴ�.
			DataOutputStream dos = new DataOutputStream(fos);
			// �� ��ü�� �̿��Ϥ� �Ǹ�,
			dos.writeInt(4561221); // int 4����Ʈ ���
			dos.writeDouble(3.141592); // double 8����Ʈ ���
			dos.writeBoolean(true);  // 1����Ʈ true 1 false 0
			dos.writeUTF("ȫ�浿"); // ���ڿ����
			dos.write(30);
			
			dos.close();
			System.out.println("try data out success!!");
			
		} catch (IOException e) { 
			// ���� Exception, �ͼ��ǵ� ��ü�� ���� �ִ� ������������ ������ �����
			// FileNotFoundException �� IOException �� ������ ó���� ��ٰ� �����. 
			System.out.println("try fail...cause "+e.toString());
		}
	}
}
