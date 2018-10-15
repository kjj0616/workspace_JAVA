package java_plus;
/*
5. ������ coustructor
 ���� : Ŭ������(�μ�){}
 
 ȣ�� : new Ŭ������()
 
 Ŭ������ ������ �� ���(�޸� �Ҵ�)
  - Ŭ������ �������� �ʰ� ����ϴ� ���� �ͺ�Ŭ������ �� -- ������ �Ұ�
 
 Ŭ���� ������ ���� ����Ǵ� �۾�
 
 �޼ҵ�ó�� Ȱ��
  - �������� Ŭ����
  - �����ε����� ��밡��
  - �����ڿ� ���Ǵ� �μ��� �ٸ��� �����ڸ޼ҵ尡 �ٸ������� ����
  
 �������� ���� �����ڷ� Ŭ������ ������ �� ����
  - �����ε����� ���ǵ��� �ʾ��� ��� ���Ұ�
 
 ������ �����
  - ��� ����(1.Ŭ����, 2.�ν��Ͻ�), �޼ҵ� ���� �޸� �Ҵ� �Ŀ� ����  

*/

class con1 {
	int a;
	String s;

	con1() {
		// a=700;
		// s="���켺";
		// con1(700,"���켺"); �����ڷ� �����ڸ� ȣ��Ұ�
		this(700, "���켺"); // �� �ٸ� �����ڷ��� ������ this()�� ���
	}

	con1(int a, String s) { // Ŭ�����̸����� �޼ҵ�ó�� ����
		System.out.println("�� �����ڴ�");
		this.a = a;
		this.s = s;
	}
}

class shape_con {
	int r, w, h;

	shape_con(int r) {
		this.r = r;
		System.out.println("���� ���� : " + r * r * Math.PI);
	}

	shape_con(int w, int h) {
		this.w = w;
		this.h = h;
		System.out.println("�簢���� ���� " + w * h);
	}
}

//-------------------------------------------------------------
class Student {
	String name;
	int kuk;
	int yung;
	int su;
	int kyo;
	int sum;
	double avg;

	Student(String name, int kuk, int yung, int su) {
		this.name = name;
		this.kuk = kuk;
		this.yung = yung;
		this.su = su;
		this.sum = kuk+yung+su;
		this.avg = Double.valueOf(String.format("%2f", sum/3.0));
	}

	Student(String name, int kuk, int yung, int su, int kyo) {
		this.name = name;
		this.kuk = kuk;
		this.yung = yung;
		this.su = su;
		this.sum = kuk+yung+su+kyo;
		this.avg = Double.valueOf(String.format("%2f", sum/3.0));
	}
}

//-------------------------------------------------------------

public class Chap07_5_������constructor {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		con1 c = new con1();
		System.out.println(c.a);
		shape_con sc1 = new shape_con(5); // ���� �� ����
		shape_con sc2 = new shape_con(4, 5);

		new shape_con(6, 5); // ������ �� Ŭ���� -- �͸�Ŭ���� : �������� �Ұ�

		shape_con[] sc_arr = { new shape_con(5), new shape_con(10, 4), new shape_con(5, 56), new shape_con(20), };
		System.out.println(sc_arr[1].w);

		// ���л� : ����, ���� , ���� , ����, ����
		// ���л� : ����, ���� , ���� , ����
		// �����ڸ� �̿��Ͽ� ����, ����, ����, ����, ����� ����ϼ���
		// �̰� ���� �� �迭�� ����� ���� ���� ����� ����ϼ���
		
	}
}
