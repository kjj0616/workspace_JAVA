package java_plus;
import java.io.*;

		/*
		1. ����
		 ���α׷� ������ �߻��Ǵ� ������ ���� ���۵� Ȥ�� �������� ���Ḧ ����
		 ����ó���� ���� �������� ���·� ������� ����
		 
		 try{ } ������ ������ �ݵ��
		 ������ ó���� ����ó�� : catch(����Ŭ���� �μ�){ } ������ �ʿ�
		 
		 try~catch() �� ¦���� �̷������ �Ѵ�
		 �߰��� try�� �� ���ԵǾ�� �ȵȴ�
		 catch()�� ����ó��Ŭ������ ���� �����ε�, �������̵����� �������� �� �� �ִ�.
		 
		 finally{ } // ������ ó������(��������)
		 			// �ݵ�� �Ǹ������� �ۼ�
		 
		 1. �����߻����� ���� --> try{ }
		 
		 2. ���� ó�� --> catch(�����μ� e){ }
		 
		 		���
		 	Exception ---> IOException : ����¿���
		 		   ArithmeticException : ��������ȣ
		 
		 3. ������ ���౸�� ---> finally{ }
		
		*/

public class Chap10_1_����ó�� {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		try { //�����߻� ���� ����
			System.out.println("try ����");
			int a = 0/3;
			int b = 3/0; //�����߻�
			System.out.println("����ó��");
		}catch(ArithmeticException e) { //���� ���� ����ó��
			System.out.println("0 ������");
			return; //main() ����
		}catch(Exception e){
			System.out.println("���ܹ߻�");
			return; //main() ����
		}finally {
			System.out.println("�ý�������");
		}
		
		
	}
}
