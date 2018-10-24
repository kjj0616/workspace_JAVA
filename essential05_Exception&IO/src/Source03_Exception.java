
/*
 *  Exception �� �������� ��� �߰��ǰ�,
 *   �����ڵ鵵 ���� ����Ҽ� �ֱ� ������ �� �ܿ�ٴ°� �Ұ����̴�.
 */

// �ڵ�󿡼� ���Ƴ��� �ִ� �ͼ��� RuntimeException, (�ʼ� handle�� ���ص� �Ǵ� �ͼ���)
class InvalidException extends RuntimeException{		
	// �ϳ��� ���������Ͱ� �������� ������ �ͼ���
}

// �ͼ����� �����ϴµ�, �� �ͼ��ǵ� RuntimeException ���� extends �ɾ
// �ͼ��� ��ü ���� �� �ϰ�, �� �ͼ�����
// triangle ��ü�� ���鶧, �� �������� �ﰢ���� �ȸ�������� ��쿡 �ͼ����� �߻����Ѷ�

class NonTriangleException extends RuntimeException{
	
	/*
		a, b, c �� ���� �����̰� c�� ���� �� ���̶�� �Ѵٸ�
		c < a + b �̸� �ﰢ���� ������.
    */
}

//==================================================================
class Triangle{
	int x,y,z;
	
	Triangle(int x, int y, int z) {
		if(x<=0 || y<=0 || z<=0 ) {
			throw new InvalidException();
		}
		
		// �ϳ��� ������ ���� �ΰ��� ���� �� Ŀ�ߵ�
		
		// ����ȭ ����
		//if( x+y<=z || x+z<=y || y+z<=x) 
		
		if ((x>y && x>z && x>= y+z)||(y>x && y>z && y>= x+z)||(z>x && z>y && z>= x+y)) {
			throw new NonTriangleException();
		}
		this.x=x;
		this.y=y;
		this.z=z;			
	}
}

public class Source03_Exception {
	public static void main(String[] args) {
		try {
			new Triangle(1, 2, -3);
		} catch (InvalidException e) {
			System.out.println("InvalidException...");
		} catch (NonTriangleException e) {
			System.out.println("NonTriangleException...");
		}
		//------------------------------------------------------
		try {
			new Triangle(3, 4, 1);
			
				//�������� ���ܸ� �����ؼ� ǥ���ϴ� ���
		} catch (InvalidException | NonTriangleException e) { 
			System.out.println("InvalidException | NonTriangleException");
		}
		
		
	}
}
