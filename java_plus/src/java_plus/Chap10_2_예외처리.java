package java_plus;
import java.util.*;
	/*
	
	2. ����� ���� ����
	 -- ����ڿ� ���� ���� �߻�
	 -- throw �� ���ܸ� �Ҵ��Ͽ� ����
	 -- ����� ���� ó���� ������ ��� �Ұ�
	  
	
	
	try {
		throw new Exception("�޽���");
	}catch(Exception e){
		e.�޼ҵ�()
	}
	
	����ó�� try~catch() ==> �޼ҵ忡 ����
	�޼ҵ� ���� ���¿� try~catch()�� ���� �������
	try~catch()�� ����
	
	������ �޼ҵ�(�μ�) throws ����ó��Ŭ����1, ����ó��Ŭ����2
	{
		
	}
	
	*/
public class Chap10_2_����ó�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id ="aaaa", pw="aaaa";
		while(true) {
			try {
				System.out.println("�α��� �� �ּ���");
				System.out.print("ID : ");
				String in_id = sc.next();
				System.out.print("PW : ");
				String in_pw = sc.next();
				
				if(!id.equals(in_id))
					throw new Exception("��ġ�ϴ� ���̵� �����ϴ�");
				else if(!pw.equals(in_pw))
					throw new Exception("��ȣ�� ���� �ʽ��ϴ�");
				else
					System.out.println(id+"�� �ȳ��ϼ���");
				break;				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
