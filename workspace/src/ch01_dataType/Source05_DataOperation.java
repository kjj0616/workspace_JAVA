/*
	�⺻������ �ٷ�ߵǴ� �����͵��� ������ �ռ� ���Ͱ���
	��ġ, ����, ���ڿ�, ���� type �����͵��̴�.

	�� �����͸� ���� ������ �Ҽ� �ֳ�?
	������ �������� �Ҽ� �ִ� �۾����� �ٸ���.
*/


class Source05_DataOperation {
	public static void main(String[] args) 	{
		System.out.println("Hello World!");
		/*
			��ġ�� �����ʹ�, �������, �񱳿��� �� �Ҽ� �ִ�.
			# ������� #
			!. ��ġ�� ������ �Ǽ��� �ٸ��� �ν��ϰ� ó���� �ȴ�.
			!. ������ġ������ ������ ����, �Ǽ���ġ������ ������ �����ϴ�.
			!. ������ġ�� ������� ����� ������ ������ġ, �Ǽ���ġ �������� ������ �Ǽ�
			!. �������̸� ���ؼ�, ����+�Ǽ����� ������ �Ǽ��������� ó���� �ȴ�.
			
		*/
		System.out.println(456+175);
		System.out.println(0b100 * 3);
		System.out.println(94.321 - 3.3);
		System.out.println(41/10);		//������������ ����� ���� �ǹ��ϰ� ��
		System.out.println(41.0/10.0);
		System.out.println(47 % 10);	//mod ������ �����ϴµ� �̰� ������
		System.out.println(47.5 % 10.0);	//�Ǽ��� mod ������ ����
		System.out.println(41 / 10.0);	// �Ǽ�ó������

		//----------------------------------------------------------------------
		// ������ 5¥�� ���� ���Ǹ� ���	4/3 * ���� * * ������ 3����
		// ���Ǻ��� 4/3pr^3
		System.out.println(4/3 * 3.14 * 5 * 5 * 5); // (4/3 => 1)   392.5
		System.out.println(4.0/3 * 3.14 *5 *5 *5);  // (4.0/3 =>1.333) 523.3
	}
}