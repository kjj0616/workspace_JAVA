package ui;

import javax.swing.JFrame;

public class EcoFrame extends JFrame {
	public EcoFrame() {
		setLayout(null);
		
		setSize(900, 440);
		
		DeltaPanel pn1 = new DeltaPanel();
			pn1.setBounds(20,20,300,300);
		// add(pn1);
		
		DeltaPanel pn2 = new DeltaPanel();
			pn2.setBounds(420,20,300,300);
		// add(pn2);
		// getContentPane�� ���� �������� ������� JPanel�� ���� ���
		getContentPane().add(pn1);	// ���⿡ add�� ���ѵ� ���� ���
		
		setContentPane(pn2);	// JFrame�� ������ �⺻Panel�� �ٲܼ��� �ִ�.
	}
}
/*
 * �����ų�� �ִ� ���̾ƿ��̳�, ������Ʈ��, Ư���г� �� �� �����Ѵ�.
 * �̰� �ڵ�� ����غ��鼭 Ȯ���غ� �ʿ�� ����, ���� ����ؼ� �ϳ��� Ȯ���غ���.
 * 
 * Eclipse �� �ƴ� ������ ���α׷��� �ʿ����� �ʰ�, Eclipse�� �÷������� ��ġ�ϸ� �ȴ�. 
 * 	windowbuilder �� ���ۼ�ġ�������� �˻�
 * 
 *  https://www.eclipse.org/windowbuilder/  ���� [download] �� [lastest version] �� ����θ� ����
 * 
 *  http://download.eclipse.org/windowbuilder/latest/   (��)
 *  
 * Eclipse ���� Help >> Install New Software 
 * 
 * 
 */ 
