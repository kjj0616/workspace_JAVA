

class QuizEngine{
	int answer;

	String make(){
		int n1 = 1+(int)(Math.random()*10);
		int n2 = 1+(int)(Math.random()*10);
		answer = n1 + n2;
		return "Q ?"+n1+" + "+n2+ "= ";
	}
	boolean check(int in){
		return answer == in;
	}
}

//===================================================================
class ConsolePlayer{
	QuizEngine engine;
	
	void insert(QuizEngine e){
		engine = e;
	}

	void run(){
		for(int cnt=1;cnt <=5;cnt++){
			System.out.println(engine.make());
			int i =Integer.valueOf(System.console().readLine());
			boolean b = engine.check(i);
			if(b)
				System.out.println("A. Correct");
			else
				System.out.println("A. Wrong Answer");

		}
	}
}
//===================================================================
class NewQuizEngine extends QuizEngine{
	String make(){
		int n1 = 1+(int)(Math.random()*30);
		int n2 = 1+(int)(Math.random()*30);
		int n3 = 1+(int)(Math.random()*30);
		answer = n1-n2+n3;
		return "Q. " +n1+" - "+n2+" + " +n3 + " = ";
	}
} // ����� �߰���⺸�ٴ� ����

class EquationQuizEngine extends QuizEngine{
	String make(){
		answer = 3+(int)(Math.random()*10);		
		return "Q. 3x+ 10 = " +(3*answer+10);
	}
} // ����� �߰���⺸�ٴ� ����

//===================================================================

class Source08_DiveExtension {
	public static void main(String[] args)	{
		ConsolePlayer cp = new ConsolePlayer();
//		QuizEngine qe = new QuizEngine();
//		QuizEngine qe = new NewQuizEngine();
		QuizEngine qe = new EquationQuizEngine();
		cp.insert(qe);
		cp.run();

		// ����Ÿ������ �����Ҷ���, �߰��Ȱ��� �����ϱ����� ������ �ƴ�

		// �߰��� �ƴ� ����, ���� ����ϴ� ��ü�� ȣȯ�� �� ��
	}
}
