class Source09_DataOpertaion {
	public static void main(String[] args) {
		/*
			�������Ϳ� �����ϴ� ���(����)
				true, false
		*/

		// ������
		System.out.println(!true);
		System.out.println(!!true);
		System.out.println(!false);
		System.out.println("");

		// �� ���, &&, ||
		System.out.println(true && true); //���� true ��� true, �װ� �ƴϸ� false
		System.out.println(false && true); //���� true ��� true, �װ� �ƴϸ� false
		System.out.println(false || true); //�ϳ��� true ��� true, �װ� �ƴϸ� false
		System.out.println("");

		System.out.println(false || false || true); //�ϳ��� true��� true, �װ� �ƴϸ� false
		System.out.println("");

		// true, false ��� �ڸ��� true, false �� ������ ����� ��� �ȴ�.
		System.out.println( (32<<1==64) && (32>>1==16) );
		System.out.println("");

		// ���ǿ���(3�׿���) (true/false) ? true�϶� �� �� : false�϶� ����
		System.out.println( true ? 1: -1);
		// 80825 % (60*60)
		System.out.println( 80825 + "�ʴ� " + ( 80825 / (60*60) <12 ? "����":"����" ) +"�̴�");

		// true,false �� ���߿� branch ���̳�, loop ���� ���鶧�� ���̰� �ȴ�.

	}
}
