package java_plus;
/*
1.���

 1) ���
 - ���� Ŭ������ ����
 - ���� �ϰ��� �ϴ� Ŭ������ �θ�Ŭ������ �����Ͽ� �̿�
 - Ŭ������ �����̳� ȣ����� ���ٰ���
 - ���� ���� ��� �Ұ�

 2) ��Ӱ� Ŭ���� ��������
 - �������̵� : �޼ҵ��� ������. ��Ӱ���� �̷���� ��ü���� ���迡��
 			 ������, �޼ҵ���� �θ�� ���� ��� �ڽ��� �켱����
 - super : �θ� ��� ������, �ڽ� Ŭ���� ���ο����� ��밡��
 - �θ� ������ : �θ�Ŭ������ �����ڰ� ���ǵǾ��� ���
  			 �ڽ� Ŭ������ �����ڿ��� �̸� ����ؾ� �Ѵ�.
 - ��������� : �������̵� ��ü�� �ѹ��� �������� �Ѿ� ���� �Ұ�
 			--> �ܰ躰 �θ� ���� �õ�
 - ���ÿ� �ΰ� �̻��� Ŭ������ ��ӹ��� �� ����
 
2.��� ���
 Ŭ������ extends �θ�Ŭ������{
 }
 
3.������ ���
 1) �ڽ��� �⺻�����ڿ� super()�� �����Ǿ� ����
 2) �ν��Ͻ� ������ �θ�Ŭ���� �� �θ��� �����ڸ� �ݵ�� ���� ȣ����
 3) �θ��� ��� �޸� �Ҵ� : �θ��� ���ٺҰ� --> �θ�Ŭ�������� �����ؾ� �Ѵ�
 4) �θ��� ������ : �θ��� ���ٺҰ� --> �θ�Ŭ�������� �����ؾ��Ѵ�
 5) �ڽ��� ��� �޸��Ҵ� : �θ��� ����� ���ٰ����Ͽ� ���� ���氡���ϴ�
 6) �ڽ��� ������ : �θ��� ����� ���ٰ����Ͽ� ���� ���氡���ϴ�

 */
class grand{
	int gg = 10000;
}
class parent1{
	
}

class parent extends grand{
	int gg = super.gg;
	
	// �θ������� super�� �Ѵܰ辿 ������ �����ϹǷ�
	// �� �ڽĸ��� ������� �ٸ��� ���� �ֻ��� �θ� ������� �Ѵ�
	
	int a = 30;
	void meth_1() {
		System.out.println("�� �θ� �޼ҵ�");
	}
	parent(int a) { //�θ��� �����ڰ� �����Ѵ�.
		this.a=a;
	}
	parent(int a, int b) { //�θ��� �����ڰ� �����Ѵ�
		this.a =a;
	}	
}
class child extends parent { //���
	child(){
		//super.a = b;
		super(3000);
		//�θ� Ư�������ڰ� �����Ѵٸ� �ڽ�Ŭ������ �����ڿ��� �����ؾ� �Ѵ�
		//�θ�����ڰ� �ݵ�� �� ���� �־�� �Ѵ�.
		
		super.a=b;
		//���� ���Ŀ��� ������ �����ϴ�
		
		System.out.println("�� �ڽĻ����� ����");
	}
	child(int c){ //�ڽĻ����� ��� �θ�����ڸ� �����ؾ��Ѵ�
		//super(3000);
		super(100,200);
	}
	int b = 50;
	int a = 300; //�θ�� ��ø�� ��� �ڽ�Ŭ������ ���� �켱(�������̵�)
	int c = super.a;
	//�θ������ڸ� �̿��Ͽ� �ڽ��� ����� �θ��� ����� �����Ѵ�.
	//int d = super.super.gg;
		//�θ� �����ڴ� ������ �� �����ϴ�
	int d = super.gg;
	void meth_2() {
		System.out.println("�� �ڽ� �޼ҵ�");		
	}
	void meth_3() {
		System.out.println("�θ�a:"+super.a);
	}
	void meth_1() {
		super.meth_1();
		System.out.println("�� �������̵� �޼ҵ�");
	}
}

class child2 extends parent { //�ϳ��� �θ� �������� �ڽ�Ŭ������ ��� ����
	child2() {
		super(7000);
	}
	void meth_1() {
		System.out.println("�� �θ� �مf��");
	}
}
/*
class child3 extends parent,parent1{ // ���߻�� �Ұ� 
	child3(){
		super(9000);
 	}
}
 */
public class Chap08_1_���_extends {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		child cc = new child();
		System.out.println(cc.b);
		System.out.println(cc.gg); //����������� ������ ����
		System.out.println(cc.d);
		cc.meth_2();
		
		System.out.println(cc.a); // ������� �θ�Ŭ������ ����� ���� ����
		System.out.println(cc.c); //
		//System.out.println(cc.super.a);
		//������ �����ڷ� �θ������ڸ� ����� �� ����
		cc.meth_1();
		cc.meth_3();
		
		parent pp = new parent(90);
		pp.meth_1();
		//System.out.println(pp.b);
		//pp.meth_2();
		//�θ�Ŭ������ �ڽ�Ŭ������ ����� ���� �Ұ�
		
		child2 c2 = new child2();
		
		c2.meth_1();
	}
}
