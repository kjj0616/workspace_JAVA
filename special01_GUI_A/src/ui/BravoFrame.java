package ui;

/*
 *  
 */
import java.awt.*;
import javax.swing.*;

public class BravoFrame extends JFrame {
	public BravoFrame() {
		// �����ų�� �ִ� ���̾ƿ��� ũ�� 4���������� ���� ����Ѵ�.
		/*
		 *  GridLayout  
		 *   - �ٵ��� ������� ������� �Ҷ� ����ϴ� ���̾ƿ�
		 * 	GridLayout �����ÿ� JFrame�� �俵���� ������ ��,���� ���ҵǰ�
		 *  Component ���� ����ũ��� ���ʴ�� ���پ� �� �״����� ��ġ��
		 *  
		 *  BorderLayout
		 *   - ȭ���� ��,��,��,��,���� �������� �����ؼ� 
		 *   ������Ʈ�� ���� ��Ƽ� ��Ƽ� ��ġ�ϰ� ��
		 *
		 *  AbsoluteLayout
		 *   - ȭ���� ��ǥ�� �����ؼ� ���ϴ� ���� ���ϴ� ũ��� ������Ʈ�� ��ġ�ϰ��� �Ҷ�
		 *   
		*/
	//	initTypeA();
		initTypeB();
	}
	private void initTypeB() {
		setTitle("Absolute Layout");
		setLayout(null);
		setSize(500, 300);
		
		JTextField tf = new JTextField();
		tf.setLocation(300, 180);	// JFrame ����
			tf.setSize(150, 30);
		JPasswordField pf = new JPasswordField();
			pf.setBounds(300, 220, 150,30);	// x,y,width,height
		
		add(tf);
		add(pf);
	}
	
	private void initTypeA() {
		setTitle("BorderLayout");
		setLayout(new BorderLayout());
		JLabel lb = new JLabel("Graphic User Interface");
		add(lb, "North");	// BorderLayout.NORTH
		JTextField tf = new JTextField();
		add(tf, BorderLayout.SOUTH);
		JToggleButton bt = new JToggleButton("READY");
		add(bt, BorderLayout.CENTER);
		setSize(400, 300);
	}
}
