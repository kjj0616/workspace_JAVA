class Fruit{
	int cnt;
	Fruit(int cnt){
		this.cnt = cnt;
	}
}
//========================================================================
class Apple extends Fruit {
	int cnt;
	Apple(int scnt, int tcnt){
		super(scnt);
		this.cnt = tcnt;
	}
	int total(){
		int cnt = this.cnt + super.cnt;
		System.out.println(cnt+ " / "+ this.cnt + " / "+ super.cnt);
							// �ٸ�cnt
		return cnt;
	}
	double average(){
		System.out.println(cnt+"/"+this.cnt+"/"+super.cnt);
							//2�� ����
		return (cnt+super.cnt)/2.0;
	}
}
/*
	�θ��ʿ� �ִ°ɷ� �� �����, �̷��� ���⵵ �����ѵ� �������� �ֳ�..?
	������ ���ļ� �����ϴ� ���� ���� �幰��,
	�Լ��� ���ļ� ������ �ϴ� ��찡 �ִ�.
*/

//========================================================================
class Source06_DiveExtension {
	public static void main(String[] args)	{
		/*
			Apple ��ü�� ���� total �Լ��� �� �غ���.
		*/
		Apple apple = new Apple(10,20);
		System.out.println(apple.total());
		System.out.println(apple.average());

	}
}
