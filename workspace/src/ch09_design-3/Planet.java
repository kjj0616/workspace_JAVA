/*
	class �� �ƴ� �ٸ� Ű���带 �̿��ؼ� ����

	Ư������

	1. enum
	��ü�� �����ϸ鼭 �ش�Ÿ������ ��� �̸� �����ؼ� �����ΰ� ����ϴ� ����
*/

enum Planet{
	MERCURY(2438.7e3, 3.023e23), EARTH(6378.12e3,5.9736e24);
	
	
	double weight;
	double radius;

	Planet(double r, double w){
		radius = r;
		weight = w;
		System.out.println("������ "+this);
	}

	double getGravity(){
		return 6.67384e-11*weight/(radius*radius);
	}

}