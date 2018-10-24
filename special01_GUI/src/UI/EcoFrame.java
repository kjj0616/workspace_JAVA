package UI;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class EcoFrame extends JFrame {
	public EcoFrame() {
		setLayout(null);
		
		setSize(900, 440);
		
		DeltaPanel pn1 = new DeltaPanel();
			pn1.setBounds(20,20,300,300);
	//	add(pn1);
		
		DeltaPanel pn2 = new DeltaPanel();
			pn2.setBounds(420,20,300,300);
	//	add(pn2);
		
		// JFrame�� �⺻������ �����Ǿ��ִ� panel
		// getContendPane()�� ���� �������� ������� JPanel�� ���� ���
			
		getContentPane().add(pn1); //���⿡ add�� ���ѵ� ���� ���
		
		setContentPane(pn2); // Jrame�� ������ �⺻Panel�� �ٲٴ� ���
		
		//�Ϲ������� ���ÿ� ���� add���ٴ� �� ������� add�ϴ� ��찡 ����. 
				
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}	
}
/*
 
	�����ų �� �ִ� ���̾ƿ��̳�, ������Ʈ��, Ư���г��� �� �����Ѵ�.
	�̰� �ڵ带 ����غ��鼭 Ȯ���غ� �ʿ�� ����, tool�� ����ؼ� �ϳ��� Ȯ���غ���.

	Eclipse �� �ƴ� ������ ���α׷��� �ʿ����� �ʰ�, Eclipse�� �÷������� ��ġ�ϸ� �ȴ�.
	google -> WindowBuilder
	https://www.eclipse.org/windowbuilder/ ���� [download] - [lastest version]
	
	�ּ�â�� �� ��θ� ����
	http://download.eclipse.org/windowbuilder/latest/ (��)
	
	Eclipse - Help -> install new Software
	�ּҺ��� + enter , ������ ��ġ ����	
	
*/