package UI;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

/*
 * GUI�� �����ϴµ� �־ �ʿ��� ��ü���
 *  WindowBuilder ��� Plug-In�� �̿��ؼ� ����� UI�� �� ���� ������ ���� ���캸�Ҵ�.
 *  
 * �� UI�� ���ؼ� ���α׷��� ���ƾư� �Ϸ���, Event ��°� ó���ϴ� ����� �˾ƾ� �Ѵ�. 
 * 
 * UI���� ����ڰ� � �ൿ�� �ϰ� �Ǹ� Event�� �߻��ϰ� ���ְ�
 * �̰� ���α׷������� �̹� Event�� ĳġ�ϴ°� �� ������ �Ǿ��ִ�.
 * 
 * ���α׷��� �������, Event�� �߻������� � �� �ϰڴٰ�, ������Ʈ���� ������ ���ָ� �ȴ�.
 * ������Ʈ���� ������ �� �ִ� �̺�Ʈ ������ ���ݾ� �ٸ���.
 * 
 * �׷��� ��� ������ �ϴ°��ΰ�?
 */

class BtActionHandler implements ActionListener{
	JTextField targetTf;
	JLabel targetLb;
	
	BtActionHandler(JTextField tf, JLabel lb) {
		targetTf = tf;
		targetLb = lb;		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Bt..actionPerformed.."+e);
		String txt = targetTf.getText();
		targetLb.setText(txt);
		targetTf.setText("");
	}
	
}
class TFctionHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Tf..actionPerformed.."+e);
		
	}
	
}

//==========================================================
public class GolfFrame extends JFrame {
	private JTextField tf;
	public GolfFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton bt = new JButton("New button");
		bt.setBounds(12, 66, 97, 23);
		getContentPane().add(bt);
		
		tf = new JTextField();
		tf.setBounds(12, 35, 116, 21);
		getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lb = new JLabel("New label");
		lb.setBounds(12, 10, 57, 15);
		getContentPane().add(lb);
		
		setSize(400,400); //�������� �� �������ϸ� �����̵ȴ�.
		
		// ȭ�� ������ ����
		//=================================================================================
		// JButton ���� ���� ����ڰ� ������ Action Event ��°��� �߻���Ű�� �������ִ�.
		// �� Action �߻��� �����ΰ��� �ϰ������, ActionListener(I)�� ���� ��ü�� �����ؼ�
		
		// action 
		// 	-> actionListener , ...
		//		->addActionListener
		
		//bt.addActionListener(new BtActionHandler());
		
		// ex) void setAdv(...), void open(){adv.start(name)};
		
		tf.addActionListener(new TFctionHandler());
		// ���� �̺�Ʈ�� �߻��ϰ� ������ ������ �ϴ°� �ƴ϶�,
		// �����ؼ� GUI ��ü���� ���¸� Ȯ���̳� ������ �ϰ��� �Ѵٸ�..?
		// ������� ��ưŬ��������, TextField�� �������� �̾Ƽ� , JLabel�� �����Ϸ���
		
		ActionListener i = new BtActionHandler(tf, lb); 
		// �� �̺�Ʈ������ ���� �����ؾߵǴ� GUI��ü���� �Ѱ��ְ�,
		// BtActinHandler ���� �Ű������� ���� �����ڸ� ���� ���κ����� �־��ش�.
		// �׸��� actionPerformed���� getText�� setText�� �̿��ؼ� �Ѱ��ִ� �̺�Ʈ�� �ۼ��Ѵ�.
		// �� ��鷯�� �ٽ� ��ư�� �־��ش�.
		
		// �̺�Ʈ �߻��� �����Ҽ� �ְ� �صξ���Ѵ�.
		bt.addActionListener(i);
		// Listener�� ���̴µ� �� Listener�� ���� �� ���� �ؾ��� ������Ʈ�� ���ٸ�?
		// ��ü�� �ѱ�Ⱑ ������ ������?
	}
}
