class Source07_VariableOperation {
	public static void main(String[] args) 	{
		/*
			������ �����͸� �����ϴ� �۾���  = (�Ҵ�/����) �ܿ��� �� �����Ѵ�.

			��ġ�� ������ ����
			{ +=, -=, *=, /=, %=,}{  ++, -- }������ �����ϴ�.
		*/
		int ammount;
		ammount = 10000;
		ammount += 100;
		System.out.println("ammount = "+ammount);
		ammount -= 6000;
		System.out.println("ammount = "+ammount);
		ammount *= 3;
		System.out.println("ammount = "+ammount);
		
		ammount++; //1����
		System.out.println("ammount = "+ammount);
		ammount--; //1����
		System.out.println("ammount = "+ammount);
		++ammount; // ++�� ���� ���̳� �ڿ� ������ ����
		System.out.println("ammount = "+ammount);
		// ������ ó������� ������, �ٸ� ��찡 �ִ�.
		//---------------------------------------------
		int val = 30;
		System.out.println(val++); // 30
		System.out.println(++val); // 32
		System.out.println(val);   // 32
		/*
			++, -- �� ���� ���ʿ� ������, �ε�ǰ� ��ȭ�� ��
						   ���ʿ� ������, ��ȭ�� �����ǰ� �ε��

			�ε尡 ���� �ʴ� ��Ȳ������ �������
		*/
		val = 10;
		int cheak = val++ + ++val + ++val + val++ +val;
				//  10	 +	12	 +	13	 +	13	 + 14	 
		System.out.println("val = " +val); // 14
		System.out.println("check = "+cheak); //62
		
		val = 10;
		val %= 3;	// 1
		cheak = ++val * val++ * val * ++val * val--;
			 //  2    *  2    *  3  *   4   *  4      
		System.out.println("cheak = "+ cheak); //192
		System.out.println("val = " + val); //3
	}
}
