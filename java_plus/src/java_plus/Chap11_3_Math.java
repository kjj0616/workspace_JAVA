package java_plus;

import java.util.Scanner;

/*
	3.Math
	 ���п��� Ŭ����
	 - �����ڰ� private�̹Ƿ� new�� ���� ��ü ������ �Ұ����ϴ�
	 - method�� static�̹Ƿ� : ������ ��ü �ν��Ͻ��� �ʿ����.
	
	#���
	 - Math.PI(������)
	 - Math.E(�ڿ��α� ��)
	
	#�޼ҵ�
	 -cell() : �ø�
	 -floor() : ����
	 -round() : �ݿø�
	 -abs() : ���밪
	 -rounds : �ݿø�
	 -max() : �ִ밪
	 -min() : �ּҰ�
	 
	 -�ﰢ�Լ�
	 . toRadias() : ������ �������� ��ȯ�Ѵ�.
	 . toDegrees() :  ������ ������ ��ȯ�Ѵ�.
	 . sin() : sin�Լ�
	 . cos() : cos�Լ�
	 . tan() : tan�Լ�
	 
	 -���� ���� ���α׷��ֽ� ���� �ʿ�� �ϴ� �Լ�
	 . exp() : �Է¹��� �μ��� ���� ���e�� �������� ���
	 . log() : �Է¹��� �μ��� �ڿ� �α� ���� ���
	 . pow() : ù��° �μ��� �ι�° �μ� �� �Ͽ� ��ȯ
	 .sqrt() : �������� ���Ѵ�.
	 -random() : 0.0~1.0 ������ ���� �� �Ǽ��� �����Ѵ�. (0.0000000.... ~ 0.99999999)
	 
*/
public class Chap11_3_Math {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.ceil(34.46)); //�ø�
		System.out.println(Math.floor(34.76)); //����
		System.out.println(Math.round(34.46)); //�ݿø�
		System.out.println(Math.abs(34.46)); //���밪
		System.out.println(Math.max(20, 30));//ū��
		System.out.println(Math.min(20, 30));//������
		System.out.println(Math.pow(2,3));	 //����
		System.out.println(Math.sqrt(2));	 //������
		System.out.println(Math.random()); 	 //���� 0< ���� <1
		
		System.out.println((int)(Math.random()*46)+5); //����
		
		System.out.println("������ ����");
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while(input!=3) {
			System.out.println("1:����, 2:������, 3:����");
			System.out.println("�Է�: ");
			input = sc.nextInt();
			int com = (int)(Math.random()*2)+1;
			if(com==input)
				System.out.println("��");
			else
				System.out.println("��");
			
		}
		System.out.println("��������");
	}

}
