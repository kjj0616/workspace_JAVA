import java.awt.*;
import javax.swing.*;

/*
 * Source01 ������ main�� ����Ǵ� �������� 
 * ���� Base ��ü���� �����ؼ�, Component ��ġ�� �غ��Ҵµ�,
 * 
 *  ����, ���� ���·� ����� JDialog �� �ΰ��� ����� ���α׷��� �����ٰ� �����ϸ�,
 *  �� ������ ���踦 �ؾߵǴ� ���ŷο��� �ִ�.
 * 
 *  GUI ���α׷��� �Ҷ���, ���� extends �� �̿��ؼ� ���踦 �Ѵ�.
 */

class AlphaFrame extends JFrame {
	AlphaFrame() {
		LayoutManager m = new GridLayout(3, 4);	// ���ڸ�� ���鶧 ����ϴ� ���̾ƿ�
		setLayout(m);
		for(int i=1; i<=12; i++) {
			JToggleButton bt = new JToggleButton(String.valueOf(i));
			add(bt);
		}
		setSize(240,320);
	}
}


public class Source02_GraphicUI {
	public static void main(String[] args) {
		JFrame f1 = new AlphaFrame();
		f1.setVisible(true);
		JFrame f2 = new AlphaFrame();
		f2.setVisible(true);
		System.out.println("main ... before terminate");
	}
}
