import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//�÷��� �ٷ�� ���� ����...?

public class Exercise05 {
	public static void main(String[] args) {
		/*
		 * ����Ų��� 31 ������
		 * 	- ����ڴ� �ִ� 3������ �Է°��� (������� ����ó��, ��ġ�� �ȵ�)
		 * 
		 *  - �� �Ϸ��� ���ڸ� �Է��� �ʿ�� ���� (ù��° ���ڰ� ���� ������ +1�̸� ����)
		 *  
		 *  - �� , ������ ��ģ ���ڸ� �ٽ� �Է��ϸ� �й�
		 *  
		 *  - ���� ��ģ ������ ���������� +1�̹� contains�� ����. 
		 *  
		 *  - �������� : 1 ~ 15  
		 *  
		 */
		Scanner cin	= new Scanner(System.in);
		Set<String> s1 = new LinkedHashSet<>();
		List<String> s2 = new ArrayList();
		g: while(true) {
			System.out.print("[SYSTEM] ");
			String in = cin.nextLine();
			String[] ar = in.split(" ");
			if(ar.length>3) {
				System.out.println("Error : type(3 over input)");
				break g;
			}
			System.out.println(ar.length);
			for (int i = 0; i < ar.length; i++) {
				if(!s1.contains(ar[i])) {
					s1.add(ar[i]);
				}
				if(!s2.contains(ar[i])) {
					s2.add(ar[i]);
				}
			}			
		}
		cin.close();
	}
}
