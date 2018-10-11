/*
	2. static �� ������ ����,
		��ü���� ���� �������� �ʰ�, �ش�Ÿ���� ��� ��ü�� �����ؼ� ����ϴ� ���念���̳�
		���ν����� �����Ѽ��� �ִ�.

		�� static ����ҿ� �ʱ�ȭ �۾��� �ؾߵȴٸ�, �����ڸ� �Ἥ ó���ϸ� �ȵǰ�
		static �ʱ�ȭ ����� ���� �����ϴµ�, �װ� �̿��ؼ� �ذ��ؾߵȴ�.
*/
class Enemy {
	
		static int health;
		int damaged;
		
		static {	// �� �ȿ����� static ���õ� �͸� ����
			health = 0;
			// damaged =3;
			// Enemy ��ü�� ó�� ����Ҷ� 1���� �۵�
			// ��ü�� �����Ǹ� ���������� ������ �� �͵��� ����Ұ�
			System.out.println("Enemy ��ü ������");
		}

		Enemy(){
			health = damaged = 0;
			System.out.println("Enemy ��ü ������");
		}
		
		static void heal(int d){
			// ���࿡ ������ ���ν����� ������ü�� �����ϴ� ���ν����� �ƴ϶�
			// ��ü ��ü���� ������ ���� �� �����ϴ� ���ν������, static ������ �����ϴ�. (����)
			health += d;
			// �޸� ���� ����? - ��ü�� ������ �ƴ� 1���� ������
		}

		void attacked(int dmg){
			damaged += dmg;
			health += dmg;
		}

		String info(){
			return "health = "+health+"/damaged="+damaged;
		}

	
}
