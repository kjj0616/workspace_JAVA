package java_plus;

public class Chap04_1 {
	/**
	 * @param args
	 * 
	 1. if��
	  1) ����
	   if : "���࿡ ~ ���". Ư�����ǿ� ���� "true��� ����" �̶�� �ǹ̸� ����
	   
	   if(���ǹ�) //���ǹ� boolean ������ return
	   { 
	   	   
	   //������ ���϶��� ���μ���
	   
	   }
	   else if(���ǹ�)
	   {
	   
	   //���� ����� ������ �� �߿��� ���϶� ���μ���
	    
	   }
	   else
	   {
	   
	   //������ �� ���μ���
	   
	   }
	  
	  
	  2) �������� �б⸦ �� ���
	  �� ������ ���� ���� �ͺ��� ���� ������ ���� ������ ���������� �۾�
	  
	  90>80>70>60>50 , 50<60<70<80<90 �� ����� �����ϳ�
	  
	  90>70>80>50>60 ===> �� ������ if���� ����� �� ����
	 
	  3) ��ø if ���� ��밡��
	 
	 */
	
	public static void main(String[] args) {
		int a= 70;
		
		if(a>=80){
			//if���� ������ ���̶��
			System.out.println("���");
		}else if(a>=70) {
			//���� �׺��� �����̰� ���� if���� ������ ���̶��
			//�ܰ躰 �бⰡ �����ϴ�
			System.out.println("����");
		
		//}else(a>50){ else �� ������ ���� �� ����
			
		}else {
			System.out.println("�ҷ�");
		}
		//------------------------------------------------------
		if(a<70) {
			//if���� ������ ���̶��
			System.out.println("�ҷ�");
		}else if(a<80) {
			//���� �׸��� �����̰�, ���� if���� ������ ���̶��
			//�ܰ躰 �бⰡ �����ϴ�
			System.out.println("����");
			
		//}else(a>=50){ else �� ������ ���� �� ����
			
		}else {
			System.out.println("���");
		}
		//------------------------------------------------------
		int kor=99, eng=97, mat=99;
		double avg=(double)(kor+eng+mat)/3;
		
		if(avg>90) {
			System.out.println("�� : ��");
			
			if(kor>=90 && eng>=90 && mat>=90)
				System.out.println("����");
		}else if(avg>=80) {
			System.out.println("�� : ��");
		}else if(avg>=70) {
			System.out.println("�� : ��");
		}else if(avg>=60) {
			System.out.println("�� : ��");
		}else {
			System.out.println("�� : ��");
		}
		//------------------------------------------------------
		
		// �ڵ��� ���� �׽�Ʈ�� �غ�����
		
		// �� ������ ���� : 100��
		
		// ���� : �ӵ� 50%, ������ : 30%, ���� : 20%
		
		// ���� 80 �̻� - ���, 70�̻� - ����, ������ - �ҷ�
		
		// ��� ������ 80���̻��� ��� ����Ʈ
		
		int speed = 80, safe = 80, eco = 80;
		double av = (double)(speed*0.5+safe*0.3+eco*0.2);
		a:
		if(av>=80) {
			if(speed>=80 && safe>=80 && eco>=80) {
				System.out.println("����Ʈ");
				break a;
			}
			System.out.println("���");
		}else if(av>=70) {
			System.out.println("����");
		}else {
			System.out.println("�ҷ�");
		}
	}
	
}
