/*
	�� �� ��üȭ

	���α׷��� ����µ� �־ ��ü�� �����ϴµ�,
	���õȰ͵��� ��� ��Ű��(����) ó���ؼ� �����ϴ°� �����Ѵ�.

	(�������� ���� ��Ű�� ó������ ���� ��ü���� default ��Ű�� �Ҽ����� ���谡 �ȴ�)
	��Ű���� �����ؼ� ������ ��ü���� ������ �� ����� �ٸ���.
	
	-2���� ���

	1. �ɼ����� �ذ��ϴ� ���
		javac -d , ���ϸ�(.java ����) / �Ϲ� ������:  javac ���ϸ�(.java����)
		- ����鼭 ������ �����°� ����ó��
	
	2. ó���� ��Ű���� �۾������������� ���� �ҽ������� �� �ȿ� ����
*/

package baseball;

class Ball {
	int course;
	int speed;
	
	Ball(int sp, int co){
		this.speed = sp;
		this.course = co;
	}

	String current(){
		String str = speed + "Km ";
		switch(this.course){
		case -1:
			return str + "�ٱ��� �ڽ�";
		case 0:
			return str + "���� �ڽ�";
		case 1:
			return str + "���� �ڽ�";
		}
		return str + "�˼����� �ڽ�";

	}
}
