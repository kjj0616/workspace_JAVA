/*
	3. ���/(Ȯ��) �� ���Ѽ� ���� ��ü�� �������̶�� �� ������ѵξ��µ�
	�̰� �̿��ؼ� ��ü ��� ���� �Ҽ� �ִٴ� ������ �ִ�.

	�������� �����п� �ִ� �������ν�, �ϳ��� ���� �������� ���·� �����ȴٴ� ������ �ǹ��Ѵ�.
	(���� - ������, �����, ... / ������ : ��, ����, �ΰ�, ...)
*/
class Animal {

	int health;

	void healthUp(){
		health += 20;
	}
	String inform(){
		return "health = "+health;
	}
}

class Tiger extends Animal { //���

}

class Elephant extends Animal {//���

}


class Human extends Animal {

}

class Korean extends Human {//���

}

class European extends Human {//���

}