import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Source16_Serializable {
	public static void main(String[] args) {
		/*
		 * Source15���� ����ߴ� item ��ü�� �о�� ����� Ȯ���ߴ��� Ȯ���۾�
		 */
		User n = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("v������v"));) {
			System.out.print("input try..");
			n = (User)ois.readObject();	
			System.out.println("success");
			
			System.out.println(n.toString());
			for(Item m : n.li) {
				System.out.println("    -"+m+" .. "+m.name);
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("fail... "+e.getMessage());
		}
		
		/* ################################################################
		 * 
		 * try~catch ���� throws���� ����
		 * 
		 * --> Ʈ����� ������ ����
		 * 
		 * --> �ѹ��� ������ ���
		 * 
		 * --> �ڵ��� �����Ȳ�� ���ռ��� ����ؾ��Ѵ�.
		 * 
		 * => main�� throws ó���� �ϰԵǸ� �ش� ���ܰ� �߻��� ������ ������ �ȵ�
		 *   try~ catch���� �ɰԵǸ� try���� ������ ��� ������ �ȵ�
		 * 
		 * ################################################################
		 */
	}
}
