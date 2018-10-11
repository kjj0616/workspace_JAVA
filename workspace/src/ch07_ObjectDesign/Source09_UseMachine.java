/*
	��Ű�� ó�� ��������, ����Ʈ ��Ű������
	��Ű�� ó���� ��ü�� ����ϴ� ��Ȳ�� �Ǹ�?

	���� ��Ű����� ������ �������̵� ������ �ȴ�.
	Ÿ ��Ű�����, �̰� ������ �ʿ��ϴ�.
		-�����ϴ� ����� �ΰ����ε�,
		1. ��üŸ�Ծտ� �Ҽ��� �����ΰų�,
		2. import �� ó���صΰų�

		��, �ش� ��ü�� public ��ü�� ��쿡 ���ؼ�,
	
	�����Ҽ� �ִ� ��ü�� �⺻ access�� ���� ��Ű�������� �����ϴ�.
	Ÿ ��Ű�������� ȣȯ�Ǵ� ��üŸ���� �����ϰ� �ʹٸ�, public ��ü�� �����ؾߵȴ�.
	�׷��� import Ȥ�� �Ҽ������ؼ� ����Ҽ� �ִ�.
*/

import baseball.PitchingMachine;
import baseball.Ball;
import baseball.Hitter;

class Source09_UseMachine {
	public static void main(String[] args)	{
		Hitter h = new Hitter("�ε�");
		//h.levelUpIn(0);

		baseball.PitchingMachine pm = new PitchingMachine(0);
		for(int cnt = 1; cnt<=10; cnt++){
			Ball b = pm.pitch();
			System.out.println(b.current());
			boolean r = h.swing(b);
			System.out.println("������� : "+r);
			System.out.println(h.current());

			//System.out.println(b.course);
		}
		// new Ball(1,4);
		// ball �����ڰ� public�� �ƴϹǷ� ���������� �ȵ�
		// ���� ��Ű���� ��Ī�ӽ��� ���� ���������� ����
	}
}
/*
---------- ������ ----------
Source09_UseMachine.java:27: error: course is not public in Ball; cannot be accessed from outside package
			System.out.println(b.course);
			                    ^
1 error

��� �Ϸ� (0�� ���) - ���� ����
*/

/*
	��ü����� �ܺ�(������ ��Ű���� ������)����
	ȣ���� �Ǹ� �ȵǰų�, ���� ���ٽ� ������ �Ǵ� �͵��� ��ȣ�ϰ�,
	�����ϰ� ���� ���ؼ� ������ �����̴�.

	��üŸ�Կ��� (defalut) / public �� �ΰ��� ���� �����ϰ�

	����, ������, �Լ� ���� chd 4���� �����Ҽ� �ִ�.

	: private	-���� ��Ű�������� ���� ������ ������ ��

	: (defalut)	-�⺻���� : ������Ű�������� �����Ӱ� ���

	: protected	-Ÿ��Ű���� �Ϻ��� ��� ������ �Ǵ� ��Ȳ�� ����

	: public		-��𼭵� �����Ӱ� ���� ����

	(��üŸ���� �����Ҷ� �ٿ��θ� �ǰ�,
		������, �����ڳ�, �Լ��� �տ��ٰ� ���� ������ ���� �ؾ� ��.)
	
*/

/*
---------- ������ ----------
Source09_UseMachine.java:7: error: cannot find symbol
		PitchingMachine pm = new PitchingMachine();
		^
  symbol:   class PitchingMachine
  location: class Source09_UseMachine
Source09_UseMachine.java:7: error: cannot find symbol
		PitchingMachine pm = new PitchingMachine();
		                         ^
  symbol:   class PitchingMachine
  location: class Source09_UseMachine
Source09_UseMachine.java:9: error: cannot find symbol
			Ball b = pm.pitch();
			^
  symbol:   class Ball
  location: class Source09_UseMachine
3 errors

��� �Ϸ� (0�� ���) - ���� ����

--> �ǵ��� �����
*/

/*
---------- ������ ----------
Source09_UseMachine.java:23: error: constructor PitchingMachine in class PitchingMachine cannot be applied to given types;
		PitchingMachine pm = new PitchingMachine();
		                     ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
Source09_UseMachine.java:25: error: pitch() is not public in PitchingMachine; cannot be accessed from outside package
			Ball b = pm.pitch();
			           ^
Source09_UseMachine.java:26: error: current() is not public in Ball; cannot be accessed from outside package
			System.out.println(b.current());
			                    ^
3 errors

��� �Ϸ� (0�� ���) - ���� ����
*/