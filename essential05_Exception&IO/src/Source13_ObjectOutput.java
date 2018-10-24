import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 *  DataInput/OutputStream �� �̿��ؼ� ,
 *   �⺻value�� ���Ͽ� ����ϰ� �о�� �۾��� ���� �˾ƺ���, ����غ��Ҵ�.
 *  
 *  ���� DataStream���� �̿��ؼ� ������� �����ϴ� ��Ȳ�� ���� �ʴ�.
 *   ����ϰ��� �ϴ� �����Ͱ� �����ϸ� (���� ī�� �̱⿡�� ����ߴ� ������)
 *   ������ �� ���ε��� ����ؾߵǰ�, �����ÿ��� ������ �о �ϳ��� ����� �ǰ�
 *   
 *  �̹��� ���캼 ��ü�� ObjectInput,OutputStream ��ü�ε�,
 *   ��ü������ ������� �Ҽ��ְ� �����ϴ� ������̴�.
 *  
 */
public class Source13_ObjectOutput {
	public static void main(String[] args) {
		int[] data = new int[] {4,1,4,15,11,6,2};
		boolean[] flag = new boolean[] {true, true, false};
		String day = "WED";
				
		try {	//dataoutput 0����Ʈ ���� / ObjectOutputStream - �⺻ 4����Ʈ  
			FileOutputStream fos = new FileOutputStream("array.sav"); // �̰� �����ߴٸ�,
			ObjectOutputStream oos = new ObjectOutputStream(fos);	  // ���� ���ٸ� �ͼ����� �߻�����
				// ObjectOutputStream �� ���� �Ǹ� �⺻ 4byte ����� �ϴ� �Ͼ
			System.out.println("try success! output ready!");
			
			oos.writeObject(data); // ��ü�� ��½�Ű��, ������ �ʿ��� ���·� �ش� ��ü�� �����
								   // ó�� 4byte �⺻���, int->Integer ���
			oos.writeObject(flag);
			oos.writeObject(day);
			
			System.out.println("output complete");
			oos.close();
		} catch (IOException e) {
			System.out.println("fail... "+e.getMessage());
		}
	}
}
