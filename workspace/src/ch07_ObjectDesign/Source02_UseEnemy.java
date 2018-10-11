class Source02_UseEnemy {
	public static void main(String[] args)	{
		System.out.println(Enemy.health);

		Enemy e1 = new Enemy();
		Enemy e2 = new Enemy();
		System.out.println("e1? " + e1.info());
		System.out.println("e2? " + e2.info());
		e1.attacked(25);
		System.out.println("e1? " + e1.info());
		System.out.println("e2? " + e2.info()); //health 25�ٲ����
		Enemy e3 = new Enemy();
		System.out.println("e1? " + e1.info());
		System.out.println("e2? " + e2.info()); 
		/*
			Enemy
				int health - ������
				+ heal()

			e1				e2				e3
			damaged			damaged			damaged
			attacked		attacked		attacked
			info			info			info
		*/

		/*
			��ü�� ������ ��(�������ִ�) static ������, �Լ���
			�ٷ� ������ �����ϴ�.
			��ü�� �������� �ʾƵ� �ٷ� ��밡��
		*/
		System.out.println("e1? " + e1.health);
		e2.heal(44); 
		// ������ü�� Ÿ�� �����ص� static ��밡���� �ϴ�.
		// �ٸ� ������ �� �ν��� ������ �߻���

		System.out.println(Enemy.health);
		Enemy.heal(4);  // �Ϲ����� �����
//		Enemy.attacked(55);  error
	}
}
