package java_plus;
/*
����� ���� ����ó�� Ŭ������ ����
����ó�� Ŭ������ ��ӹ޾� ó��
��������� ����ó�� Ŭ���� ���

class Ŭ������ extends ����ó��Ŭ���� {

}

class �Ϲ�Ŭ����{

	######### ����� 1 ###########
	method() throws ��������ǿ���ó��Ŭ����{
	
	}
	
	or
	
	######### ����� 2 ############
	try{
		throw new ��������ǿ���ó��Ŭ����();
		
	}catch(��������ǿ���ó��Ŭ���� ee) {
	
	}
	
}
 */

class my_excep extends Exception{
	String msg="";
	
	public my_excep(String msg) {	// �μ��� �ִ� ������
		// super(msg); 				// �μ��� �θ𿡰� �ѱ�
		this.msg = msg;
	}
	
	public my_excep() { 			// �μ��� ���� ������
		// super(msg);				// �μ��� �θ𿡰� �ѱ�
		this.msg = "�˼��մϴ�. ���� ���ϳ��� ���� ó���ϰڽ��ϴ�.";
	}
	
	@Override
	public String getMessage() {
		return "�����޽��� : "+msg;
	}
	
	@Override
	public void printStackTrace() {
		//super.printStackTrace();
		System.out.println(getMessage());
	}	
}



public class Chap10_4_�����_����_����ó��_Ŭ���� {
	
	static void meth() {
		try {
			throw new my_excep();
		} catch (my_excep e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		meth();
	}
}
