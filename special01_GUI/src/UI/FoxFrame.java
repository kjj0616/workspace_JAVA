package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * Window Builder plug in �� ��ġ���ִٸ�, �� ���� ui ������ �����ϴ�
 * 1. ����� ���� �� extends �ɾ ����(JFrame, JPanel, JDialog ...)
 * 2. ���� explorer���� ���ϸ� ��Ŭ���ؼ� open with windowbuilder edior
 * 3. �Ʒ��� [source]�� �Բ� [design] ���� ����, design�� Ŭ��
 * 
 */

public class FoxFrame extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	private final Action action = new SwingAction();
	public FoxFrame() {
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(547, 461, 152, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(544, 503, 155, 21);
		getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("��������ڵ�", Font.PLAIN, 12));
		lblNewLabel.setBounds(446, 465, 57, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PassWord");
		lblNewLabel_1.setFont(new Font("��������ڵ�", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(446, 507, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Graphic UI");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("��������ڵ�", Font.BOLD, 26));
		lblNewLabel_2.setBounds(469, 125, 230, 89);
		getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 456, 1, 2);
		getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("\uB204\uB974\uC9C0\uB9C8\uC2DC\uC624");
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
