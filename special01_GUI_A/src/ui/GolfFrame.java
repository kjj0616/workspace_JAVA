package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Gui�� �����µ� �־ �ʿ��� ��ü��� 
 * WindowBuilder ��� Plug-In �� �̿��ؼ� ����� UI �� ���� ������ �� ���캸�Ҵ�.
 * 
 * �� UI �� ���ؼ� ���α׷��� ���ư��� �Ϸ���, Event ��°� ó���ϴ� ����� �˾ƾ� �Ѵ�.
 * 
 * UI���� ����ڰ� � �ൿ�� �ϰ� �Ǹ� Event�� �߻��ϰ� ���ְ� 
 * �̰� ���α׷������� �̹� Event�� ĳġ�ϴ°� �� ������ ���ִ�. 
 * 
 * ���α׷��� �������, Event�� �߻������� � �� �ϰڴٰ�, ������Ʈ���� ������ ���ָ� �ȴ�.
 * ������Ʈ���� �����Ҽ� �ִ� �̺�Ʈ ������ ���ݾ� �ٸ���.
 * 
 * �׷��� ��� ������ �ϴ°ǰ�..?
 * 
 */
class BtActionHandler implements ActionListener {
	JTextField targetTf;
	JLabel targetLb;
	
	BtActionHandler(JTextField tf, JLabel lb) {
		targetTf = tf;
		targetLb = lb;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("bt .. actionPerformed.." + e);
		String txt = targetTf.getText();
		targetLb.setText(txt);
		targetTf.setText("");
	}
}

class TfActionHandler implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("tf .. actionPerformed.." + e);
	}
}

//==========================================================
public class GolfFrame extends JFrame {
	private JTextField tf;
	public GolfFrame() {
		setSize(415, 309);
		getContentPane().setLayout(null);
		
		JButton bt = new JButton("New button");
		bt.setBounds(164, 193, 97, 23);
		getContentPane().add(bt);
		
		tf = new JTextField();
		tf.setBounds(152, 145, 116, 21);
		getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lb = new JLabel("New label");
		lb.setBounds(178, 83, 57, 15);
		getContentPane().add(lb);
		// ȭ�� ������ ����
		//============================================================
		// JButton ���� ���� ����ڰ� ��ư�� ������ Action Event ��°� �߻���Ű�� �������ִ�.
		// �� Action �߻��� �հ��� �ϰ� ������, ActionListener(I) �� ���� ��ü�� �����ؼ�
		
		tf.addActionListener(new TfActionHandler());
		// ���� �̺�Ʈ�� �߻��ϰ� ������ ������ �ϴ°� �ƴ϶�, 
		// �����ؼ� GUI ��ü���� ���¸� Ȯ���̳� ������ �ϰ��� �Ѵٸ�..?
		// �������, ��ưŬ�������� TextField�� �������� �̾Ƽ� , JLabel�� �����ϴ�,
		
		ActionListener i = new BtActionHandler(tf, lb);	
		// �� �̺�Ʈ������ ���ư��� �����ؾߵǴ� GUI��ü���� ���� �Ѱ��ְ�,
		// �̺�Ʈ �߻��� �����Ҽ� �ְ� �صξ�� �Ѵ�.
		bt.addActionListener(i);
		// Listener�� ���̴µ� �� Listener�� ���� �� ���� �ؾߵ� ������Ʈ�� ���ٸ�..? ��ü�� �ѱ�Ⱑ ������ ������..?
	}
	
}
