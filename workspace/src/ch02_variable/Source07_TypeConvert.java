class Source07_TypeConvert {
	public static void main(String[] args) {
		/*
			�����͸� casting �� �غ��Ҵµ�, �� �Ǵ°� �ƴϴ�.
			��ġ, ���� �����ʹ� �ٸ� ��ġ,���ڵ����ͷ� casting ����, �� �ܴ� �ȵ�
			�������ʹ� �ٸ������ͷ� casting�� �Ұ�
			���ڿ������͵� �ٸ������ͷ� casting�� �Ұ�
		*/

		System.out.println( (int)'��');
		System.out.println( (char)45207);
		// # ������� #
		// System.out.println( (boolean)1);
		// System.out.println( (String)345);
		// System.out.println( (int)true);
		// System.out.println( (String)ture);
		// System.out.println( (int)"������");
		/*
			casting�� �ȵǴ°��� ��� ������ -> String���� �ٲܼ��� �ִ�.
			���ڿ��� �ٸ������Ϳ� ���ϸ� �� �����͸� ���ڿ�ȭ�ؼ� ���������� ����.

			��� �����ʹ� String.valueof(data) �ϸ� ���� Stringȭ �ȴ�.
		*/
		System.out.println("�����ġ�� "+ 5031 + " �Դϴ�.");
		System.out.println("�����߱�� "+ String.valueOf(5031) + " �Դϴ�.");

		//	String S = String.valueOf(3.14*3*3);
		//	System.console().readLine(String.valueOf(12)); //��¹���ó��(������String������) + �Է¹ޱ�
		/*
			String �� ������ȭ ��Ű����
				Integer.valueOf();
				Long.valueOf();
				Doutble.valueOf();
				Boolean.valueOf();

			String ���� ��ȯ
				
				String.valueOf();
		*/
		int v1 = Integer.valueOf("345"); //����, ��ġ, ������ �¾ƾ߸� ����
		System.out.println(v1+ " / " + v1*v1);

		// Double v2 = Double.valueOf("312.4124.2323");  // ����

	}
}
