import java.io.File;
import java.io.IOException;

public class Source12_File {
	public static void main(String[] args) {
		// File ��ü�� ���ؼ� �ܼ��� ������ ��°� �Ӹ� �ƴ϶�,
		// ���α׷������� ���Ͻý��� ��� �� ���� �ִ�.
		
		File root = new File("c:\\workspace\\temp");
		
		File t = new File(root, "storage");
		System.out.println(t.getAbsolutePath()+ " ? "+ t.exists());
		boolean f = t.mkdirs(); // ���丮 ���� : �������� ���ϵ�
							   // ������ �����ϸ鼭 true ����,
							   // �����ϰų�, ������ ���������ʰų�, ���ٱ��Ѿ��ų� ..�ؼ� �����Ұ��� false
		System.out.println(f);
		
		// mkdir() ���ٴ� mkdirs() ����� ���� Ȱ���� ���� �ȴ�. why? �߰��ܰ踦 ����� ������
		File a =new File(t, "data.sav");
		/*
		try {
			boolean r =a.createNewFile(); //FileOutput �� exception �ߴ� ��Ȳ�� �����ϰ�
			
										  // .createNewFile �� try~catch ó���� �ʿ��ϴ�
			System.out.println(r);
		} catch (IOException e) {
			System.out.println("fail");
		}
		*/
		boolean rf = a.renameTo(new File(root, a.getName())); 
		// a.renameTo(new File(root, a.getName())); // �̵���ġ, �̸� 
		System.out.println("renameTo = "+ rf); //���̸� ���� : ������ ���� �����ϰ� �̵�
		
		root.renameTo(new File("c:\\", root.getName())); // ���丮�� �̸����� �̵�, ���θ�ϵ� �̵� 
		
		File tt = new File("c:\\temp", "data.sav");
		boolean z = tt.delete(); // ������ ���縸 �ϸ� 100% ������
								 // ���͸��� �ڽ��� ��������(�� ���͸���) ������
		System.out.println(z);
	}
}
