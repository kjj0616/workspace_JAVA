package java_plus;
	/*
	
	4. Ŭ���� (staitc) �� �ν��Ͻ� �� ��
	
				����ƽ(Ŭ����)				�ν��Ͻ�
	
	�޸�		�޼ҵ�					�޼ҵ�-->��-->����
	
	����		����					�޸��Ҵ� �� ����
	
	����		��𼭵� ����			�����ڿ� ���� ����
	
	ȣ��		����ƽ->����ƽ			�ν��Ͻ� -> ����ƽ, �ν��Ͻ�
	
	���		����					���� �� ��ȣ
	
	*/

class S_c_1{
	int a = 10;			//�ν��Ͻ� ����
	static int b = 20; 	//Ŭ����(����ƽ) ����
	
	void method1() { 			//�ν��Ͻ� �޼ҵ�
		int aa = a;				//�ν��Ͻ� ��ü ���ٰ���
		int bb = b; 			//����ƽ ��ü ���� ����
		System.out.println("�� �ν��Ͻ� �޼ҵ�_1");
		method2();				//�ν��Ͻ� �޼ҵ� ���ٰ���
		st_method2(); 			//����ƽ �޼ҵ� ���ٰ���
		
	}
	
	static void st_method1() {		//����ƽ �޼ҵ�
		// int aa = a;  			//����ƽ �޼ҵ��̾ �ν��Ͻ� ��ü�� ���ٽ�ų�� ����
		int bb = b;					//����ƽ ��ü ���� ����
		System.out.println("�� ����ƽ �޼ҵ�_1");
		//method2();				//�ν��Ͻ� �޼ҵ� ���ٺҰ�
		st_method2();				//����ƽ �޼ҵ� ���� ����
		
		S_c_1 ss = new S_c_1();				//�ڽ� Ŭ������ �����Ҵ�
		int aaa= ss.a;						//�Ҵ��� �����ڸ� �̿��Ͽ� �ν��Ͻ� ���ٰ���
		System.out.println("����ƽ �޼ҵ忡�� �Ҵ���� a : "+aaa);
						//���� �޼ҵ尡 �����ִ� Ŭ������ ��������� �޴� ���� �ƴϴ�
						//���� ������ ss�� ����� �޴� ���̴�.
		ss.method2();
	}
	void method2() {
		System.out.println("�� �ν��Ͻ� �޼ҵ�_2");		
	}
	static void st_method2() { //����ƽ �޼ҵ�
		System.out.println("�� ����ƽ �żҵ�_2");
	}
}

public class Chap07_4_static_vs_Instance {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		S_c_1 s1 = new S_c_1();
		S_c_1 s2 = new S_c_1();
		
		s1.a=100;
		s1.b=200; //�޼ҵ� ������ ��ġ ���� ��� ������ ���� �ٲ��.
		System.out.println("s1.a:"+s1.a);
		System.out.println("s2.a:"+s2.a);
		System.out.println("s1.b:"+s1.b);
		System.out.println("s2.b:"+s2.b);
		
		System.out.println("S_c_1.b : "+S_c_1.b ); //����ƽ ������ ���� ����(Ŭ���������� ���ٰ���)
		//System.out.println(S_c_1.a); 			   //�ν��Ͻ� ������ Ŭ���������� ���� �Ұ�
		
		System.out.println("----");
		
		s1.method1();
		System.out.println("----");

		s1.st_method1();
		System.out.println("----");

		//S_c_1.st_method1(); ������ ���� ȣ��Ұ�
		S_c_1.st_method1();   // Ŭ���������� ���� ����
		System.out.println("----");
		
		/*
		 
		s1.a:100
		s2.a:10
		s1.b:200
		s2.b:200
		S_c_1.b : 200
		----
		�� �ν��Ͻ� �޼ҵ�_1
		�� �ν��Ͻ� �޼ҵ�_2
		�� ����ƽ �żҵ�_2
		----
		�� ����ƽ �޼ҵ�_1
		�� ����ƽ �żҵ�_2
		����ƽ �޼ҵ忡�� �Ҵ���� a : 10
		�� �ν��Ͻ� �޼ҵ�_2
		----
		�� ����ƽ �޼ҵ�_1
		�� ����ƽ �żҵ�_2
		����ƽ �޼ҵ忡�� �Ҵ���� a : 10
		�� �ν��Ͻ� �޼ҵ�_2
		----
		
		*/
	}
}
