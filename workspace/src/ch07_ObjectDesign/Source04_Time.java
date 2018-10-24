package ch07_ObjectDesign;
/*
	Stage ��ü�� �̿��ؼ�,
	������ �¸������� �����ϸ� ����Ǵ� ���α׷�
	�������� ���α׷��� ������� �Ѵ�.
	��ǻ�Ͱ� ������ Ʋ���ִ°� ������������ �ʿ��ѵ�,
	Ʋ���� �ϴ� �����߿� �ϳ��� 
	����ڰ� ������ Ǯ���µ� �ɸ��� �ð��� ������ �ް� �Ϸ��� �Ѵ�.

	�� �۾��� �Ϸ��� System.currentTimeMillis()��� ����� ����� �˾Ƶξ�� �Ѵ�.
*/
class Source04_Time {
	public static void main(String[] args)	{
		long t1 = System.currentTimeMillis();	// long�� ��ġ�� �ϳ� ������ �ȴ�.
		System.out.println(t1);		// ���� �ð���
		// 1970.01.01 00:00:00 �ʺ��� ���� �� ms�� �귯�������� ���� �����Ͱ��̴�.

		long y = t1/(1000L*60*60*24*365); //1�� ms ��ġ , 48��
		System.out.println(y);
		long d = t1%(1000L*60*60*24*365)/(1000L*60*60*24); // ���� ���� ��������
		System.out.println(d);

		long h = t1%(1000L*60*60*24*365)%(1000L*60*60*24)/(1000L*60*60);  //? ���������� ���� ���� �ð�
		System.out.println(h);

		System.console().readLine();
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);

	}
}
