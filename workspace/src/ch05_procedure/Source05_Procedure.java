package ch05_procedure;
//2018-09-20
/*
	���ν���(=�Լ�) ����� ������ �͵�
*/

class Source05_Procedure {
	/*
		1. �����ε��� �����ϴ�. (���ν������� ���Ƶ�, �Ű��������°� �ٸ��� �߰����谡 �����ϴ�.)
		  - �������̳� ����Ÿ���� ������ ���� �ʴ´�. <->javascript�� �Ұ��� 1����=1��
		  - �̹� �� ������ ���� �־���. ����Ҷ�, Ÿ���� �޶� System.out.println()���� ����
	*/
	static double range(int x1, int y1, int x2, int y2){
		return Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
	}
	static double range(int x1, int y1){
		return Math.sqrt( (x1*x1)+(y1*y1) );
	}
/*	static boolean range(int x1, int y1){
		
	static double range(int a, int b, int c, int d){
*/		
	// �� ������ ������ �����ϱ⶧���� �߰� ����� �ȵ� (�Ű����� ������ �߿�)

	/*
		2. ���ν����� ������� �����ߵȴٰų�, �����͸� ���޹޴� ���·� ������ �ʿ�� ����.
		����� ������ ���� 1-1, 1-0, 0-1, 0-0 ������ �����ϴ�. (return��-�Ű�����)

		1-1 : ������ ���ݱ��� ������� �Լ����� ���� 1-1(�Ű�����, return���� �����ϴ� �Լ�)�̾���.

		1-0 : Math.random(); // �ܺε����� �Է¾��� return ����	
	*/
	static String create(){
		int r = (int)(Math.random()*3);
		if (r==0)
			return  "��Ŀ";
		else if (r==1)
			return  "����";
		else
			return  "����";
	}
	/*
		0-1 : ������, ���޹��� �����ʹ� ������, �߻���ų �����ʹ� ���� ������ ���ν���
		---( ��ü���¿��� void�� �ַ� ���, �۾��� ��ų �뵵�μ� ���Ǵ°� �Ϲ�����)
	*/
	static void output(int lv){
		// void -> return �� ���� ������ ���
		int need=0;
		int vip=0;
		while(vip<lv){
			need += (vip++ +1)*1000;
		}
		System.out.println(lv+"����� �ʿ� ����ġ : "+need);

	}
	/*
		0-0 : ������ ���޹��� �����͵� ����, �߻���ų �����͵� ���� ���ν���
	*/
	static void empty(){

	}
	/*
		��밪�� ���� ������ 0-1 / 0-0 ������ ���ν����� ��ü�� �ٷ�� �Ǹ� ���� �����ϰ� �ȴ�.
	*/

	public static void main(String[] args)	{
		String s =create();
		System.out.println(s);
		output(3);

	}
}
