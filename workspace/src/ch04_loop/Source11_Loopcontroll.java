package ch04_loop;
class Source11_Loopcontroll {
	public static void main(String[] args)	{
		
		for(int cnt=1; cnt<=10; cnt++){
			int r = (int)(Math.random()*100);

			if(r/10 == r%10){
				
				System.out.println("�ʱ⼳�� ������� ���� "+r);
				break; // �ݺ��� ���� ������� loop�� ����
			}
			System.out.println("r == "+ r);
		}
		/*
			���� loop�϶��� break�� continue�� ��� �۵��ϰ� �Ǵ°�..?
		*/

		for(int out=1; out<=5; out++){
			System.out.println("out = "+out+"start");
			
			for(int in=1; in<=5;in++){
				int r = (int)(Math.random()*3);
				if(r==0)
					continue; // �Ҽӵ� loop���� ������ ��ġ�� ��
				else if(r==1)
					break; // �Ҽӵ� loop���� ������ ��ġ�� ��
				System.out.println("in.."+out+"-"+in+"end");
			}
			System.out.println("out turn end");
		}

	}
}
