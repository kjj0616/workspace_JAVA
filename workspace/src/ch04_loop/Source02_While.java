package ch04_loop;
class Source02_While {
	public static void main(String[] args) 	{
		/*
			while ��
			������ ���¿� ���� �۾� ó���� ������ �Ͼ�� �����ϴµ� �����ϴ�.
			(for loop�� Ư��ȸ���� �۾�ó���� �Ͼ�� �����ϴµ� ������)

			while (����üũ -> true �ݺ� /false ����) { �ݺ�����}
		*/
		int val = 0;
		int cnt = 0;
		while(val<=100){
			cnt++;
			int r = (int)(Math.random()*10);
			System.out.println("[Loop] r = "+r+ " / val = "+val +" / cnt = "+cnt);
			val += r;
		}

		System.out.println();
		System.out.println("[Main] val = " + val+" cnt = " + cnt);
		System.out.println();

	}
}
