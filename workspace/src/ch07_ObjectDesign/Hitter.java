package baseball;

public class Hitter {
	String name;	//������ �̸�
	int cnt;	// true �� ȸ��
	int in, out, middle;	// ��, �ƿ�, ��� ���� ĥ�� �ִ� �ɷ�

	// �� ��ü�� �̸��� �����ؼ� ����� �ְ� �����ڸ� ���� (�������� 0���� ����);

	// �� ������ �ܺ���Ű�������� �����ϰ� access ����

	public Hitter(String name){
		this.name = name;
		cnt = in = out = middle = 0;
	}

	public boolean swing(Ball t){
		/*
			���޹��� Ball ��ü�� type �� speed�� ����ؼ� true, false�� ����ó��
																-1 �� (�ٱ�), 0 (�߾�),  1 (����)
			-1�� ��� out = 0 �϶� 80~100���̸� 50�ۼ�Ʈ true, ������ false
					  out = 1 �϶� 80~100���̴� 80�ۼ�Ʈ true, 100~120 50�ۼ�Ʈ, ���̻��� false
					  out = 2 �϶� 80~100���̴� 100�ۼ�Ʈ ture, 100~120 80�ۼ�Ʈ, ���̻��� 50�ۼ�Ʈ
			0�� ��쿣 middle�� ���� �Ȱ���
			1�� ��쿡�� in�� ���� ������ Ȯ��
		*/
		boolean flag =false;
		switch(t.course){
		case -1:
			if(out ==0){
				if(t.speed>=80 && t.speed<100){
					if(Math.random()>0.5) {
						flag = true; 
						cnt++;
					}else{
						flag = false;
					}
				}
			}else if(out ==1){
				if(t.speed>=80 && t.speed<100){
					if(Math.random()>0.2) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}else if(t.speed>=100 && t.speed<120){
					if(Math.random()>0.5){
						flag = true;
						cnt++;
					}
					else flag = false;
				}else flag = false;
			}else if(out==2){
				if(t.speed>=80 && t.speed<100){
					flag = false;
				}else if(t.speed>=100 && t.speed<120){
					if(Math.random()>0.2) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}else{
					if(Math.random()>0.5) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}
			}
			break;
		case 0:
			if(middle ==0){
				if(t.speed>=80 && t.speed<100){
					if(Math.random()>0.5) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}
			}else if(middle ==1){
				if(t.speed>=80 && t.speed<100){
					if(Math.random()>0.2) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}else if(t.speed>=100 && t.speed<120){
					if(Math.random()>0.5) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}else flag = false;
			}else if(middle==2){
				if(t.speed>=80 && t.speed<100){					
						flag = true;
						cnt++;					
				}else if(t.speed>=100 && t.speed<120){
					if(Math.random()>0.2) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}else{
					if(Math.random()>0.5) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}
			}
			break;
		case 1:
			if(in == 0){
				if(t.speed>=80 && t.speed<100){
					if(Math.random()>0.5) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}
			}else if(in == 1){
				if(t.speed>=80 && t.speed<100){
					if(Math.random()>0.2) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}else if(t.speed>=100 && t.speed<120){
					if(Math.random()>0.5) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}else flag = false;
			}else if(in == 2){
				if(t.speed>=80 && t.speed<100){
					flag = true;
					cnt++;					
				}else if(t.speed>=100 && t.speed<120){
					if(Math.random()>0.2) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}else{
					if(Math.random()>0.5) {
						flag = true;
						cnt++;
					}
					else flag = false;
				}
			}
		}
		return flag;
		/*
		int per;	
		switch(target.course) {
		case -1 :
			per = out;	break;
		case 0 :
			per = middle;	break;
		default :	
			per = in;	break;
		}
		if(target.speed >= 120) {
			if(per == 2 ) {
				if(Math.random()>0.5) {
					cnt++;
					return true;
				}
			}
		} else if(target.speed>=100) {
			if(per ==2) {
				return true;
			}else if(per==1) {
				if(Math.random()>0.5) {
					cnt++;
					return true;
				}
			}
		} else {
			if(per ==2 || per == 1) {
				return true;
			}else if(per==0) {
				if(Math.random()>0.5) {
					cnt++;
					return true;
				}
			}
		}
		return false; // ����Ʈ false�� ��� true���Ǹ� �����ϴ� ���
	}

		*/
	}


	public String current(){
		// �÷��̾��̸�, hit count����, in,out,middle���� ������ ���ڿ� �����
		return " player "+this.name+" hit count : "+cnt +" in,out,middle : "+in+","+out+","+middle;
	}
	
	public void levelUpIn(int mode){
		if(mode == -1){
			this.out ++;
			if(out<=3)
				out = 2;
		}else if (mode == 0){
			this.middle ++;
			middle = middle>=3 ? 2: middle;
		}else{
			if(in<2)
				this.out ++;
		}
	}
}
