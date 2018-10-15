package java_plus;
/*

5. ĸ��ȭ - ��������� ��� ����(private)�ϰ� �޼ҵ�� ����(public) �ϴ� ���� ��Ī

 ��� ������ ���������� �������� ���� ������ų�� �ִ� ������ ū �������� ������ ����
 ���� (�޸𸮰���)�� ���������� ���� �ϱ� ���� private ���
 �޼ҵ� - ��������� ���ؼ� public ���, �޼ҵ忡 ���� ������ ��ȯ�� �⺻�� ���
 	setter - ������ ���� ����
 	getter - ������ ���� ȣ��
 	
 	�޼ҵ��̸� -set������(�μ�)
 				1. �������� ù���ڴ� �빮��
 				2. ����ϴ� �μ����� ��������� ���� �̸����� �Ѵ�.
 				
 			   -get������()
 			    1. �������� ù���ڴ� �빮��

 ��Ŭ���� Ȱ���
  �޴� - source - generate getters and setters... �� ���� ĸ��ȭ ����
  
 */

class cap_c{
	private String name;
	private String id;
	private int tel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	
	private int a = 10;
	
	public void setA(int a) {
		this.a=a;
	}
	public int getA() {
		return a;
	}
}

class cap_exam{
	private String name;
	private int kor, eng, mat, tot, avg;
	public cap_exam(String name, int kor, int eng, int mat) {
		setName(name);
		setKor(kor);
		setEng(eng);
		setMat(mat);
		setTot();
		setAvg();
	}
	public void print() {
		System.out.println("���� : "+getName());
		System.out.println("���� : "+getKor());
		System.out.println("���� : "+getEng());
		System.out.println("���� : "+getMat());
		System.out.println("���� : "+getTot());
		System.out.println("��� : "+getAvg());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
		
	public void setMat(int mat) {
		this.mat=mat;
	}
	public int getMat() {
		return mat;
	}
	
	public void setTot() {
		this.tot = kor+eng+mat;
	}
	public int getTot() {
		return tot;
	}
	
	public void setAvg() {
		this.avg=tot/3;
	}
	public int getAvg() {
		return avg;
	}
}

public class Chap08_3_ĸ��ȭ {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		cap_c aa = new cap_c();
		
		//aa.a =30;
		aa.setA(3);
		System.out.println(aa.getA());
		
		cap_exam eee = new cap_exam("�嵿��",99,88,77);
		
		eee.print();
	}
	// ��ȭ���� Ŭ������ �����Ͽ� ����غ�����
	
	// ����� �ʼ� �Է� ���� : id, ����, ��ȭ��ȣ, �󿵽ð�, �¼���ȣ
	
	// ������ ���� ���ɻ��� : ����, ��ȭ��ȣ
	
	// ��½� ��� �׸��� �� �־�� ��
}
