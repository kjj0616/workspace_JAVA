package ch07_ObjectDesign;
class Source07_UseMarket {
	public static void main(String[] args)	{
		Market m = new Market();

		System.out.println(m.s1.current());
		System.out.println(m.s2.current());
		System.out.println(m.s3.current());

		String rst = m.dayOff();
		System.out.println(rst);

		System.out.println(m.s1.current());
		System.out.println(m.s2.current());
		System.out.println(m.s3.current());

		m.buyStock(1, 30);	// ù��° ���ڰ� 1�̸� s1 , amount�� ����
		m.buyStock(2, 10);
		m.buyStock(3, 2);

		System.out.println();
		System.out.println(m.s1.current());
		System.out.println(m.s2.current());
		System.out.println(m.s3.current());

		m.sellStock(1, 10);
		m.sellStock(2, 10);
		m.sellStock(3, 10);

		System.out.println();
		System.out.println(m.s1.current());
		System.out.println(m.s2.current());
		System.out.println(m.s3.current());

		int v = m.totalValue();	//�������� �ֽ��� ����ġ�� ���
		System.out.println();
		System.out.println("totlaValue = "+ v);
	}
}
