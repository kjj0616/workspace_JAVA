/*
 *  Object�� ���� ��ӹ޾� ���� �� ����߿�
 *  
 *  2. public boolean.equals(Object obj)
 *   -�⺻�� ���� ��ü���� Ȯ���ϰ� ����Ǿ� �ִµ�
 *    �̰� �����Ͱ� ���� �������� Ȯ���Ҽ� �ְ� ���� �صδ� ���̴�.
 *    ���..?
 *    sample package create
 */
import java.awt.Rectangle;
import sample.Coord;

public class Source04_Object {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,20,100,100);
	//  public Rectangle(int x, int y, int width, int height)
		
		System.out.println(r1);
		System.out.println(r1.toString());
	//    public String toString() {
	//        return getClass().getName() + "[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
	//    }
		
		Rectangle r2 = new Rectangle(10, 20, 100, 100);
		System.out.println(r1 == r2);
		boolean b =r1.equals(r2);
	/*
	    public boolean equals(Object obj) {
	        if (obj instanceof Rectangle) {	
	            Rectangle r = (Rectangle)obj;
	            return ((x == r.x) &&
	                    (y == r.y) &&
	                    (width == r.width) &&
	                    (height == r.height));
	        }
	        return super.equals(obj);
    */
		System.out.println(b);
		
		//=====================================
		Coord c = new Coord(3,2);
		System.out.println(c);
		Coord c2 = new Coord(3,2);
		System.out.println(c==c2);
		boolean bb = c.equals(c2);
		System.out.println(bb); // false�� �ߴ� ����?
		
		Object o = new Coord(11,5);
		//o.x; ��������ȵ�
		System.out.println(o instanceof Coord);	//true
		
	//  ��ü���� ��ȯ(ĳ����)�� �ȴ�.
	//	Coord t = (Coord)o;
	//	t.isDuplicated(c2);
		
		((Coord)o).isDuplicated(c2); //(��ȣ�� ����)
	//	������ü������ �νĽ��Ѽ� ����Ҷ�
	//	�´� ��ü�� ���������
		
	//	Rectangle t2 =(Rectangle)o;
	//	t2.grow(3, 4);
	//	�ش�Ÿ�԰�ü�� �ƴϸ� ���α׷��� �����������
		
		o = null;
		System.gc(); //�������÷��� ��� 1��
		int n = 0;
		for(;n>0;)
			n++;
		
	//	�� �ܿ� Object extends �ɸ��鼭 �����Ե� ��ɵ��� �� �����Ѵ�.
	//	�� ��ɵ鵵 override�� �ؼ� ������ ���Ѿߵ� ���� ��������.
	}
}
