import java.io.IOException;

/*
 * �ڹٿ��� Exception ��ü���� �������� �����صξ���.
 *  �ռ� ���캻 RuntimeException ��ü���� �ؼ�,
 *  IndexOutOfException, NullPointerException ��ü ���� ���� ���� ����.
 *  
 *  ���α׷��� ���̻� �����ʿ䰡 ���ٰ� �����ϴ� ��Ȳ�� ��ü�� ���� �����аű� ������,
 *  �� ��Ȳ�� ���� ��ü���� ����ȭ���� �����ϴٺ���, ������ �پ����� ���̴�.
 */

import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Source02_Exception {
	public static void main(String[] args) {
		String str = "�ڹ��� ���ڿ�";
		//str.substring(5, 2);
				
		//System.out.println(str.length());
		List<String> li = new ArrayList<>();
		//li.add(3, "������");
		// �ͼ��� ��ü�� �̿��ؼ� ������ ��Ʈ���� �صθ�, ������ ���忡�� ���ǹ��� ó���� ���ص� �ǰ�,
		// ��ü�� ���� ������ ���忡�� �����ؼ� ����ϱ� ������ ���� ������ ���α׷��� ��������
		// ����� �ϰ� ���� �� �� �ִ�.
		
		/*
			�� Exception ��ü��	ũ�� �ΰ����� �з��� �Ǵµ�,
			
			1. ��ġ�ص� �Ǵ� �ͼ���, (�ͼ���ó���� �ʼ��� �ƴ�)  -Checked Exception
				- JVM�� ũ�� �ǿ����� ����, if�� ���α׷������� �� ���Ƴ��� �ִ� �͵��� ����
				
			2. ��ġ�ؼ��� �ȵǴ� �ͼ��� (�ͼ���ó���� �ʼ���)	-Unchecked Exception	
				- ���� ������ �ǰ����� �ƴ� ���ܵ��, ���α׷������� ���Ƴ��°� �Ұ����ϰ�
				  ������ ��� �ǳĿ� ���� �߻��Ҽ��� �ְ�, �ƴҼ��� �ִ� ���ܵ��
				  �̷��� ���ܴ� JVM������ ���°� ���ƾ߸� �ϴ� �͵�
				
			����¿� ���õ� ��ü�鵵 Ÿ ��ü���̶� ����������, Exception�� �߻��ϱ� ������,
			���� ���� ó���� �ʼ��� �ͼ��ǵ� ���ַ� �߻��ؼ� ó������ ���� �˾ƾ� �ȴ�.
			
		*/
		
		// Socket ��ü�� ��ſ� ���Ǵ� ��ü�ε�,
		// �� ���� ������ �ͼ��ǵ��� �߻��ǰ� ������ִ�.
		// UnknownHostException, IOException,  IllegalArgumentException, �̷��� 3��
		// ���߿���, �տ� 2���� �ʼ� ó�� �ͼ���, �ڿ� �ϳ��� �ʼ�ó���� �ƴ�.
		// �տ� �ΰ��� �ͼ����� ó���� ���� ������ ��ü ����� �Ұ����ϴ�.
		
		try {
			new Socket("192.168.10.27", 135);
			System.out.println("��ü ���� ����");
		}catch (UnknownHostException e) { // java.net
			System.out.println("UnknownHostException");
		}catch (IOException e) {	//java.io
			System.out.println("IOException");
		}catch (IllegalArgumentException e) { //java.lang   //�ʼ��� �ƴ�
			System.out.println("IllegalArgumentException");  
		}
		
		System.out.println("main...end...");
		
		/* #cf)--------------------------------
		C:\Users\kgitbank>nslookup	//cmd>��ɾ�
		�⺻ ����:  kns.kornet.net
		Address:  168.126.63.1
		
		> www.naver.com
		����:    kns.kornet.net
		Address:  168.126.63.1
		
		���� ���� ����:
		�̸�:    www.naver.com.nheos.com
		Addresses:  210.89.160.88
		          125.209.222.142
		Aliases:  www.naver.com
		--------------------------
		
		cmd> netstat
		--���� ����Ȯ�� ��ɾ�
		*///-------------------------------

	}
}
