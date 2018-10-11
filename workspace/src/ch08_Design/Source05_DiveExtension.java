/*
	3. super ��� Ű���带 ����ؾߵǴ� ��Ȳ�� �������� �ִ�.

	 -����(�θ�)�ʿ� �Ű����� ���� �����ڰ� �������� �ʴ´ٸ�,
	 ������ ����� �ٸ��� �ٲ��־�� �ϴµ�, �̶� �� Ű���尡 ���ȴ�.

	 -����ϰ��� �ϴ� ������, ����� �θ����� ����ϰ� ������
	 super�� �������ټ� �ִ�.

	 -(����, extends �ɰ� ������ ��, ������ �ִµ� �ִ� �̸�����
	  �ٽ� �� ������ �Լ��� ����°� ����Ѵ�. �׷����� �ݵ��
	  super, this �̷��� �����ؼ� ó���ؾߵȴ�.
	  �������������� ���� ���� ������
*/
class Talent{
	Talent(String a){
		System.out.println("telent created " + a);
	}
	Talent(int a){
		System.out.println("telent created " + a);
	}
	String tell(){
		if(Math.random()>0.5)
			return "�ȳ��ϼ���";
		else
			return "�ݰ����ϴ�";

	}
}

class Actor extends Talent {
	Actor(){		
		// new Talent("??");
		super(11);
		System.out.println("actor created");
	}
	String performance(boolean mode){
		if(mode){
			return "(ȭ���� ���)"+this.tell(); // ������ �ƴϳ� super�� ����
		}else{
			return "(������ �ϸ�)"+super.tell(); 
		}
	}
}
class MovieStar extends Actor{
	MovieStar(){
		// new Actor(); �̷� ��Ȱ�� �ڵ带 �ۼ��ؾߵ�����, ������ �ڵ�����
		// == super(); [�ƹ��������� �����ϸ� �����Ǿ��ִ� �ڵ�]
		System.out.println("moviestar created");
	}
}

//==============================================================================
class Source05_DiveExtension {
	public static void main(String[] args)	{
		Actor a = new Actor();
		String m = a.tell();
		System.out.println(m);
		String b = a.performance(false);
		System.out.println(b);
		//new MovieStar();
		// �ֻ��� extends �� ��ü���� ȣ��(����)��
		// ������ �Ű����� ���� �����ڸ� ã�Ƽ� ȣ��
		
		/*
			Container ��ü�� �ϳ� ����
		*/

		//Container c = new Container();
		/*
			���࿡ �����ϰ��� �ϴ� ��ü�� extends�� ���ؼ� ����� ��ü���
			extends �� �ֻ������� �ϳ��� ���ʴ�� ��������鼭 ��ü�� �ϼ��ȴ�.
			�� �� ���ܰ��� ��ü�� ������Ű�� ��������
			�Ű����� ���� ������ �����ڸ� ã�Ƽ� �����ǰ� ���ִ�.
		*/
	}
}
