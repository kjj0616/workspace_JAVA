package ch02_variable;
class Exercise02_Convert {
	public static void main(String[] args) {
		/*
			����ڷκ��� ��� ������� �Է��� �޾Ƽ�,
			�� �ð��� �Ϸ���� ���ʳ� �귶�� ����ؼ�
			0.xxxxxx �� �����̴�.
			�Ҽ����� 3�ڸ������� ��µǰ� �غ���.
			�� 4°�ڸ� ���ĸ� 0���� �� �ٲٸ� ����� ����.

			�� �Է�
			�Է�ó�� ŵ
			�� �Է�
			�Է�ó�� ŵ

			���Է°��� intȭ�ؼ� ����°���� ����� ����
			�� ���� �Ϸ���� �󸶳� ������ ����� ����
			�� ���� �Ҽ��� 3°�ڸ������� ������ �۾��� ����

			�׸��� ����ڰ� �Է��ߴ� �� �а� �Բ� ������� ���
		*/
		


		String hour = System.console().readLine("�� �Է�: ");
		String min = System.console().readLine("�� �Է�: ");

		int totalTime = Integer.valueOf(hour)*60*60 + Integer.valueOf(min)*60;
		double result = totalTime/(24*60*60.0);
		//System.out.println(result);
		//System.out.println( ((int)(result*1000))/1000.0 );
		double perTime = ((int)(result*1000)) / 1000.0;
		System.out.println(hour+"�� "+min+"�� : "+ perTime+"��");
		
		System.out.println(hour+":" +(Integer.valueOf(min)<10 ? "0":"")+min+ " = " + perTime+"��");
		//���� 00���� ó���Ҷ� ���ڸ������� �տ� 0�� �ٿ��ִ� �۾� �߰�
	}
}
