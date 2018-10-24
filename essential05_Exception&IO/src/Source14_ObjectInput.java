import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

public class Source14_ObjectInput {
	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("array.sav"));){
			
			// ObjectInputStream ��ü ������ Exception�� �߻��Ҽ� �ִ�.
			// InputStream ��ü�� ���� 4byte�� ���� �о, Ȯ�ο� �� (.readShort 2��)
			
			// ex)fail...java.io.StreamCorruptedException: invalid stream header: 00459945
			// ������ header�κ��� �߸��ǰų� �ƴѰ�쿡 �߻��ϴ� ����
			
			// EOFException
			// �о ������ ���� ���, ���̰� �߸��Ȱ��
			
			/* ------File ����
			int[] data = new int[] {4,1,4,15,11,6,2};
			boolean[] flag = new boolean[] {true, true, false};
			String day = "WED"; 
			*/
			
			System.out.println("try success...input ready");
			System.out.println(ois.available()); //�̰ɷ� Ȯ�� �ȵ�
			
			Object o = ois.readObject();	//
			System.out.println(o instanceof int[]);
			int[] a = (int[])o;
			System.out.println("int[] ="+a.length+"..."+a[0]);
			boolean[] b = (boolean[])ois.readObject();
			System.out.println("boolean[] ="+b.length+"..."+b[0]);
						
			String s = (String)ois.readObject();
			System.out.println(s+ "..."+s.matches("[A-Z]{3}"));

			// ��µǾ��ִ� ��ü ������ �𸣸�, �о�� ��ư�
			//ois.readObject();	// �о ��ü�� ������ EOFException�� �߻�
			// available ���� �ȳ��ͼ�, �а��� �ϴ� ��ü ������ �𸣸� �о�� �����
			
			
			
			//ois.close(); ������ �ڵ�ó����
		} catch (StreamCorruptedException e) {
			System.out.println("���������� ���� �ʽ��ϴ�.");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("fail..."+e.toString());
		} catch (ClassNotFoundException e) { //���� �����ߵǴ� �ٸ��迭�� Ex
			e.printStackTrace();
		}
	}
}
