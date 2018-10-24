package java_plus;
/*
	2.Random
	-��ǻ�Ͱ� ������ �߻��ϴ� ���� �ǻ� ����(pseudo random number).
	-�� ������ �� ���� ������ �߻���Ű�� ���� ��� ������ ������ �������� ������ �߻��Ǳ� ����
	-Java ���� ������ �߻���Ű�� ���� java.lang ��Ű���� �ִ� 
	 Math Ŭ������ random() �޼ҵ带 ȣ���Ͽ� �����ϰ� 0�� 1������ ������ ����
	-�̺��� ���� �����ϰ� ���۵� Ŭ������ java.util �� Random Ŭ����
*/
import java.util.*;
public class Chap12_2_Util_Random {
	public static void main(String[] args) {
		Random r1= new Random();
		Random r2= new Random(10); //seed(����)���� ��Ģ�� ���� �߻�
		Random r3= new Random(10);
		System.out.println(r1);
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt(10));
		System.out.println(r1.nextLong());
		System.out.println(r1.nextFloat());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextBoolean());
		
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println(r1.nextInt());
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println(r2.nextInt());
		}
		System.out.println();
		for (int q = 0; q < 5; q++) {
			System.out.println(r3.nextInt());			
		}
	}
}
