/*
	class �� �ƴ� �ٸ� Ű���带 �̿��ؼ� ����

	1. interface
	 : ���� abstract�� ������ ���踦 �ϰ��� �Ҷ� 
	 (�����ڳ�, ������ �����Ѽ� ����, �̰� ���� ������� ��ɵ鸸 ����ص� ����)

	 : abstract �� ������ �־, ������ �Ҽ��� �ִ�.
*/
import javax.swing.JOptionPane;

interface Engine {
	void init();
	abstract boolean isRun();
	abstract String execute();
	abstract String check(String in);
}

class OptionPanePlayer {
	Engine engine;
	boolean insert(Engine e) {
		if(engine == null) {
			engine = e;
			return true;
		} else {
			return false;
		}
	}
	void remove() {
		if(engine != null)
			engine = null;
	}

	void start() {
		if(engine != null) {
			engine.init();
			while(engine.isRun()) {
				String o =engine.execute();
				String i = JOptionPane.showInputDialog(null, o);
				String r = engine.check(i);
				JOptionPane.showMessageDialog(null, r);
			}
		}else {
			JOptionPane.showMessageDialog(null, "������ ���� �������ּ���");
		}
	}
}

