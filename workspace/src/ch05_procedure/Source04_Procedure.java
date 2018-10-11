class Source04_Procedure {
	/*
		�ݺ��� ���� , ���ν��� ���� ����
		�Ǻ���ġ ����
		0,1,1,2,3,5,8,13,21,55,89,144,...

		n��° �Ǻ���ġ ���� ������ ���ν����� ����
		int�� �����°� �����̰�, int �ϳ��� �޾Ƽ� �۵��ǰ� fibonachi��� �̸����� ����� �ȴ�.
	*/
	static int fibonachi(int val){
		int a1 = 0;
		int a2 = 1;
		for (int i=1;i<val;i++){
			int num = a1 + a2;
			//   3     1    2
			a1 = a2;
			//1   2
			a2 = num;
			//2   3
		}
		return a2;
	}
		/*
		if(idx ==1)
			return 1;
		else{
			for (int i=1;i<val;i++){
			int num = a1 + a2;
			//   3     1    2
			a1 = a2;
			//1   2
			a2 = num;
			//2   3
		}
		return a2;
		*/
	/*
        2���� ������ x,y ��ǥ�� �ΰ�(�� int 2��)�� �޾Ƽ� �Ÿ��� ������ִ� ���ν����� ����
		double�� return �ϴ� ����, int 4���� �۵��ǰ� range��� �̸����� ����� �޶�
		(int x1, int y1, int x2, int y2) , sqrt ��� 0,0,3,4 -> 5.0

		(x2-x1)^2 + (y2-y1)^2 �� ���� ������(��Ʈ) = �������� = ��ǥ���� �� �� ������ �Ÿ�
	*/
	static double range(int x1, int y1, int x2, int y2){
		double d1 = Math.pow((x2-x1),2);
		//double da1=(x2-x1)*(x2-x1);
		
		double d2 = Math.pow((y2-y1),2);
		//double da2=(y2-y1)*(y2-y1);

		double d = Math.sqrt(d1+d2);

		return d;
		//return Math.sqrt(d1+d2);

		//return Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
	}

	public static void main(String[] args)	{
		// 1��°�� �Ƹ� �������� 1, ���� ����� 2��° ������ ����� �ϸ� �Ǵµ�
		/*
		int prev = 0;
		int current =1;
		for (int cnt=1;cnt<=5;cnt++){
			int next = prev + current;
			prev = current;
			current = next;
			System.out.println(cnt +" p: "+prev+ " c: "+current);
			return current;
		}
		*/
		// �� �۾��� ó���Ҽ� �ְ� ���ν����� ����ð�

		int v = fibonachi(3);
		System.out.println(v); //2
		System.out.println(fibonachi(10)); //55

		System.out.println(range(0,0,3,4)); //5.0
		System.out.println(range(2,1,5,5)); //5.0
		System.out.println(range(0,0,-5,-12)); //13


	}
}
