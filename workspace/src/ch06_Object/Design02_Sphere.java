package ch06_Object;
/*
	��(����) ��� ��ü�� �������� �Ѵ�.
*/
class Sphere {
	/*
		storage
	*/

	int radius;
	
	/*
		procedure
	*/
	// 1. �ʿ��Ҷ� �ڽſ��� ������ �����������͸� �̿��Ͽ�, ���̸� ������ִ� ��� 4pir^2
	double calcArea(){
		return 4 * 3.141592 * radius * radius; 
 	}

	// 2. ������ ������ ���� ���Ǹ� ����ؼ� �˷��ִ� ��� 4/3 pi r^3
	double calcVolume(){
		//		4.0/3.0				* Math.pow(radius, 3); 
		return (4 / 3.0) * 3.141592 * radius* radius* radius;
		// ��  4/3 != 4/3.0 ��
		// ���� ������ �Ҷ� �����Ұ�
	}

	// 3. ������Ű���
	void grow(int d){
		radius += d;
	}

	// 4. �ڽ��� �������� Ư��value���� ū�� �ƴ��� �˷��ִ� 
	boolean greaterThan(int cmp) {
		if ( radius > cmp)
			return true;
		else 
			return false;
	}
		//return radius >cmp ? true : false;
		//return radius >cmp;

	// 5. ���� ������ �� �����ϰ� ���ο� ���������� �����ϴ�
	void change (int newRadius ) {
		radius = newRadius;
	}

	
}
