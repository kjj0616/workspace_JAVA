package java_plus;
	/*
	2. �޼ҵ�
	 1) �޼ҵ��� ����
	  
	  ������ �޼ҵ��̸�(�ڷ��� �μ�, �ڷ��� �μ�2, ...){
	  
	  	//�μ��� ��������
	  	
	  	���๮...
	  	
	  }
	
	 2) �޼ҵ��� ���
	  1. �μ�
	  	- ���� �ڷ����� Ŭ������ ���� �� �ִ�.
	  	- Ŭ������ �迭���� �ּ������� ����
	  	- ���������� ��������� �̸��� �������
	  	// ���������� �켱���� �ִ�.
	  	// ��������� �����ϰ��� �� ��� ������ this Ȱ��
	  
	  2. ����
	  	- �ϳ��� �ڷ����¸� ���ϰ�����
	  	- �������� ������ �ʿ��� ��� ��Ȳ�� ���� �迭, Ŭ�������¸� �̿�
	  	- �޼ҵ� ���ο� �޼ҵ带 ȣ���� ��� ������ ���� ���
	  	- ��������� ��쿡�� ������� ������ ����� �ʿ� ����
	  	- ���ϰ��� ���� ó���� �� �־�� �Ѵ�
	  	
	  3. �޼ҵ� �ȿ� �޼ҵ带 ȣ���Ͽ� ����� �� �ִ�.
	   	- �� �۾������� �޼ҵ带 ����
	   	 : �۾� ���μ����� ������ ����
	   	- ���� ������ ���� �޼ҵ带 �����Ͽ� �۾����� ���ظ� ����
	   
	*/
class cla_4_data { 
	int kor, eng, mat, sum;
	String name;
}

class cla_4_ret {
	cla_4_data dd = new cla_4_data(); //������� Ŭ����
	int a=50;	


	void aSet(int a) {
		//���������� ��������� �̸��� ���� ���
		//���������� �켱���� �ִ�
		//��������� �����ϰ��� �� ��� ������ this Ȱ��
		System.out.println("�������� a : "+a );
		System.out.println("������� a : "+this.a);
		return;
	}

	void dd_cal(String name, int kor, int eng, int mat) {
		ddSet(name, kor, eng, mat);
		ddPrint();
		return;
	}
	
	void ddSet(String name, int kor, int eng, int mat) {
		//��������� �̿��� ó��
		this.dd.name=name;
		dd.kor = kor;
		dd.eng = eng;
		dd.mat = mat;
		dd.sum = kor+eng+mat;
	}
	
	void ddPrint() {
		//��������� �̿��� ó��
		System.out.println(dd.name+"\t");
		System.out.println(dd.kor+"\t");
		System.out.println(dd.eng+"\t");
		System.out.println(dd.mat+"\t");
		
	}
	
	void meth_1() {
		System.out.println("�޼ҵ� ���");
		return; //return�� �ƹ��� ������ ����
	}
	
	int meth_2(int a, int b) {
		return a+b;
	}
	
	int[] meth_3(int a, int b) {
		int[] res = new int[2];
		res[0] = a+10;
		res[1] = b+10;
		return res;	
	}
	
	void meth_3_print(int res[]) {
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]+", ");		
		}
		System.out.println();
	}
	
	void meth_uni(int a, int b) {
		//���� ���μ����� ���� �޼ҵ带 ȣ���Ͽ� ���� �޼ҵ�
		
		//1. �����
		int res[] = meth_3(a,b);
		
		//2. ��º�
		meth_3_print(res);
	}
}
public class Chap07_2_method {
	public static void main(String[] args) {
		cla_4_ret aa = new cla_4_ret();
		
		aa.meth_1();
		
		System.out.println(aa.meth_2(10, 20));
		//System.out.println(aa.meth_3(10,20));

		aa.meth_uni(40, 50);
		//int res[]=aa.meth_3(40,50);
		//aa.meth_3_print(res);
		
		
		aa.dd_cal("����", 34, 45, 56);
		
		
		//��������vs������� Ȯ�θ޼ҵ�
		aa.aSet(500);
	}
}

	
	
	
	
	

