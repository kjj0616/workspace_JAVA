package java_plus;
	/*
	3. ������
	  1) Ŭ������ ������
	   -�� Ÿ���� ���������� ���� Ÿ���� ��ü�� ���� ����
	   -�θ�Ŭ���� Ÿ���� ���������� �ڽ� Ŭ������ �ν��Ͻ��� ����
	   
	  2) ����ȯ
	   -������ instanceof Ŭ���� �̸� ---> ����ȯ�� �������� üũ
	   -��Ӱ��迡 �ִ� Ŭ������ üũ����
	 	 
	 */

class dy_per{
	int a=30;
}
class dy_child extends dy_per{
	int b=20;	
}
class dy_a{
	int a=10;	
}

public class Chap08_4_������ {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		dy_per p1 = new dy_per();
		dy_per p2 = new dy_child(); // �ڽ�Ŭ������ �θ�Ŭ������ ���𰡴�
		
		dy_child c1 = new dy_child();
		//dy_child c2 = new dy_per(); // �θ�Ŭ������ �ڽ�Ŭ������ ����Ұ�
			//�޸��� �Ҵ�ũ�Ⱑ �ڽ��� �� ũ�⶧���� ���� �θ�� �Ҵ�Ұ�
		
		System.out.println("p1.a="+p1.a);
		System.out.println("p2.a="+p2.a);
		//System.out.println(p2.b); //�ڽ����� �޸��Ҵ��� �޾Ҿ �ڽ����� ������ �Ұ�
		
		if(p1 instanceof dy_per) {
			System.out.println("p1->dy_per ��ȯ����");
		}else{
			System.out.println("p1->dy_per ��ȯ�Ұ�");			
		}
		/*	��Ӱ�������� ������ �� �ִ� �����̾�߸� Ŭ������ ����ȯ�� �����ϴ�
		 *  ����� ���°� �����ϴٰ� �ؼ� Ŭ������ ���ٰ� �� ����� ����
		 *  �ٽ� ���� Ŭ������ �������´� ��Ӱ�������� �����Ѵ�
		 *  
		 *  if(p1 instanceof by_a){
		 *  	System.out.println("��ȯ����");
		 *	}else{
		 *		System.out.println("��ȯ�Ұ�");			
		 *	}
		 */
		if(p1 instanceof dy_child) { 		// ��Ӱ����̾ ��ȯ���� ������ Ȯ���� �� �ִ�.
			System.out.println("p1->dy_child ��ȯ����"); // �ڱ��ڽ����� �Ҵ���� Ŭ������ �ڽ����� ��ȯ �Ұ�			
		}else {
			System.out.println("p1->dy_child ��ȯ�Ұ�");			
		}
		
		//dy_child c3 = (dy_child)p1;
		//�θ�� �Ҵ���� ������ �ڽ�Ŭ������ ��ȯ�Ұ� --> �ڽ��� ����� �Ҵ�������� ����
		
		if(p2 instanceof dy_child) { //��Ӱ����̾ ��ȯ���� ������ Ȯ���� �� �ִ�.
			System.out.println("p2->dy_child ��ȯ����");
		}else {
			System.out.println("p2->dy_child ��ȯ�Ұ�");
		}
		
		dy_child c3 = (dy_child)p2;
		//�θ������� �ڽ����� �Ҵ���� ������ �ڽ�Ŭ������ ��ȯ����
		//---> �ڽ��� ����� ���ü� �ִ� �޸𸮰����� �ִ�.
		
		System.out.println("c3.b="+c3.b);
		
		p2=c3;
		
		//System.out.println(p2.b);
		
		if(c1 instanceof dy_child) { //�ڽ�Ŭ������ �θ� �ڽ� �� ��ȯ����
			System.out.println("c1->dy_child ��ȯ����");
		}else {
			System.out.println("c1->dy_child ��ȯ�Ұ�");
		}
		
		if(c1 instanceof dy_per) { //�ڽ�Ŭ������ �θ��ڽ� �� ��ȯ����
			System.out.println("c1->dy_per ��ȯ����");
		}else {
			System.out.println("c1->dy_per ��ȯ�Ұ�");
		}
		
		dy_per p3 = c1;
		//System.out.println(p3.b);
		c1 = (dy_child)p3;
		System.out.println("c1.b="+c1.b);
		
		//������ Ŭ������ �ڷḦ ����� �ּ���
		//������ Ŭ���� : �̸�, �б�, �հݿ���, ����
		
		//��ӹ��� �б� Ŭ����A : ���� 30%, ����30%, ���� 40%, �հ����� 70
					//  Ŭ����B : ���� 50%, ����20%, ���� 30%, �հ����� 80
		
		//�л����� �� 5�� ���� �Է��Ͽ� ������Ŭ�����θ� ����� �˰� ���ּ���
		//����, ����, ���������� �հ� ��Ʈ������ �������� �Ұ����ϰ� ���ּ��� 
	}
}
