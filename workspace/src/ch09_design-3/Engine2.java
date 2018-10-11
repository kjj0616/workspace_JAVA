/*
	class �� �ƴ� �ٸ� Ű���带 �̿��ؼ� ����

	Ư������

	1. enum
	 : ��ü�� �����ϸ鼭 �ش�Ÿ������ ��� �̸� �����ؼ� �����ΰ� ����ϴ� ����

	2. interface
	 : ���� abstract�� ������ ���踦 �ϰ��� �Ҷ� 
	  (�����ڳ�, ������ ������� ����, �̰� ���� ������� ��ɵ鸸 ����ص� ����)

	 : abstract �� ������ �־, ������ �Ҽ��� �ִ�.
	 
*/
import javax.swing.JOptionPane;

interface Engine{
	// boolean flag;	��������Ұ�
	// Engine(){		������ ���� �Ұ�
	// }

	//abstract void start();
	//abstract String execute();
	//abstract boolean check(String in);

	void init();
	abstract boolean isRun();
	abstract String execute();
	abstract String check(String in);

	//abstract�� class�� �����ϸ� - abstract �����Ұ�
	//�������̽��� �̸� �����س������� ����
	//���� ������ �޼ҵ常
}

class OptionPanePlayer {
	Engine engine;

	boolean insert(Engine e){
		if(engine == null){
			engine = e;
			return true;
		}else{
			return false;
		}
	}

	void remove(){
		if(engine != null)
			engine = null;
	}

	void start(){
		if(engine != null){
			engine.init();
			while(engine.isRun()){
				String o = engine.execute();
				String i = JOptionPane.showInputDialog(null, o);
				String r = engine.check(i);
				JOptionPane.showMessageDialog(null, r);
			}
		}else{
			JOptionPane.showMessageDialog(null,"������ ���� �������ּ���");
		}
	}
}