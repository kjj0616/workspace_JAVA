package ch07_ObjectDesign;
/*
	����ڰ� �������� �ֽ�(��ü)�� �������� ��ü
*/
class Market {
	Stock s1, s2, s3;

	Market(){
		//	������ ������ Stock��ü �ϳ����� ���� ������ �ص���
		s1 = new Stock("���");
		s2 = new Stock("������");
		s3 = new Stock("������");
	}

	String dayOff(){
		// s1, s2, s3�� ������ѵ� ��ü���� �̿�, Stock ��ü�� change() ���ѵΰ�,
		// Stock�� turn�� �������ѵ���.
		Stock.turn++;
		s1.change();
		s2.change();
		if (Math.random()>1.0){ //���
			s3 = new Stock("�����͹�ũ");
		}else{
			s3.change();
		}
		return "���ٸ��� ���� ���� �����Ǿ���.";

	}

	void buyStock(int num, int amount){
		switch(num){
		case 1: 
			s1.amount += amount; break;
		case 2: 
			s2.amount += amount; break;
		case 3: 
			s3.amount += amount;
		}
		/*
			if(num==1)
				s1.amount += amount;
			else if(num==2)
				s2.amount += amount;
			else
				s3.amount += amount;
		*/

	}

	boolean buyStock(int stockNo, int cnt, Player p){
		/*
			������ϴ� �ֽ��� �Ѿ��� �÷��̾��� �ڻ꺸�� ������,
			ó���� ���ְ�(�ֽİ����� �ø��ٰų�, �÷��̾��� �ڻ��� �ٷ��ִ� �۾�) return true;
			�װ� �ƴϸ� return false;
		*/
		Stock snum;
		if(stockNo==1)
			snum = s1;
		else if(stockNo==2)
			snum = s2;
		else if(stockNo==3)
			snum = s3;
		else 
			return false;

		if(snum.value * cnt <= p.balance){
			snum.amount += cnt;
			p.balance -= snum.value*cnt;
			return true;
		}else{
			return false;
		}


		/* n.1
		Stock snum;
		switch(stockNo){
			case 1: snum = s1; break; 
			case 2: snum = s2; break; 
			case 3: snum = s3;  
		}

		if(snum.value * cnt <= p.balance){
			snum.amount += cnt;
			p.balance -= snum.value*cnt;
			return true;
		}else{
			return false;
		}
		*/
	}

	boolean sellStock(int stockNo, int cnt, Player p){
		/*
			�Ȱ����ϴ� �ֽ��� ������ ������������ ���ų� ������ ,
			ó���� ���ְ�(�ֽİ����� ���̰�, �÷��̾��� �ڻ��� �÷��ִ� �۾�) return true;
			�װ� �ƴϸ� return false;
		*/
		Stock snum;
		if(stockNo==1)
			snum = s1;
		else if(stockNo==2)
			snum = s2;
		else if(stockNo==3)
			snum = s3;
		else 
			return false;

		if(cnt <= snum.amount){
			snum.amount -= cnt;
			p.balance += snum.value*cnt;
			return true;
		}else{
			return false;
		}


		/*
		Stock snum;
		switch(stockNo){
			case 1: snum=s1; break; 
			case 2: snum=s2; break; 
			case 3: snum=s3; break; 
		}

		if(cnt <= snum.amount){
			snum.amount -= cnt;
			p.balance += snum.value*cnt;
			return true;
		}else
			return false;
		*/
	}

	void sellStock(int num, int amount){
		switch(num){
		case 1: 
			s1.amount -= amount; break;
		case 2: 
			s2.amount -= amount; break;
		case 3: 
			s3.amount -= amount;
		}
		/*
			Stock target;
			if(num==1)
				target = this.s1;
			else if(num==2)
				target = s2;
			else
				target = s3;
			
			target.amount -= amount;
		*/
		


	}

	int totalValue(){
		return s1.value*s1.amount +s2.value*s2.amount +s3.value*s3.amount ; 
	}
}
