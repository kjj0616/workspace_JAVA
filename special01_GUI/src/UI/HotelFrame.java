package UI;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

class BtConnectHandler implements ActionListener{
	HotelFrame target;
	BtConnectHandler(HotelFrame f) {
		target = f;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("BtConnectHandler.actionPerformed.."); //���� Ȯ�ι�
		String s = target.tf.getText();
		char[] p = target.pf.getPassword();
		target.tf.setEnabled(false); //default true; ��Ȱ��ȭ
		target.pf.setEnabled(false);
		target.btConnect.setEnabled(false);
		String txt = "[SYSYEM] connect to server ..."+s+"..."+p[0]+"*****";
		target.textArea.setText(txt);
	}
	
}
class BtCancelHandler implements ActionListener{
	HotelFrame target;
	BtCancelHandler(HotelFrame f) {
		target = f;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("BtCancelHandler.actionPerformed.."); //���� Ȯ�ι�
		String txt = "";
		target.tf.setText(txt);
		target.pf.setText(txt);
		target.tf.setEnabled(true);
		target.pf.setEnabled(true);
		target.btConnect.setEnabled(true);
		//String rst = "[SYSTEM] ���� ���"; //��������
		txt +="\n[SYSTEM] ���� ���"; // �̹� ����� ������ ��������� �ʰ�
									// �߰��ؼ� �����ִ� �κ�
									// ����ó���� ��������+������ ����̴�.
		target.textArea.setText(txt);
	}
	
}

public class HotelFrame extends JFrame{
	//private Ǯ�� - �ܺ������� �ȵǼ� ��ü���� Ÿ�� ���κ������ �Ұ����ϹǷ�
	JButton btConnect;
	JButton btCancel;
	JTextArea textArea;
	JPasswordField pf;
	JTextField tf;
	public HotelFrame() {
		init();
		
		ActionListener bch = new BtConnectHandler(this); //�ϳ��ϳ��� �ƴ� ��ü ��ä�� �ѱ�
		btConnect.addActionListener(bch);
		
		ActionListener bcch = new BtCancelHandler(this);
		btCancel.addActionListener(bcch);
	}
	private void init() { //���θ޼ҵ�� ��� foldingó���ϸ� ���� ���ϴ�

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300); //�ϵ� �ڵ�
		getContentPane().setLayout(null);
		
		tf = new JTextField();
		tf.setText("WelCome");
		tf.setBounds(12, 10, 116, 23);
		getContentPane().add(tf);
		tf.setColumns(10);
		
		pf = new JPasswordField();
		pf.setBounds(12, 43, 116, 27);
		getContentPane().add(pf);
		
		btConnect = new JButton("Connect");
		btConnect.setBounds(12, 80, 97, 23);
		getContentPane().add(btConnect);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 113, 360, 138);
		getContentPane().add(scrollPane);
		
		btCancel = new JButton("Cancel");
		btCancel.setBounds(130, 80, 97, 23);
		getContentPane().add(btCancel);
		
		textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setBounds(12, 113, 360, 138);
		getContentPane().add(textArea);
	}
	
	
	
}
