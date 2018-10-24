package java_plus;
/*
	3. ����ó��
	
	try ~ catch		: ��ü������ ����ó���� �� �ϼ��� -> ������ ���μ��� ����
	 				 -> �ڽ��� ����ϴ� ������ ����ó�� �ʿ伺�� ����
	
	throws Exception : ��ü�� ����ó���� ���� ����ó���� �����ϴ� ��ü���� �ѱ�
					 -> ���ܹ߻����� ���� ���μ��� �Ұ���
					 
	re ~ throwing : ���� ����ó���� �״�� �ڽ��� �����ϴ� ��ü�� ����
				throw ���ܺ���;
				
		:�ڽ��� ������ ��ü���� �ѱ�� ����� �Ѳ����� ����ó���� �ʿ伺�� ������ ���
	
		
		
	throw ������ method�� ���Խ��� �ܺο��� ����
	�޼ҵ忡���� �ݵ�� ����ó���� ���ٰ����� throws ����Ŭ����1,...�� �޼ҵ忡 �Բ� �����ؾ� �Ѵ�
	
	--> re ~ throwing
	
	--> �� ����� ���ܸ� �߻���Ű�� �̸� ó���ϴ� ������ �� �޼ҵ带 �����ϴ�
	--> �޼ҵ忡�� ó���ϵ��� ���ܸ� �ٽ� ������ �����̴�
	
	--> ���� �� �޼ҵ忡�� ó���ϱ⵵ �ϰ� �����ϴ� �޼ҵ忡�� ó���ϱ⵵�ϴ�
	--> ���� �۾��� �ʿ�� �� ��� �� �޼ҵ忡���� try ~ catch ������ ����ؾ� �Ѵ�.
	--> 
		//���ο��� �Ȱ��� ó���ؾ��ϴ� ��� (re~throwing)
		//�μ��� ���� ����ó���� �ٽ� ������
		
		  
 	--> ���� �޼ҵ忡�� ����ϴ� ���� �翬�ϰ�
 	   throws ����Ŭ����1 ... �� re~throwing �� ����� �ʿ䰡 ������
 	   �̸� �����ϰ� �ִ� �޼ҵ忡���� try ~ catch ������ ����� �ʿ䰡 ����
 	   
 	 try{
 	 	method();
 	 }catch(){
 	 
 	 }
 	 void method() throws ����Ŭ����1, ����Ŭ����2...{
 	 
 	 	//throws ����Ŭ���� ������ �־�� �ϸ�
 	 	//����ó���� �����ϴ� ����Ŭ�����̾�� �Ѵ�
 	 	throw new Exception();
 	 }
*/

public class Chap10_3_����ó��_re_throwing {

	static void method() throws Exception{ //-----------2, 5
		System.out.println("���ܸ� �����ְڴ� ������"); //--------3
		throw new Exception("������ ������");	//------4(���ܹ߻�)
		
		//System.out.println("���� ������"); //-----�����ų�� ����
		//����ó���� �Ұ����ϰ� ������ throws Exception���� ������ ����
	}
	
	static void method1() { //----------2,5
		try {
			System.out.println("����1�غ�"); //-------3
			throw new Exception("���� 1 ������"); //--------4(���ܹ߻�)
		} catch (Exception e) {
			System.out.println("����1�ޱ�");
		}
		System.out.println("����1 ������ ������");
	}
	
	static void method2() throws Exception { //----------2,5
		try {
			System.out.println("����2�غ�"); //-------3
			throw new Exception("���� 2 ������"); //--------4(���ܹ߻�)
		} catch (Exception e) {
			System.out.println("����2�ޱ�");
			throw e;
		}
		//System.out.println("����2 ������ ������");		
	}
	public static void main(String[] args) {
		
		try {
			method();	//---------1
			method2();
			
		} catch (Exception e) {  //---------6
			System.out.println("����ó��: "+e.getMessage()); //--------7
		}
		//method(); ----���α��� ����
		method1();  //-------������ ������� ����
		//������ method1�� ����ó���� �ʿ䰡 ����
		
		try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("��������");
		
		/*
		���ܸ� �����ְڴ� ������
		����ó��: ������ ������
		����1�غ�
		����1�ޱ�
		����1 ������ ������
		����2�غ�
		����2�ޱ�
		��������
		java.lang.Exception: ���� 2 ������
			at java_plus.Chap10_3_����ó��_re_throwing.method2(Chap10_3_����ó��_re_throwing.java:73)
			at java_plus.Chap10_3_����ó��_re_throwing.main(Chap10_3_����ó��_re_throwing.java:94)
		*/

	}
}
