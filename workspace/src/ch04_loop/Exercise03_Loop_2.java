package ch04_loop;
class Exercise03_Loop_2
{
	public static void main(String[] args) 
	{
		//vip ��� ���
		
		System.out.print("�����ݾ�: ");
		int charge =Integer.valueOf(System.console().readLine());

		//���� �ݾ׸�ŭ vip ����� �ö�.
		//0 ~3 ��ޱ����� ��޴� 5000�� 
		//3 ~6 ��ޱ����� ��޴� 10000�� 
		//6~ 10 ��ޱ����� ��޴� 10000+������ *1000 ��
		int i=0;
		while(charge >=0){
			i++;
			switch(i){
	
				 case 1: case 2: case 3:
					charge -= 5000; break;
				 case 4: case 5: case 6:
					charge -= 10000; break;
				default:
					charge = charge -(10000+(i-1)*1000); break;

			}		
		}
		System.out.println("�������� "+(i-1));
		System.out.println();

		//�� ��޺� ĿƮ���� ������ ���
		int cut =0;
		for(int j=1; j<=10; j++){
			
			switch(j){
				case 1: case 2: case 3:
					cut +=5000; break;
				case 4: case 5: case 6: 
					cut += 10000; break;
				default:
					cut = cut +(10000+(j-1)*1000); break;

			}
			System.out.println(j+"��ޱ��� �ʿ� ������ "+cut+"�Դϴ�");
		}
	}
}
