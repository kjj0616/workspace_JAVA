class Source03_UseStage {
	public static void main(String[] args)	{
		// Stage ��ü�� �����ϸ鼭 player �� �����ɼ� �ְ� Stage�� constructor�� �����ص���
		// �� �����ڸ� ���°� ������, 
		// player �̸������ϰ�, score 0 ���� �ʱ�ȭ�Ǵ� start()���ν�������
		Stage s1 = new Stage("�����");
		/*
			Stage s1 = new Stage();
			s1.player = "�����";
		*/
		Stage s2 = new Stage("��ǻ��");


		System.out.println(s1.status()); // [�����] - 0��
		System.out.println(s2.status()); // [��ǻ��] - 0��

		// s1.init("client");
		for(int cnt=1; cnt<=3;cnt++){
			Stage.execute();	
			// �� �۾��� ��Ű�� �Ǹ�, round�� �ö󰡰�,
			// ���� 2�� �������� �̾Ƽ� �̰� �� answer ���� �����صΰ�,
			// ����ڿ� �����ΰ� �۾��� ����
			System.out.println(Stage.round);	// 1
			System.out.println(Stage.question);	// 45 +79 = ?
			System.out.println(Stage.answer);   // 124
			//==========================================================
		}
		// ���������͸� �ѱ�� ������, ����ߵǴ� static���� ������ answer�� ���ؼ� ��ġ�ϸ�
		// score 10���� �ø��� return true; �ƴϸ� return false; ��Ű�� ����
		// ���������� ���� - static �Ұ���, ��ü�� ������ Ÿ�� ����
		boolean b1 = s1.cheak(139); 
		System.out.println(b1);
		boolean b2 = s2.cheak(Stage.answer);
		System.out.println(b2); // 100�ۼ�Ʈ true

		System.out.println(s1.status()); // [�����] - 0��
		System.out.println(s2.status()); // [��ǻ��] - 10��

		System.out.println(Stage.current());
		// [ROUND-01] 13+21 = ?
	}
}
