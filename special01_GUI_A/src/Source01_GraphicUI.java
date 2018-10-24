import java.awt.*;
import javax.swing.*;

/*
 * �÷��� ���� �ؼ� ���캸�Ҵ� ��ü���� , 
 * ���� � ����(��,������,�ȵ���̵�)�� ���α׷��� �����, 
 * ���� ������ ó���� �ϱ� ���ؼ� �� �˾ƾߵǴ� �ʼ����� ��ü���̿���.
 * 
 * �� ������Ʈ������ ��������� ���ؼ� �ܰ�(UserInterface) �� Graphic ȭ ��Ű���� �Ҷ�
 * ���Ǵ� ��ü���� ���캸���� �Ѵ�.
 * 
 * GUI�� ���࿡ ���Ǵ� ��ü���� ������ �پ��ϰ�, ��ü���� ��ɵ鵵 �� ����. 
 * 
 * cf# GUI ���࿡ ���Ǵ� ��ü���� javax.swing ��Ű����, java.awt. ��Ű�� ���ʿ� ���谡�Ǿ��ִ�. 
 */

public class Source01_GraphicUI {
	public static void main(String[] args) {
		/*
		 * ����������� ������ GUI ������ ,
		 * �⺻ Base�� �� Container �迭�� ��ü�� �����ؼ�,
		 * ��ġ�� ������� �Ҳ��� ������, Component �迭�� ��ü�� ��ġ���� ������ ���·�
		 * �����ϸ� �ȴ�.
		 */
		/*
		 *  �⺻ Base�� �Ǵ� Contanier �迭�� ��ü�� ũ�� 3������ �ִ�.
		 * 	JFrame (�⺻Base Container) , JWindow, JDialog ��� ��ü�̴�.
		 */
		
		JFrame f = new JFrame();	// ��ü������ �ϰ� invisible ���� ����
		f.setSize(500, 400);	// width, height
		f.setLocation(300, 100);
		
		// f.setTitle("Graphic UI");
		LayoutManager layout = new FlowLayout(0);   //new GridLayout(1, 2);
		f.setLayout(layout);
		
		JButton bt = new JButton();
		bt.setText("START");
		
		JButton bt2 = new JButton("STOP");
		
		f.add(bt);
		f.add(bt2);
		
		// JFrame Container �� ������ ������ ������ ������, ž��� ������Ʈ�� ������ full�� ��Ÿ����. 
		// ��ġ�� ��ƾߵǴµ�,
		
		f.setVisible(true);	// �� setVisible(true) �� ���ؼ� GUI�� ������ ��.
		
		System.out.println("Terminate");
		/*
		 * GUI ������ ū �帧�� ���캻�Ű�, 
		 * Layout �� ������� ������ �� �ְ�
		 * ����� UI ���࿡ ����Ҽ� �մ� Component �� ��ü�� ��͵��� �ִ��� �˾ƺ���.
		 */
	}
}
