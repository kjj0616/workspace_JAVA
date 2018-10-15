package java_plus;

abstract class abs_shape{
	double area, border;
	abstract double getArea();
	abstract double getBorder();
	abstract String getKind();
	
	void print() {
		System.out.println("��������: "+getKind());
		System.out.println("�ʺ�: "+getArea());
		System.out.println("�ѷ�: "+getBorder());
		
	}
}

class abs_rec extends abs_shape{
	int h,w;
	public abs_rec(int h, int w) {
		this.h = h;
		this.w = w;
	}
	
	@Override
	double getArea() {
		return w*h;
	}
	@Override
	double getBorder() {
		return (w+h)*2;		
	}
	@Override
	String getKind() {
		return "�簢��";
	}
}
	
	
public class Chap09_2_�߻�Ŭ����_�������̽� {
	/*
	 * @param args
	 */
	public static void main(String[] args) {
		abs_shape sh = new abs_rec(5,4);
		sh.print();
	}
}