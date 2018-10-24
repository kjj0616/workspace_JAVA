package ch07_ObjectDesign;
/*
	����� ��ü�� �����ϸ鼭, ������ ���念�� �̶�, �ؾߵ� ����� �������
	�����صξ���ϴ��� ���캸�Ҵ�.
	�̰� ���� ����� �߿��� �κ��̱� �ϳ�, �� �ܿ� �˾Ƶθ� ���� �͵��� �� �����Ѵ�.

	1. constructor (������)
		: ��ü�� ����� �� ����, �ʱ�ȭ�� ��Ű�°� �ƴ϶�
		��������鼭 ����°� ���ֱ� ���Ҷ� �����صδ� ��
		�����ϴ� ��ü������ ����Ÿ�Ծ��� Procedure ���·� �����ϸ� �ȴ�.
		: ������ �ʿ��� �����͸� �ѱ�鼭 ��������Ե� ������ �����ϴ�.

		: ��ü �����ڸ� �ϳ��� �����صѼ� �ִ°� �ƴϴ�. �����ε��� �����ϴ�.
*/

class Bot {
	int stamina;	// ü��
	int count;		// �۾�ȸ��

	void init(){
		stamina = 100;
		count = 0;
	}
	
	//--------- Constructor ������ -----------

	Bot(int initStamina){ // �����ÿ� �Ű����� �־ �����ؾ� ��
		stamina = initStamina;
		count = 0;
		System.out.println("constructor");
	}

	Bot(){ //�⺻������ (����δ�����)
		stamina = 100;
		count = 0;
		System.out.println("constructor");
	}

	//----------------------------------------

	String tell(){
		return "STAMINA : " + stamina + " , COUNT = "+ count;
	}

	boolean move(int distance){
		/*
			���޹��� �Ÿ���ŭ �̵��Ѵٰ� �����ϰ�,
			ü�¼Ҹ� �̵��Ÿ� 10�� 1�� ����
			�� ��ü�� �̵��� �ʿ��� ���׹̳ʰ� �ִٸ�, count++,
			�Ҹ� stamina���� ���ҽ�Ű�� return true
			�װ� �ƴϸ� return false
		*/
		int need;
		if(distance>stamina*10){
			return false;
		}
		else{
			need = distance/10; 
			//distance%10 == 0 ? need : need++ ;
			if (distance%10 != 0)
				need++;	
			stamina = stamina - need;
			count++;
			return true;
		}
	}
	/*
		int need= 0;
		while(distance >0){
			need++;
			distance -= 10;
		}

		in need = distance/10;
		if(need%10>0)
		need++;

		int need;
		if(distance%10 ==0)
			need = distance/10;
		else
			need = (distance/10)+1;
	*/


	/*
	9 - > 1 , 21~ -> 3
	Bot b = new Bot();
	b.move(10); // false
	System.out.println(b.tell()); // init�����Ƿ� 0 0
	b.init();
	b.move(15);
	System.out.println(b.tell()); // 98 , 1
	*/
}
