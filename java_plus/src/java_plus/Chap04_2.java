package java_plus;

public class Chap04_2 {
	/*
	 2. switch
	  1) if���� �޸� �������� ���� ���� �б� ����
	  2) ���ǰ� : ������ - byte, short, int�� ������ char ���
	  			  (boolean, float, double ���Ұ�)
	  3) break : ���ǹ��� �ش��ϴ� ���๮�� ����� ���
	  4) default: ���ǿ� �ش��ϴ� ���� ���� ���� ��� ���
	  6) ���ǰ��� �ߺ� �Ұ�
	  
	  // if -> ������ ���� �б�
	    	avg>= 90 : ��
	    	
	  // switch -> ���� ���� �б�
	    	gra -> ���� : ���ʽ�=200%
	    	// case�� ���� ���� ���� �� ����
	 
	 switch(��) // �б⹮
	 {
	 	case �ش簪:
	 		���� ���μ���
	 		break; //�ش� ���븸 �����ϰ� switch�� �������´�
	 		//break; ���������� ����
	 	
	 	case �ش簪:
	 		���� ���μ���
	 		break;
	 		
	 	case �ش簪:
	 		���� ���μ���
	 		break;
	 		
	 	default : 	//�⺻��-> if���� elseó�� ���
	 				//�� �������� �ۼ��Ѵ�
	 		���� ���μ���
	 		break;
	 		// default������ �����ص� ��
	 }	 
	 */
	public static void main(String[] args) {
		int a=3;
		
		switch(a) // �б�� ���� �ִ´�
		{
		case 1: // �бⰪ�� �ش��ϴ� ��츦 ����
			System.out.println("�� 1�̴�");
			break; // �ش� ������ �����ϰ� switch���� ���������� ���� ����
		case 7:
			System.out.println("�� 7�̴�");
			break;
		case 3:
			System.out.println("�� 3�̴�");
			break;
		case 8:
			System.out.println("�� 8�̴�");
			break;
		default:
			System.out.println("�� �⺻�̴�");
		}		
	
	
	//���޺� ������ ����ϼ���
		//���� : 50%, ���� : 30%, �븮 : 20%, ���: 10%
		//���� : �⺻�� + �⺻��*���ʽ�
		//���ް� �⺻���� �Է¹޾� ó��
	
		int wag = 100_0000;
		String level = "����";
		double result = 0.0;
	
		switch(level) {
		case "����":
			result = wag + (wag*0.5);
			break;
		case "����":
			result = wag + (wag*0.3);
			break;
		case "�븮":
			result = wag + (wag*0.2);
			break;
		default:
			result = wag + (wag*0.1);				
		}
		System.out.println(result);
	}
}