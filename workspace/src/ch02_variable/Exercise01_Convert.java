package ch02_variable;
class Exercise01_Convert {
	public static void main(String[] args) {
		/*
			�� ���α׷��� ������ �� ���� ������ �ʵ��л����� ���� ���α׷��̴�.
			���������� �ϳ� ������ְ� �Է��� �޾Ƽ� �������� ���������� �˷��ָ� �ȴ�.
		*/
		int n1 = 31; // ���ڴ� �ƹ����Գ� �Է��صΰ�
		int n2 = 33; // �� �������� ���� ������ �صνð�
		// n1�� n2�� ���� �ٲ���� ����
			n1 = 10+(int)(Math.random()*40);
			n2 = 10+(int)(Math.random()*40);

		System.out.println("��������ݢ�");
		System.out.println("    "+String.valueOf(n1));
		System.out.println("+   "+String.valueOf(n2));
		System.out.println("-------");
		String r = System.console().readLine( "    " + String.valueOf((n1+n2)/10) ); 
		//readLine()�� ��������� �޾ƾ��Ѵ�.
		//n1+n2�� 10���ڸ��� ���ؼ� �������.
		//�Է°��� �����̸� ����, Ʋ���� �������� ���
		//System.out.println(r);
		//System.out.println(((n1+n2)/10)*10 + Integer.valueOf(r));
		System.out.println( ( ((n1+n2)/10)*10 + Integer.valueOf(r) ) == (n1+n2) ? "����":"����");

		int ten = (n1+n2)/10;
		// ten * 10

		/*
			�����ΰ� Ȯ�� ���
			Ȯ���� �� ������ 10���ڸ� ����� ���
			����ڷκ��� �Է�
			-�Է¹��������͸� ����ȭ�ؼ� 10�� �ڸ�����ص��ſ� ����
			-�׸��� �� ��ġ�� ���� �ΰ��� �հ� ��ġ�ϴ��� Ȯ��
			-�Է¹��� �����͸� ����ȭ�ؼ�  �� ��ġ�� ������ �հ� ��
						
		*/
	}
}
