/*
	branch �� ���Ҿ� ������ ó���������� loop��°� �����ϴ¹��� �˾Ƶξ�� �Ѵ�.

	loop : ȸ��(��/�ݺ�)

	�����͸� ó���ϴٺ��� �ѹ��� �۾����� �����°� �ƴ϶�
	���� ó���� ������ �ؾ߸� ���� �ִ� ������� �����Ѵ�.
	
	��ġ�����͸� ���� 3�ڸ����� �޸��� �� ǥ���� ���ڿ� ������ ���
*/

class Source01_Loop {
	public static void main(String[] args) 	{
		int r = 1000+(int)(Math.random()*9000);
		System.out.println(r);
		/*
			������ ���ؼ� � ������ ��ó�� �ϳ�?
			1�� �ڸ��� ��� �̾ƴٰ� �տ��ٰ� �ٿ������� ��.
			�� �۾��� 3�� ������ ,�� ���
			r�� 0�� �ɶ����� �ݺ�, or (�ڸ����� ���� ȸ���� ���س��� �ϴ���)
		*/
		String str = "";
		str = r%10 +str; 
		r /= 10;
		System.out.println(r); 
		System.out.println(str);
		System.out.println();

		str = r%10 +str;
		r /= 10;
		System.out.println(r);
		System.out.println(str);
		System.out.println();

		str = r%10 +str;
		r /= 10;
		System.out.println(r);
		System.out.println(str);
		System.out.println();

		str = ","+str;

		str = r%10 +str;
		r /= 10;
		System.out.println(r);
		System.out.println(str);
		System.out.println();

		/*
			loop ������ while Ȥ�� for�� �̿��ؼ� ���������ϴ�.

			while loop ���� �������� ���캸��.
		*/
	}
}
