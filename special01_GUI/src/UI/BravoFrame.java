package UI;
/*
 * 
 */
import java.awt.*;
import javax.swing.*;
public class BravoFrame extends JFrame {
	public BravoFrame() {
		// �����ų�� �ִ� ���̾ƿ��� ũ�� 4���� ������ ���� ���
		/*
		 * 1. GridLayout
		 *  - ���ڸ��(�ٵ���)���� ������� �Ҷ� ����ϴ� ���̾ƿ�
		 * 	- GridLayout �����ÿ� JFrame�� �俵���� ������ ��,���� ����
		 *  - Component ���� ����ũ��� ���ʴ�� ���پ� -> �� ������
		 *  
		 * 2. BorderLayout
		 *  - ȭ���� ��,��,��,�� + Center �������� �����ؼ� ������Ʈ�� ������Ƽ� ��ġ
		 * 
		 * 3. AbsoluteLayout (null -> ��������)
		 * 	- ȭ���� ��ǥ�� �����ؼ� ���ϴ� ���� ���ϴ� ũ��� ������Ʈ�� ��ġ�ϰ��� �Ҷ�
		 *  - setLayout(null);
		 *  
		 * 4.
		 * 
		 * ==>���̾ƿ� ȥ���� ���ؼ��� penal (JPenal)�� �����ϰ� �߰��ϴ� ������� ����Ѵ�.
		 * ==> �гκ��� ���̾ƿ��� �����ϰ� �װ��� �߰��ϴ� ��� 
		 */
		//initTypeA();
		initTypeB();		
	}
	private void initTypeB() {
		setTitle("AbsoluteLayout");
		setLayout(null);
		setSize(500, 300);
		
		JTextField tf = new JTextField();
			tf.setSize(100,30);
			tf.setLocation(300, 180); // JFrame����
		JPasswordField pf = new JPasswordField();
			pf.setBounds(300,220,150,30); //x,y,with,height ���ü���
			
		add(tf);
		add(pf);
		
	}
	
	private void initTypeA() { //����ȣ�⸸ �����ϰ�
		setTitle("BorderLayout");
		setLayout(new BorderLayout());
		setSize(400,300);
		
		JLabel lb = new JLabel("Graphic User Interface");
		add(lb, "North"); // BorderLayout.NORTH
		JTextField tf = new JTextField();
		add(tf, BorderLayout.SOUTH);
		JToggleButton bt = new JToggleButton("READY");
		add(bt, BorderLayout.CENTER);
		
		
	}
}
