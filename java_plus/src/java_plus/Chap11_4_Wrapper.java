package java_plus;

/*
	4. Wrapper
	- ������Ƽ�� Ÿ���� �����͸� ��ü�� ���� �� ������Ƽ�� Ÿ���� ǥ���ϴ� Ŭ�������̴�.
	-->������Ƽ�� Ÿ���� ���� ��� ��ü ����
	
	* Wrapper Ŭ������ �����
	 -Byte, Short, Integer, Long, character, Float, Double, Boolean class�� �ִ�.
	 -�⺻���� �����
	 --�ϳ��� ��ü���� �ϳ��� ���� ���� �� �ִ�.
	 --����Ŭ������ ���Ե� ���� �����ϴ� ��� : �����ϱ�->������->������ ���� �̿��Ͽ� �� ����Ŭ������ ����
	 
	* Wrapper Ŭ������ �����޼ҵ�� ���
	 -toBinaryString() : Integer�� Long Ŭ������ ������ �Ķ���ͷ� �Ѱ��� ���� ���κ�Ʈ������ ���ڿ��� �����Ѵ�.
	 -xxxValue : ��ü�ȿ� ����ִ� ���� ������Ƽ�� ������ �����´�.
	 -parseXxx : �Ķ���ͷ� ���� ���ڿ��� �ؼ��Ͽ� ������Ƽ�� ������ �����Ѵ�.
	 -valueOf : �����ڸ� ����ϴ� ���� �޼ҵ�� �Ķ���͸� �Ѱ��ָ� �� ���� ���� ���۰�ü�� �����Ѵ�.
*/
import java.util.*;
public class Chap11_4_Wrapper {
	public static void main(String[] args) {
		String a = "1234";
		String aa = "1234.567";
		//int b = a; �Ϲ��ڷ������� �� ��ȯ �Ұ�
		int b = Integer.parseInt(a); // Int ������ �ڷắȯ
		double c = Integer.parseInt(a); // double <--int�� ��ȯ
		double d = Double.parseDouble(aa);
		int e = (int)Double.parseDouble(aa);
		//int <-(int)<--Double<--String
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		int now_year=2018;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		System.out.println("�Է�:");
		String jumin = sc.nextLine();
		
		int code = Integer.parseInt(jumin.substring(7, 8));
		String sex = "����";
		int add_year = 1900;
		String local="������";
		if(code%2==0)
			sex = "����";
		if(code==3 || code==4)
			add_year = 2000;
		if(code==5 || code==6)
			local="�ܱ���";
		if(code==7 || code==8)
			local="�ܰ���";
		int my_year = add_year+Integer.parseInt(jumin.substring(0,2)); //�¾ ��
		int age = now_year-my_year+1;
		System.out.println("�������:"+my_year);
		System.out.println("����:"+age);
		System.out.println("����:"+sex);
		System.out.println("����:"+local);
		
		
	}
}
