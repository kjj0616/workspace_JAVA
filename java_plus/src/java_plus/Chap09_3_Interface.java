package java_plus;
	/*
	2. �������̽�
	
	 1) ���۸��̽��� Ư¡ - �߻�Ŭ���� ó�� �߻� �޼��带 ����
	 
	   - �߻�ȭ�� �ɵ��� �� ����
	   
	   - �ϳ��� Ŭ�������� ���� �������̽��� ����������
	   
	   - �Ϲݸ޼ҵ�� ������ ����
	   
	   - �������̽��� �����ϴ� Ŭ���������� �ݵ�� �޼ҵ带 �������ؾ� ��밡��
	   
   			: public���� �����ڸ� �Ҵ��ؾ� �Ѵ�.
   			
   	   - �������̽��� ������ ������������ �޼ҵ带 ������ �ؾ߸� �Ѵ�.
   	   
   	  2) ����
   	  
   	   - �������̽��� �����ϴ� Ŭ������ implements �� ���� ����
   	   
   	   - ���ÿ� �������� �������̽��� ����������(��Ӱ� �ٸ�)
   	   
   	   - ������ ��� �������̽��� ���� ����������
   	   
   	   - �������̽��� ������ Ŭ������ �����ϴ� ���� �Ϲ����� �����
   	
   	  3) �������̽� �ڵ�
   	  
   	  ���� :
   	   interface �������̽���{
   	   		�������;
   	   		�߻�޼ҵ�;
   	   }
   	  
   	  ���� :
   	   class Ŭ������ implements �������̽�1, �������̽�2...{
   	   		
   	   		�߻�޼ҵ� ������1(){
   	   		
   	   		}
   	   }
   	   		
   	 
	 */
interface in_1{
	int a=10;
	/*
	void method_1(){
	
	}
	
	*/
	void method_1(); //�ݵ�� �߻�޼ҵ常
					 //abstract�� �����ص� �߻󰳳����� ����
}

interface in_2{
	int a=100, b=20;
	
	abstract void method_1();	// �ݵ�� �߻�޼ҵ常
}

abstract class int_3{
	int a = 10;
	void method_2() {
		int a= 10;
		System.out.println("���¾� �Ϲݸ޼ҵ�");
	}
	abstract void method_1(); //�ݵ�� �߻�޼ҵ常
	
}

abstract class int_4{
	int a=10;
	void method_2() {
		System.out.println("���¾� �Ϲݸ޼ҵ�");
	}
	abstract void method_3();
}

class child_12 extends int_3 implements in_1,in_2{
				//�������̽��� �����ϴ� Ŭ����
				//���ÿ� ���� �������̽��� ��������
	void method_2() {
		System.out.println("���¾� �������̵�");
	}
	public void method_1() { //�������̽��� �޼ҵ� ���Ǵ� public
							 //�߻�Ŭ������ �߻�޼ҵ嵵 ���ÿ� ��밡��
		System.out.println("���¾� �������̽� �޼ҵ�");
	}
	void method_3() {
		System.out.println("���¾� �߻�޼ҵ�");
	}
}
public class Chap09_3_Interface {
	/*
	 * @param args
	 */
	public static void main(String[] args) {
		in_1 aaa = new in_1() {
			public void method_1() {}
		};
		//�������̽��� �޸� �Ҵ��� ��� �޼ҵ��� ���ǰ� �ʿ�
		System.out.println("aaa.a ="+aaa.a);
		
		in_1 bbb = new child_12();
		//�޸� �Ҵ��� Ŭ������ �� �������̽� ����
		//System.out.println("bbb.b = "+bbb.b);
		//�����ϰ� �ִ� Ŭ�������� �ٸ� �������̽��� �����ϰ� �־
		//�̿����� �ٸ� ����� �����Ҽ��� ����.
		bbb.method_1();
		
		child_12 ccc = new child_12();
		ccc.method_1();
		System.out.println("ccc.b = "+ccc.b);
		//�������̽��� ���ǵ� ����������� �������� �� ��� ���� �߻�
		
		/*
		aaa.a =10
		���¾� �������̽� �޼ҵ�
		���¾� �������̽� �޼ҵ�
		ccc.b = 20
 
		 */
	}
}
