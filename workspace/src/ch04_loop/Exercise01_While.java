package ch04_loop;
class Exercise01_While {
	public static void main(String[] args) {
		/*
			3�ڸ�����, �ĸ�ó���� String�� ��������.

				str = viewer%10+str; // ������ �� ������ ���ڿ� �������� ����
				viewer /= 10;
				System.out.println("str = "+str+" / viewer = "+viewer);

			3���� �۾��� ������ str = "," +str;			

			���ڿ�ó���� ��� �ִ°� �����ϳ� ���°�� �����Ƿ� �����Ұ�

			�ڡ� do ~while�� �ƴ� while�� ó���� 0�� �Է°����� ������ ERROR�� ���� �ڡ�
		*/
		int viewer = 461230;
		String str = "";
		int cnt = 0;
		while(viewer != 0){
			cnt++;
			str = (viewer%10) +str;
			viewer /= 10;
			
			System.out.println("[Loop] str =	"+str+"	/ viewer =	"+viewer+"	/ cnt = " +cnt);

			if (cnt%3==0 && viewer!=0) //viewer>0
				str = "," + str;
		}

		System.out.println("str = " +str);


	}
}
