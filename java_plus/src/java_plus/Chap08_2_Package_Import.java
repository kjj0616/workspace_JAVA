package java_plus;
/*

1. package : Ŭ������ ����
 - �ٸ� ��Ű���� Ŭ������ �̸��� �ߺ��Ǿ ����
 - ���� �� ���� ����
 - ���� ����
 - ���� ����� �����ϴ� Ŭ������ ���� ����ϴ� ���� �Ϲ���
 
2. import : �ܺ� ��Ű���� Ŭ������ �����Ͽ� ����ϰ��� �ϴ� ��� �̿���
 - ����ϰ����ϴ� Ŭ������ �����ð�� -> ��Ű����.Ŭ����;
 - ��Ű���� �����ܰ��� ��� -> ��Ű����.��Ű����.Ŭ����;
 - ��Ű�� �ȿ� ��� Ŭ������ �����ð�� -> ��Ű����.*;
 
3. ���������� : ��Ű�� Ȥ�� ��Ӱ��迡�� ������ �������� ������

				 �� Ŭ����			�� ��Ű��		�ٸ� ��Ű���� �ڼ�Ŭ����		��ü
---------------------------------------------------------------------------------------------				 
public				��					��						��					��

protected			��					��						��				

default(����)		��					��			

private				��

4. import�� ����������
 1) Ŭ������ private�� ���Ұ� --> ���� ����� ���ټ��� ������ �� ���� ����
 
 2) main()���� �ּ� ���� Ŭ������ �޼ҵ�� �ݵ�� public�� ���
 
 3) �ٸ� ��Ű���� ����� ���ؼ��� �ݵ�� public���� ����
 
 4) ��Ű����.*; ���� �θ��� ��Ű�� �ȿ� Ŭ������ ��� ȣ��
 					��Ű���ȿ� ��Ű���� ȣ������ �ʴ´�
 					
 5) ��Ű���� �ٸ��� ���� Ŭ���� �̸��� ��� ���������ڰ� �켱�� ���� ȣ��
 	// public --> protected --> default --> private
 	// ���� �ǰ� �ִ� ���� ��Ȯ�� �����ϰ� �ִ� Ŭ������ ȣ��
 	// ��Ȯ�� ���ø� ���ؼ� ��Ű����, Ŭ���������� �����Ͽ� �ߺ��� �̸��� ȥ���� ����                                                                                                                            
 

 */

//package a_p;
import java.util.*;


// import b_p.b_c; //����� ���� ��Ű���� Ŭ������ ȣ��
// import b_p.a_c;
//import b_p.*; //���� �θ��� ��Ű�� �ȿ� Ŭ������ ��� ȣ��
			  //��Ű�� �ȿ� ��Ű���� ȣ������ �ʴ´�

public class Chap08_2_Package_Import {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		a_p.a_c aaa = new a_p.a_c();
		// ���� Ŭ�����̸��� ��� ���������ڰ� �켱�� ���� ȣ��
		// public --> protected --> default --> private
		// ���ٵǰ� �ִ� ���� ��Ȯ�� �����ϰ� �ִ� Ŭ������ ȣ��
		// ��Ȯ�� ���ø� ���ؼ� ��Ű����.Ŭ���������� �����Ͽ� �ߺ��� �̸��� ȥ���� ����
		
		System.out.println(aaa.a); //10
		Random rr = new Random();
		b_c bbb = new b_c();
		System.out.println(bbb.b); //20
		*/
	}
}
/*
----------------------------------------------------------------------------------

package a_p;

public class a_c{
	public int a = 10;
}
----------------------------------------------------------------------------------
package a_p;
public class b_c{
	public int b = 20;
}

----------------------------------------------------------------------------------
package b_p;
public class a_c{
	public int a=100;
}
----------------------------------------------------------------------------------
package b_p;
public class b_c{
	public int b=200;
}
*/