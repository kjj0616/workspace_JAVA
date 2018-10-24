package ch07_ObjectDesign;
class Player {
	String name;
	int balance;

	/*
		�� Player ��ü�� ���������, name�� balance�� �� �����ؼ� ����� �ְԵ� �����ڸ� ����
		�̸��� �����ؼ� ����� �ְԵ� ����(�̸��� ������ ���� 100000���� �ʱ��ڱ����� ������ �ְ�)
	*/

	Player(String name){
		this(name,100000);
	}

	Player(String name, int balance){
		this.name = name;
		this.balance = balance;
	}
	
	String current(){
		return "���� ����ڸ� : "+name + " / ���� �ݾ� : " +balance;
	}
}
