class Source03_If {
	public static void main(String[] args) 	{
		/*
			if - else branch ���鶧 �˾Ƶ� �͵�

			����� branch �̴�, branch �ȿ� �ؾߵ� ó���� �۾� �ϳ���� {} �� ���� �ص� �ȴ�.

		*/
		int r = 100;
		boolean flag = Math.random()>0.5;

		System.out.println("r == "+ r + " , " + flag);
		if(flag) //if(flag == ture)  
			r *= 10;
		else
			r += 100;
		System.out.println("r == " +r );
		System.out.println();
		//=======================================================
		// 2. branch �ȿ��� ������ ����� ����� �� ������,
		//   �̰� �ش� branch ������ ��밡���ϴ�.
		if(Math.random() > 0.3){ // {} �������� ���λ�������
			int d = r/10 + r%10;
			System.out.println("d ==" +d);
		}else {
			String d = "branch";
			System.out.println("d ==" +d);
		}
		// System.out.println("d == " + d); //{}�ܺο��� ���Ұ�

	}
}
