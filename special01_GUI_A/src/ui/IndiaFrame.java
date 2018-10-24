package ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * �̺�Ʈ �߻��� ����·� ��Ƽ� ó���ؾߵǴ��� ���캸�Ұ�,
 * �̰� ������ �̺�Ʈ�� ���ؼ� � ���α׷��� ���ư��Բ� �Ϸ���..? 
 *
 * Up & Down �ߴ� �� GUI �������� �ѹ� �����鼭 ���캸��.
 */

public class IndiaFrame extends JFrame {
	IndiaEngine engine;
	
	//====================================================
	JTextField textField;
	JLabel lbStatus;
	JButton btStart;
	
	
	public IndiaFrame() {
		engine = new IndiaEngine();
		
		setTitle("UP DOWN - GUI");
		setSize(400, 400);
		getContentPane().setLayout(null);
		
		btStart = new JButton("S T A R T");
		btStart.setBounds(275, 10, 97, 23);
		getContentPane().add(btStart);
		
		lbStatus = new JLabel("??");
		lbStatus.setEnabled(false);
		lbStatus.setFont(new Font("����", Font.PLAIN, 37));
		lbStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lbStatus.setBounds(12, 69, 360, 193);
		getContentPane().add(lbStatus);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("����", Font.PLAIN, 16));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(134, 293, 116, 30);
		getContentPane().add(textField);
		textField.setColumns(10);
		//=================================================================================
		btStart.addActionListener(new BtStartHandler(this));
		textField.addActionListener(new TfHandler(this));
	}
}
//=========================================================================================================
class TfHandler implements ActionListener {
	IndiaFrame target;
	
	TfHandler(IndiaFrame f) {
		target = f;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * textField���� �۾� �̾Ƽ� ��ȿ�� �˻� ( \\d{1,3} ���� ��ġ)
		 * ������, parseInt�� �ؼ� engine�� compare ��Ű�� 
		 * ���ڿ��� ������ ��. �̰� JOptionPane.showMessageDialog �� ���
		 * isRun ���ؼ� üũ�ؼ� true ��,
		 *   tell�� ���ؼ� ���� ���ڿ��� label�� ����
		 * �װԾƴϸ�,
		 *   label�� ?? �� �������ְ�, ��ư�� Ȱ��ȭ �ϰ�, ������ ��Ȱ��ȭ
		 */
		String in = target.textField.getText();
		if(in.matches("\\d{1,3}")) {
			int d = Integer.parseInt(in);
			String rst = target.engine.compare(d);
			JOptionPane.showMessageDialog(target, rst);
			if(target.engine.isRun() )  {
				target.lbStatus.setText(  target.engine.tell()   );
			}else {
				target.lbStatus.setText("??");
				target.lbStatus.setEnabled(false);
				target.textField.setEnabled(false);
				target.btStart.setEnabled(true);
			}
		}else {
			target.textField.setText("");
		}
		
	}
	
}

//=========================================================================================================
class BtStartHandler implements ActionListener {
	IndiaFrame target;
	BtStartHandler(IndiaFrame f) {
		target = f;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		target.engine.start();
		String r = target.engine.tell();
		target.lbStatus.setText(r);
		
		target.btStart.setEnabled(false);
		target.lbStatus.setEnabled(true);
		target.textField.setEnabled(true);
		target.textField.requestFocus();
		/*
		 * targetUI ���ο� ������ Engine �� start �� ���ְ�
		 * btStart �� enabled false ó��
		 * lb �� tf�� enabled true ó��
		 * engine���� tell�� ���ϸ�, �������°� �����µ�
		 * �̰� lb�� setText
		 */
	}
}






