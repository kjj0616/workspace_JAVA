package java_plus;
	/*
	3. �������̽��� ���
	 - �������̽� ������ ��� �Ǵ� ���۱����� �������� ���� �߻� �޼ҵ� ����, ���� �������̽��� �����ϴ�
	  �Ϲ�Ŭ�������� ���ϴ� ���·� ���� ����, �������̽��� ���� �̸��� �޼ҵ���� ���� ���๮�� �����Ƿ�
	  �������̽� �� ���� ����� ������
	 - ���� ��� ���� Ŭ������ ��� �߻�޼ҵ带 �������ؾ� ��
	 
	 �������̽��� ������ Ŭ������ ���
	 	�������� interface --> ���� class --> ���� �ڽ� Ŭ����
	 	   �߻�޼ҵ� ------>�θ��߻�޼ҵ�
	 	   						�ڽ��߻�޼ҵ�------->����
	 	   						
	 	�������� interface --> ���� �������̽�---> ���� Ŭ����:
	 					extends(���)		implements
	 					���߻�Ӱ���		(����)
	 							      ���,������ ��� �������̽��� �޼ҵ带 ����	
	 */
interface ll_1{
	void meth_1();
	void meth_2();	
}
interface ll_2{
	void meth_1();
	void meth_3();	
}
interface ll_3{
	void meth_4();	
}
interface ll_tot extends ll_1,ll_2,ll_3{
	
}
abstract class ll_par{
	int a= 10;
	abstract void meth_5();
	
	public void meth_1() {
		System.out.println("�� �θ�Ŭ���� �޼ҵ� 1");
	}
	public void meth_2() {
		System.out.println("�� �θ�Ŭ���� �޼ҵ� 2");
	}
}

class ll_pro extends ll_par{

	@Override
	void meth_5() {
		System.out.println("�ڽ� Ŭ���� �޼ҵ� 5");
		
	}
	@Override
	public void meth_1() {
		System.out.println("�ڽ� Ŭ���� �޼ҵ� 1");
	}
	public void meth_3() {
		System.out.println("�ڽ� Ŭ���� �޼ҵ� 3");
	}
	public void meth_4() {
		System.out.println("�ڽ� Ŭ���� �޼ҵ� 4");
	}
}
//class llm_c implements ll_1,ll_2,ll_3
class llm_c extends ll_pro implements ll_tot{
	//���ձ�� ����� Ŭ����
}
public class Chap09_4_interface��_��� {
	public static void main(String[] args) {
		
		llm_c mc = new llm_c();
		
		/*
		ll_1 in1 = new llm_c();
		ll_2 in2 = new llm_c();
		ll_par par = new llm_c(); 
		*/
	  		 
		ll_1 in1 = mc;
		ll_2 in2 = mc;
		ll_par par = mc;
		
		in1.meth_1();
		in1.meth_2();
		in2.meth_3();
		par.meth_1();
		par.meth_5();
		
//		�ڽ� Ŭ���� �޼ҵ� 1
//		�� �θ�Ŭ���� �޼ҵ� 2
//		�ڽ� Ŭ���� �޼ҵ� 3
//		�ڽ� Ŭ���� �޼ҵ� 1
//		�ڽ� Ŭ���� �޼ҵ� 5

	}
}
