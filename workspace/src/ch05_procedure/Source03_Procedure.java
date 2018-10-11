/*
	���α׷� ������ �ʿ��� ���ν����� ��� �����Ҳ����� �����̴�.
	�ش� main�� ������ �ִ� ���� �ȿ� ���� �ǰ�, �ٸ� ���Ͽ� ���� �ȴ�.
	���� �����߳Ŀ� ���� ȣ��(���) �ϴ� ����� �޶�����.

	������ ȣ���� �����ϰ� �ϱ� ���� ���α׷��� ����� ���Ͽ� ���� �����غ���.
*/
class Source03_Procedure {

	// ���ν�������� ȣ��� ���� �̸�(ȣ���Ҷ� ���޹��� ����������)
	// 1. ������������ 2���� ���޹޾Ƽ�, �� ������ ���� ������� ������ gap�̶�� ���ν����� ������� ��
	static int gap(int n1, int n2){
		System.out.println("gap procedure called.."+n1+" / "+n2);
		int d = n1 - n2;
		if (d<0)
			d *= -1;
		System.out.println("procedure done.."+d);
		// ���ν����۾��� ������� ���ν����� ȣ���ߴ� �������� �����ִ� Ű������ return�� �̿��ؼ� ����
		return d; // �޼ҵ� �̸� �տ� Ÿ�� int�� d �� ���ƾ��� (int->double �ڵ� �����õǴ°��� �����ϱ���)
		
		//��static ���ο��� �ٷ� ���� �ϱ� ���� ����( ���߿� ����)

		//���� ���ν���
	}
	// 2. ���������� 2���� ���޹޾Ƽ� �������� ����ؼ� �����int�� ������ power ��� ���ν����� �����
	//   ���ο��� ������ ���ν��� ���� �ؼ� ����� ������� �޴��� Ȯ��.
	static int power(int n1, int n2){
		int d = 1;
		for(int i=1;i<=n2;i++){
			d *= n1;
		}
		return d;
	} // (int)(Math.pow(n1,n2))

	// 3. ���������� �ϳ��� �޾Ƽ� 3�ڸ����� �ĸ��� ���� ���ڿ��� ������ ���ν��� �̸� format
	static String format(int val){
		String str="";
		//for(int i=1;i<=val.length();i++){
		
		//�ڡ�(�ڸ��� , ��� �Լ��� ��� do~ while�� �ƴ� while�� ����ԵǸ� 0�� ������� ���� )�ڡ�
		int i=1;
		do{
			str = (val%10)+ str;
			val /= 10; 
			if (i % 3 == 0 && val !=0){
				str = ","+str;
			}
			i++;
		}while(val != 0);
		return str;
	}


	//================================================
	public static void main(String[] args)	{
		System.out.println("main - start");
		// ������ ���ν����� ��� �Ѵٸ�, Math.pow() �� ����� ���·� ���� �ϸ� �ȴ�.
		// gap();
		// gap(true, 5);
		System.out.println(gap(5, 11));
		int r = gap(45,32);
		System.out.println("r == "+ r);
		
		int a = power(2, 10);
		System.out.println("power test "+ a);

		String aa = format(1000000);
		System.out.println(aa);
		//int b = Integer.valueOf(aa);
		//System.out.println(b); // ,���� ����(���ڿ�)�� �ٽ� ������ ������� �ȵǴµ�

		System.out.println("main - end");
	}
}
