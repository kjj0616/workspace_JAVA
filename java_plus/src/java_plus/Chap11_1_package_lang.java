package java_plus;
/*
1. Object
  -�ڹ��� ��� Ŭ������ ����Ŭ������ ������,
   ���ο� Ŭ���� ���� �� Ư�� ����Ŭ������ ��ӹ޵��� ������� ������ object class�� ��ӹ޴´�.
  -java.lang��Ű���� import���� �ʾƵ� Object class�� complier�� ���� �ڵ� �ε�ȴ�.
  -java.lang�� �� class�鵵 object class�� ��ӹ޴´�.
  
 * method
 
  - equals() : ���� ��ü�� ������ ��ü �������� �޸𸮿��� ���� ��ü�� �����ϴ��� �˻��Ѵ�.
      --> �ּҰ��� �˻����� ���� �˻簡 �ƴϴ�.
      : public boolean equals(Object obj)
      
  - hashCode() : heap�� �ִ� ��ü�� �޸��� �ּҰ��� ���´�.
      : public int hashCode()
      
  - clone() : ��ü �ڽ��� �����Ͽ� �Ȱ��� ��ü�� ���Ӱ� �ϳ� �� �����Ѵ�.
	  : protected Object clone() throws CloneNotSupportedException
	  
  @@@@@@@@@@@@@@@@@@@@@@@@ equals() �� hashCode()�� ���� @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
  
    - Heap�� ��ü�� �� �� ����ְ�, �� reference�� �� ��ü�� �����ϰ� ������,
     hashCode()�� equals() method�� ��� �������̵� �ϸ� �� ��ü�� ��ġ�ΰ����� ���� �� �� �ִ�.
     
    - hashCode()�� �������̵� ���� ������ �⺻������ ��ü���� ���δٸ� ������ hashCode���� ��ȯ�Ѵ�.
    
    - equals()�� �޼ҵ� ���ο��� == �����ڸ� �Ἥ �� reference�� �� ��ü�� �����ϴ��� Ȯ���Ѵ�.
    
    - �� ��ü�� hashCode ���� ���ٰ� �ؼ� �ݵ�� ���� ���� �ƴϴ�.
      --> a.hashCode() == b.hashCode() �� �����ص� a.equals(b)�� �ݵ�� true�� �ƴϴ�.
      
    - �� ��ü�� ������ �ݵ�� ���� hashCode�� �������Ѵ�.
      --> a.equals(b)�� true ��� a.hashCode() == b.hashCode()�� �����Ѵ�.
      
    - �� ��ü�� ������ equals() �޼ҵ� ȣ�� �� true�� ��ȯ�ؾ� �Ѵ�.
      --> a.equals(b)�� b.equals(a) ��� true
      
    - equals()�� �������̵� �ϸ� �ݵ�� hashCode()�� �������̵� �ؾ��Ѵ�.
    
    - equals() �� hashCode() �޼ҵ带 �������̵� ���� ������ ����� �� ��ü�� ���� ������ ���ֵ� �� ����.
    
  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 
*/
class O_c{
	int a = 10;
	
	@Override
	public String toString() {
		// �ּҸ� ȣ���ϴ� �⺻ �޼ҵ�
		return "�������� �Ϳ�����";
	}
}

public class Chap11_1_package_lang {
	public static void main(String[] args) {
		O_c oc = new O_c();
		
		O_c oc2 = oc; 				// �ּ� ���� ==> toString()�� ����
		oc2.a = 100;
		System.out.println(oc.a);	//100
		System.out.println(oc2.a);	//100
		
		System.out.println(oc);		// �ּ� ��� --> toString()
		System.out.println(oc2);	// �������� �Ϳ�����;
									// �������� �Ϳ�����;
		
		System.out.println(oc.toString());	// �������� �Ϳ�����;
		// Object�� ������ �ִ� �⺻ �޼ҵ� ==> ��� Ŭ������ ����Ŭ���� : Object
		// --> ������� �ʾƵ� �ڵ� ���
		System.out.println(oc2.toString());	// �������� �Ϳ�����;
		
		System.out.println(oc.hashCode());	//1311053135
		System.out.println(oc2.hashCode()); //1311053135
		// hashCode() Ŭ������ �ּҰ��� �������·� ����
		
		if(oc==oc2)
			System.out.println("�ּҰ� ���ƿ�");
		else
			System.out.println("�ּҰ� �޶��");
		
		if(oc.equals(oc2))			// �ּҰ��� �� --> hashCode()�� ��
			System.out.println("�ּҰ� ���ƿ�");
		else
			System.out.println("�ּҰ� �޶��");
		
		O_c oc3 = new O_c();
		
		//oc3 = oc.clone() �Ϲ����� ��� �۵� ���� �ʴ´�.
		
		int [] arr_1 = {1,3,5};
		
		int [] arr_2 = arr_1.clone();
		// �Ҵ���� ���� ���� ������ ��� �ڵ����� �����Ҵ� ������ deep copy
		// deep copy ==> ��� Object�� �� �Ǵ� ���� �ƴ϶� ����Ʈ ���¿� ���� ��쿡�� ����
		
		arr_2[1]=4;
		System.out.println("arr_1[0]:"+arr_1[0]);
		System.out.println("arr_2[0]:"+arr_2[0]);
		System.out.println("arr_1[1]:"+arr_1[1]);
		System.out.println("arr_2[1]:"+arr_2[1]);
		//arr_1[0]:1
		//arr_2[0]:1
		//arr_1[1]:3
		//arr_2[1]:4

	}
}
