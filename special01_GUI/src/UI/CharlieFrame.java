package UI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * JFrame �̶�� �����̳ʿ� ���� �����Ǵ� ���̾ƿ��� ���캸�Ҵµ�,
 *  ��·�� ���̾ƿ��� �ϳ��ۿ� ������ �ȵȴ�.
 *  ���̾ƿ��� ��� ������ �ϰ� �ʹٸ�..?
 * 
 *  JPanal �̶�� JFrame�� ������ �Ǵ� Container �� Component�� ����ϸ� �ȴ�.
 */
public class CharlieFrame extends JFrame {
	public CharlieFrame() {
		setTitle("Mixed Layout");
		setLayout(new BorderLayout());
		
		JLabel lb = new JLabel("round 1");
		add(lb, BorderLayout.NORTH);
		
		JPanel pn = new JPanel();
			pn.setLayout(new GridLayout(1, 2));
			
			JButton bt = new JButton("READY");
			pn.add(bt);
			
			JPanel rpn = new JPanel();
				rpn.setLayout(new GridLayout(3, 3));
				for (int cnt = 1; cnt <=9 ; cnt++) {
					rpn.add(new JButton());					
				}
			pn.add(rpn);
		add(pn, BorderLayout.CENTER);
		
		setSize(500, 250);
	}
}
