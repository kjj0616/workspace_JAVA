package java_plus;
/*
	2. String / StringBuffer
		-���ڿ��� �ٷ�� ���� �����Ǵ� Ŭ����
		
	   #�Һ���
		-String class : �Һ����� ������ ������ ���ڿ��� �����Ǿ� �ʱ�ȭ�� ���Ŀ��� �׻� �б� ������¸� �����Ѵ�.
						�޼ҵ带 �̿��Ͽ� ���ڿ� ����� ������ �״�� �ְ� ���ο� ��ü�� �����ȴ�.
		-StringBuffer class : �Һ����� ���� ������ ���� �����ϴ�.
		
	  * ��ü�� ���� �� ����
	    -String class : 2���� ���
	     -1-�⺻��������ó�� �����ϰ� �����ϴ� ���ڿ� ��� ��� : s1�� s2�� ���� �ּҸ� ������.
	    	String s1 = "java"; String s2 = "java";
	   	 -2-new �����ڸ� ����ϴ� �Ϲ����� ��ü ���� ��� : s3�� s4�� �ٸ� �ּҸ� ������.
	   		String s3 = new String("java"); String s4 = new String("java");
	  
	  * �޼ҵ�
	  	 toString() : value�� ����
	  	 ����		: value�� ����
	  	 equals(value): value�� ��
	  	 length()	: ���� ����
	  	 charAt(22); 	//���ڹ�ȣ char ����
	  	 subString(22); //�Ϻ� ���ڿ� ���� ���ڹ�ȣ->��
	  	 SubString(4,10); //�Ϻ� ���ڿ� ���۹�ȣ->������ ������ȣ 4->8
	  	 split("@");  	//���ڿ��� ���б�ȣ�� ������ ���ڿ��迭
	  	 split("[.]"); 	//���� [] ���
	  	 indexOf("a"); 	//ã�� ���ڿ��� ó�� �����ȣ
	  	 indexOf("avz",7); //ã�� ���ڿ��� ���۹�ȣ�������� ó�� �����ϴ� ��ȣ
	  	 lastindexOf("a"); //ã�� ���ڿ��� ������ �����ȣ
	  	 toUpperCase();	//�빮��
	  	 toLowerCase(); //�ҹ���
	  	 replaceAll("�������ڿ�","�ٲ��ڿ�"); //���ڿ� ġȯ
	  	 toCharArray();	//���ڿ��� ���ڹ迭
	  	 trim();		//���ڿ��� �յ� ��������
	  	 concat("Java");//���ڿ� �ڿ� ���̱�
	  	  
*/
public class Chap11_2_String_StringBuffer {
	public static void main(String[] args) {
		String a = "������ �Ϳ����� AbcD ef Java ���� 1234";
		//			0 1 2 34---------------------------->28
		String email = "aaa_bbb@abc.co.kr";
		String b = a; //������ ���� ����
		b = "������ ����ؿ�";
		String c = "������ ����ؿ�";
		System.out.println(a.toString());
		System.out.println(b);
		if(b.equals(c)) //���� ��
			System.out.println("���ƿ�");
		else
			System.out.println("�޶��");
		
		System.out.println(a.length()); // 0,28 => 29 ���ڱ���
		char ch = a.charAt(2);	//���ڿ��� ��ȣ���� -> �ѱ���
		System.out.println(ch); //���ڱ���
		System.out.println(a.substring(22)); //�Ϻ� ���ڿ� ����, {���ڹ�ȣ,}
		System.out.println(a.substring(4, 10));
		//�Ϻ� ���ڿ� ���۹�ȣ -> ������ ������ȣ 4->8
		String arr[] = email.split("@"); //���ڿ��� ���б�ȣ�� ������ ���ڿ� �迭
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		String arr2[] = email.split("[.]");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		String d = "abcd avze avz akj";
		System.out.println(d.indexOf("a")); //ã�� ���ڿ��� ó�� �����ȣ
		System.out.println(d.indexOf("avz" ,7));
		System.out.println(d.lastIndexOf("a"));
		String filename = "abc.234.567.tyu.jpg";
		String file_arr[] = filename.split("[.]");
		System.out.println(file_arr[file_arr.length-1]);
		System.out.println(filename.substring(filename.lastIndexOf(".")+1));
		
		System.out.println(a.toUpperCase()); //�빮��
		System.out.println(a.toLowerCase()); //�ҹ���
		char[] ch_arr = d.toCharArray(); // ���ڿ��� ���ڹ迭
		for (int i = 0; i < ch_arr.length; i++) {
			System.out.print(ch_arr[i]+", ");			
		}
		System.out.println();
		String tr = "   ������ �Ϳ�����    ";
		System.out.println(tr.length());
		System.out.println(tr.trim().length()); //���ڿ� �յ� ��������
		
		
				
		
		
	}
}
