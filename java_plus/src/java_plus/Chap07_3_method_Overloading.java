package java_plus;
	/*
	
	3. �޼ҵ��� �����ε�
	   : �޼ҵ��� �̸��� ������ �μ��� �޶� �ٸ� �޼ҵ�� ����
	   
	 -�޼ҵ��� �μ��� �ٸ����
	 
	 1) �μ��� ������ �ٸ����
	   method(int a, int b), method(int a, int b, int c)
	 
	 2) �μ��� �ڷ����� �ٸ����
	   method(int a, int b), method(int a, String b)
	   
	 3) �μ��� ������ �ٸ����
	   method(int a, String b), method(String b, int a)
	   
	 -�μ��� ����Ǵ� �������� �ٸ� �����δ� �λ簡 �ٸ��ٰ� ��������
	   method(int a, String b) method(int c, String b) ==> X
	 
	 -�����ε��� ���������� �ƹ��� ������ ����
	 
	*/ 

class cla_over{
	void meth() {
		System.out.println("�޼ҵ�0");
	}
	
	void meth(int a, int b) { //�����ε�_1
		System.out.println("�޼ҵ�1");		
	}
	
	void meth(String a, int b) {//�����ε�_2
		System.out.println("�޼ҵ�2");			
	}
	
	void meth(int b, String a) {//�����ε�_3
		System.out.println("�޼ҵ�3");			
	}
	/*
	void meth(int c, int d){ // �����ε��� �ƴ�
	  	System.out.println("�޼ҵ�1");
	}
	
	int meth() { //�����ε��� �ƴ�
		System.out.println("�޼ҵ�1");
		return 1;
	}
	*/
	
	void area(int r) {
		System.out.println("���� ����:"+r*r*Math.PI);
	}
	
	void area(int h, int w) {
		System.out.println("�簢���� ����:"+h*w);
	}
}


public class Chap07_3_method_Overloading {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		cla_over aa = new cla_over();
		
		aa.meth();
		aa.meth(1, 2);
		aa.meth("a", 1);
		aa.meth(1, "a");
		
		aa.area(20);
		aa.area(20,30);
		
		
	}
	// ��� ����� ����ϼ���
	 // ����� Ŭ������ �����ϸ�
	 // Ŭ���� ��Ҵ� �μ����� �ٸ�
	 // �ѹ��� - �����, �����ȣ, ����
	 // ���� - �����, �����ȣ, ����, Ư��
	 // ������ - �����, �����ȣ, �����Ǽ�
	 // �����̸��� �޼ҵ�� ����ϼ���(�����ε�)
	
}
