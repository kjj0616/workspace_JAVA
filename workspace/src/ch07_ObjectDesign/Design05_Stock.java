/*
	�ֽ� ���� �ùķ��̼��� ���ؼ�, �ֽ������� ��üȭ���ѵ���
	# this ��� ���� ����ϴ� �� #
	this �� ��ü�� ��������� ������ ������ �� ��ü���� ������ ���� (����)

	this.		������� ��ü�� ������ �� �͵��� ����ϰ��� �Ҷ�

	this();		�����ڿ����� ���� �ִ� ��������, �ٸ������ڷ� �Ѱܼ� ������Ű���� �Ҷ�

*/

class Stock {
	//--------��������
	static int turn;

	static {
		turn = 0;
	}
	//---------------
	String product;
	int value;
	int amount;		
	
	Stock(String product){
		/*
		this.product = product;
		this.value = 500;
		amount = 100;
		*/
		this(product, 5000);	// �����ڿ����� ��밡��, ��Ϳ� �����Ұ�!
//		System.out.println("Stock(String)");
	}
	
	Stock(String product, int value){
		this.product = product;
		this.value = value;
		amount = 0;
//		System.out.println("Stock(String,int)");
	}

	String current(){
	//	this(product, 500); // this(); �� ȣ���� ������ �ȿ����� �����ϴ�
		return "Day." + Stock.turn + " :	" +this.product + "	���簡�� : " + this.value
			+"	������ : "+amount;
	}
	
	void change(){
		int value = this.value;	
		/*
			�� ��ü�� ��������� ������ ������ �� ������������
			���ν��� �����ϴµ� �־ ������ �ᵵ ������ ���а� �����ʴ´�.

			�� ���ν��� �ȿ��� ���Ǵ� value ������,
			��ü�� �����Ե� value�� �ƴ� �� �ȿ��� ������ value�� ���δ�.

			�� ���ν��� �ȿ��� ��ü�� ���� ������ ���� ���� ���ؼ�
			�������� �Ǹ� this�� �������ָ� �����ؼ� ����� �� �ִ�.
		*/
		int high = (int)(value*1.3);
		if(high%100 !=0){
			high -= high%100;
		}
		
		int low = (int)(value*0.7);
		if(low%100 != 0){
			low += 100;
			low -= low%100;
		}
		
		high /= 100;
		low /= 100;

		value = low +(int)(Math.random()*(high-low+1));
		value *= 100;
		//System.out.println("this.value , value = " + this.value + " , " + value);
		this.value = value;
		/* ==
		value = low +(int)(Math.random()*(high-low+1));
		value /= 100;
		value *= 100;
		*/
		/*
			���ν��� �����Ҷ� ������ ��ġ�� �ʴ´ٸ�, ���� this�� �������ص� ������,
			��ó�� �ΰ��� ���ٵǴ� ��Ȳ�� �ȴٸ�, 
			this�� �ٿ��� �� ��ü�� ����ų ������ �׷��� ���� ������ ����������� �ȴ�.

			�Ϻη� ��ġ�� ��Ȳ�� �ִ�.
			
			�����ڳ� ���� Ư�������ͷ� �����ϰ� �ϴ� ������ ���ν��� �϶�

		*/
		/* ?
		per = (7 + (int)(Math.random()*(13-7+1)))/10.0;
		int result = value*per;

		if(result%100!=0){
			if(
		}
		*/

		// ������ ���� 796 -> 7 -> 700 

		

	}
}
