package ch07_ObjectDesign;
/*
	����ڿ� ��ǻ�Ͱ��� ������� �����Ű�� ���� ��ü�� ����,
	�������Ѽ� ��ߵ� �ڿ����� static ������ �Ϸ��� �Ѵ�.

	static ���� Stage ��ü�� ���� ����µ�,
	���� ȿ���� �ְ� �ʹٸ� ...?
*/
class Stage {
	static int round;
	static int answer;
	static String question;
	//======================================

	String player;
	int score;
	
	Stage(){
		score = 0;
	}

	Stage(String name){
		player = name;
		score = 0;
	}
	void start(String name){
		player = name;
		score = 0;
	}
	
	static void execute(){ //static ��� ������ ������
		round++;
		int n1 = 10+(int)(Math.random()*90);
		int n2 = 10+(int)(Math.random()*90);
		answer = n1 + n2;
		question = n1 + " + " +n2 + " = ?";
	}
	
	boolean cheak(int num){ //static �Ұ�����
		if (answer == num){
			score += 10;
			return true;
		}else
			return false;

	}
	/*
		method�� static������ ���϶��� �����Ұ�
		���ο� �ٷ�� �����Ͱ� �� ��ü ����data�� �ٷ��� �ʾƾ�!
	*/
	String status(){
		return "["+player+"]"+score+"��";
	}

	static String current(){
		// round �ϰ� question�� ����ϱ� ���� ���ڿ��� ���� �����ϰ� ����
		// round ���� ��½� 1�ڸ����� �տ� 0 �߰��ؼ� ����
		String str="";
		if (round<10)
			str = "0"+round;
		else
			str = ""+round;
		return "[ROUND-"+str+"] "+question;
	}
}
