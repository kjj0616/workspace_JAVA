import java.awt.*;
import javax.swing.*;

/*
 * �÷��� ���� �ؼ� ���캸�Ҵ� ��ü����,
 *  ���� � ����(��,������,�ȵ���̵�)�� ���α׷��� �����ϴ�,
 *  ���� ������ ó���� �ϱ� ���ؼ� �� �˾ƾߵǴ� �ʼ����� ��ü���̾���.
 *  
 * �� ������Ʈ������ ��������� ���ؼ� �ܰ�(UserInterface)�� Graphic ȭ ��Ű���� �Ҷ�
 *  ���Ǵ� ��ü���� ���캸���� �Ѵ�.
 *  
 * GUI�� ���࿡ ���Ǵ� ��ü���� ������ �پ��ϰ�, ��ü���� ��ɵ鵵 �� ����
 * 
 * cf #
 * 		GUI ���࿡ ���Ǵ� ��ü���� javax.swing ��Ű����, java.awt ��Ű�� ���ʿ� ����Ǿ��ִ�.
 * 
 */
public class Source01_GUI {
	public static void main(String[] args) {
		/*
		 * ����������� ������ GUI������
		 *     �⺻ Base�� �� Container �迭�� ��ü�� �����ؼ�
		 *     ��ġ�� ������� �Ҳ��� ������ ,
		 *     Component �迭�� ��ü�� ��ġ���� ������ ���·� �����ϸ� �ȴ�.		 * 
		 */
		/*
		 * �⺻ Base�� �Ǵ� Container �迭�� ��ü�� ũ�� 3������ �ִ�.
		 *  ->  JFrame(default?�⺻Base Container), JWindow, JDiaLog ��� ��ü�̴�.
		 */
		
		JFrame f = new JFrame("title"); // ��ü������ �ϸ� invisible ���� ����
		//JDialog f = new JDialog(); //�����â ����
		//JWindow f = new JWindow(); //Ÿ��Ʋ�� ���� ���� â
		
		f.setSize(500, 400); // width, height
		f.setLocation(300, 100); //������ 0,0����
		f.setTitle("Graphic UI");	// title ����, JWindow�� ����
		
		//LayoutManager layout = new GridLayout(1, 2);
		LayoutManager layout = new FlowLayout(0);
		f.setLayout(layout);
		
		JButton bt = new JButton();
		bt.setText("START");
		
		JButton bt2 = new JButton("STOP");
		
		f.add(bt);
		f.add(bt2); //���Ǽ��������� component�� frame�� �� ������
		
		// JFrame Container �� ������ ������ ������ ������,
		// ž��� ������Ʈ�� ������ full�� ��Ÿ����. 
		
		// ��ġ�� ��ƾߵǴµ�,
		
		f.setVisible(true); // �� setVisible(true)�� ���ؼ� GUI�� ������ ��
					
		System.out.println("Terminate");
		
		/*
		 * GUI ������ ū �帧�� ���캸��,
		 *  Layout �� ������� �����Ҽ� �ְ�
		 *  ����� UI ���࿡ ����Ҽ� �ִ� Component �� ��ü�� ��͵��� �ִ��� �˾ƺ���.
		 */
	}
}
