/*
	ó���� ��Ű�� ���ο��ٰ� ��ü�� �����ϰ�, �Ϲ��������� �����ص� ��
*/
package baseball;

/*
	��Ű�� ó���ߴٸ�,
	public ���� �����صξ�� Ÿ ��Ű������ ������ ��.
	(public���� �����Ϸ��� �����̸��� ������ ��ġ���Ѿ� ��)

	public class �� ����� �νĵǱ� ������,

	�� �ȿ� ����� ������, ����, �Լ��� ȣ��Ǵ°� ������ �ٽ� ������ �ؾ߸� �Ѵ�.
*/
public class PitchingMachine {

	int hard;	// 0 , 1 , 2

	public PitchingMachine(int hard){
		this.hard = hard;
	}

	public Ball pitch(){ //����Ÿ���� Ball ��ü
		int s = 80 + hard*20 + (int)(Math.random()*20);
		int c = -1 + (int)(Math.random()*3);
		
		Ball b = new Ball(s, c);
		if(Math.random() >0.8){
			b.course = -2;
		}
		return b;
	}
}
/*
---------- ��Ű�������� ----------
Design09_PitchingMachine.java:6: error: class PitchingMachine is public,
should be declared in a file named PitchingMachine.java

public class PitchingMachine {
       ^
1 error

��� �Ϸ� (0�� ���) - ���� ����

 --> public ����� ���ѻ��� ���ϸ� == ��ü��
*/