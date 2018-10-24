import java.io.*;
public class Source10_DataInput {
	public static void main(String[] args) {
		/*
		 * DataOutput�� �ݴ�Ǵ� �۾��� �ϴ� DataInputStream ��ü�� ���캸��
		 * 
		 * ### ����±��� ###
		 * FileOutput(Input)Stream --> DataOutput(Input)Stream
		 * 
		 */
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("output.data"));
			
			// IOException �迭�� FileNotFoundException
			
			System.out.println(dis.available()); // 25
			int m = dis.readInt();				 // 4����Ʈ�� �о(int)
			System.out.println("data = "+ m);
			System.out.println(dis.available()); // --> 21
			double e = dis.readDouble();		 //	8����Ʈ�� �о(double)
			System.out.println("data = "+ e);
			System.out.println(dis.available()); // --> 13
			boolean f = dis.readBoolean();
			System.out.println(f);
			
			String s = dis.readUTF(); 			 // ó������(����) �����ͺκ� +��ŷ (�������� 2����Ʈ�߰���)
			
			// IO �迭�� UTFDataFormetException
			
			System.out.println(s);				 // ���ڿ��� �����߻�����
			System.out.println(dis.available()); // 1		
			System.out.println("available = "+dis.available());
			
			//System.out.println(dis.readInt()); 
			
			//�о �����Ͱ� ������ IOException �� �迭�� EOFException �� �߻�
			
			dis.close();
			System.out.println("try success");
			
			// ó���� ���� exception�� ���� ��Ƽ� catch�ؼ� ����ó���� ����� �ٸ� ������ �����ϴ�.
			
		} catch (IOException e) {
			
			// ���ļ� ó���� ��쿡�� ���ο��� instanceof ������ �̿��� ������ ó���� �����ϴ�.
			
			if(e instanceof UTFDataFormatException) {
				System.out.println("������ �ջ�Ǿ���.");
			}
			//System.out.println("fail...! "+e.getMessage());
			System.out.println("fail... "+ e.toString());
		}
		
	}
}
