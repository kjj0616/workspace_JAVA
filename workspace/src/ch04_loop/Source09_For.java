class Source09_For {
	public static void main(String[] args)	{
		/*
			�����ȿ��� �ٽ� ������ �����ϴ� ������ ������ ���������ϴ�.
		*/
		for (int lv=1; lv<=5 ; lv++){
			System.out.println("lv == "+lv);
			for (int step=1; step<=10 ; step++){
				System.out.println("step == " +step);
			}
			System.out.println();
		}
		/*
			�̷� ������ loop ������, 2�� 1�������� 10���������� ����غ���
		*/
		
		for(int step=1;step<=10; step++){
			int d =1;
			for(int cnt=1; cnt<=step; cnt++){
			// �ٱ��� loop�� ��ȭ�ϴ� ���� ������, ���η����� �������λ���ϴ� ���°�
			// �ߺ������� loop �� ���� ���� ������ �ʿ��ϰ� �ȴ�.
				d *=2;
			}
			System.out.println("d == " +d);
		}		
		//=====================================================================
		// 1 3 6 10 15 21 28 36 45 55
		//0+1 0+1+2 0+1+2+3 0+1+2+3+4 .....
		/*
			i1 - j0+1
			i2 - j0+1+2
			i3 - j0+1+2+3
		*/

		for(int i=1;i<=10;i++){
			System.out.print("����Ʈ"+i);
			int sum=0;
			for(int j=0;j<=i;j++){
				System.out.print(j);
				sum += j;
			}
			System.out.println();
			System.out.println(i+"���� ���� = "+sum);
			System.out.println(i+"���� ���� = "+sum);
		}
		
		int total =0;
		for (int num=1; num<=10;num++){
			System.out.print("num ==" + num);
			total += num;
			System.out.println("/ total == " +total);
		}

	}
}
