package ch07_ObjectDesign;
class Source06_UseStock {
	public static void main(String[] args)	{
		Stock s = new Stock("�����ػ�");
		// ���ڿ��� �����ؼ� �����, product �����ǰ�,
		// ���� 500 �� �����Ǹ鼭 ��������� ������ ����
		// amount�� 100���� �����ǰ�

		/*
		Stock(String,int) ���� ����� ����
		Stock(String)	���� �������� ������
		*/	
		System.out.println(s.current());
		
		Stock s1 = new Stock("��������", 4500);
		System.out.println(s1.current());
		// product�� value�� �����ǰ�, amount 100���� �����ǰ�

		s.change(); // ��ġ�� ���� ���� �ִ� 30�ۼ�Ʈ �̳��� ������ �����ǰ�
					// �������� 100���� ����
		System.out.println(s.current());
	}
}
