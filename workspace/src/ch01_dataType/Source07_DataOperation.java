class Source07_DataOperation {
	public static void main(String[] args) {
		/*
			��ġ �����͸� ������ �Ҽ� �ִ� ���۾��鵵 �̾ ���캸��

			ũ��� ( >, >=, < , <=), ����� ( ==, != )�� �����Ѵ�.
			����� true, false �� �߻��ϰ�, �� �۾��� �Ǽ��� �����ϴ�.
		*/
		System.out.println(32 > 10);  //T
		System.out.println(34<<1 > 100);  //F
		System.out.println(34>>1 == 17);  //T
		System.out.println(64>>1 != 16<<1); //F
		System.out.println(100.0 > 99.9);

		/*
			���� ������(Ȧ����ǥ�� ǥ����) ���� ��ݱ��� ���캻 �۾��� �����ѵ�
			���������δ� ����ó�� ó���� �Ǳ� ������ �׷���.
		*/
		System.out.println('��'+0); // ��=44032
		System.out.println('��'+'��'); // 89240
		System.out.println('��'*'��'); 
		System.out.println('��'/'��'); 
		System.out.println('��'<'��'); 
		System.out.println('��'>>1);
		
		// �ϼ������ڵ���� ������ '��' ���� '�R' ���� ���ʴ�� ��ȣ�� �����Ǿ��ִ�.
		// �� � ����� ���ִ°ɱ�?
		// system.out.println(10-1+1); //10��
		System.out.println('�R'-'��'+1); //11172��
		System.out.println('z'-'a'+1); // 26
		System.out.println('Z'-'A'+1); // 26
		System.out.println('a'*1);	// 97
		System.out.println('A'+0);	// 56
	}
}
