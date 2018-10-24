package UI;

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
 * �̺�Ʈ �߻��� � ���·� ��Ƽ� ó���ؾߵǴ��� ���캸�Ұ�,
 * �̰� ������ �̺�Ʈ�� ���ؼ� � ���α׷��� ���ư��Բ� �Ϸ���..? 
 * 
 */

public class IndiaFrame extends JFrame {
	IndiaEngine engine; // ������ü ���� ���� ����

	// =====================================================
	JLabel lb;
	JButton btStart;
	JTextField tf;

	public IndiaFrame() {
		engine = new IndiaEngine(); // ���ο� ����
		
		setTitle("UP DOWN - GUI");
		setSize(500, 500);
		getContentPane().setLayout(null);
		
		
		btStart = new JButton("Start");
		btStart.setBounds(325, 10, 97, 23);
		getContentPane().add(btStart);

		lb = new JLabel("??");
		lb.setEnabled(false);
		lb.setFont(new Font("��������ڵ�", Font.BOLD, 40));
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		lb.setBounds(12, 46, 410, 179);
		getContentPane().add(lb);

		JTextField tf = new JTextField();
		tf.setEnabled(false);
		tf.setHorizontalAlignment(SwingConstants.CENTER);
		tf.setBounds(161, 230, 116, 21);
		getContentPane().add(tf);
		tf.setColumns(10);

		btStart.addActionListener(new BtStartHandler(this));
		tf.addActionListener(new TfHandler(this));
	}

}

//--------------------------------------------�����۾����� �����۾���õ
class TfHandler implements ActionListener {
	IndiaFrame target;

	public TfHandler(IndiaFrame f) {
		target = f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * textField���� �۾� ���Ƽ� ��ȿ���˻�( \\d{1,3} ���� ��ġ) ������,
		 * parseInt�� �ؼ� engine�� compare��Ű�� ���ڿ��� ������ ��.
		 * �̰� JOptionPane.showMessageDialog�� ���
		 * isRun ���ؼ� check�ؼ� true��
		 *   - tell�� ���ؼ� ���� ���ڿ��� label�� ����
		 * �װԾƴϸ� - label�� ??�� �������ְ�, ��ư�� Ȱ��ȭ�ϰ�, ������ ��Ȱ��ȭ
		 */
		String in = target.tf.getText();
		if (in.matches("\\d{1,3}")) {
			int d = Integer.parseInt(in);
			String rst = target.engine.compare(d);
			JOptionPane.showMessageDialog(target, rst);
			if (target.engine.isRun()) {
				target.lb.setText(target.engine.tell());
			} else {
				target.lb.setText("??");
				target.lb.setEnabled(false);
				target.tf.setEnabled(false);
				target.btStart.setEnabled(true);
			}
		} else {
			target.tf.setText("");
		}
	}

}

//--------------------------------------------�����۾����� �����۾���õ
class BtStartHandler implements ActionListener {
	IndiaFrame target;

	public BtStartHandler(IndiaFrame f) {
		target = f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * targetUI ���ο� ������ Engine�� start ��
		 * btstart �� enabled �� false ó��
		 * lb�� tf�� enalbed�� true ó��
		 * engine���� tell�� ���ϸ�,
		 * �������°� �����µ� �̰� lb�� setText();
		 */
		target.engine.start();
		String r = target.engine.tell();
		target.lb.setText(r);

		target.btStart.setEnabled(false);
		target.lb.setEnabled(true);
		target.tf.setEnabled(true);;
		target.tf.requestFocus();

	}

}
