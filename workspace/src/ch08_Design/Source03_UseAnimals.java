class Source03_UseAnimals {
	public static void main(String[] args)	{
		Korean k = new Korean();
		European e = new European();
		Tiger t = new Tiger();
		Elephant l = new Elephant();
		/*
			!! extends �� ���� ��ü�� extends�� �� ��ü�� ��ü������ ������ �ִ�. !!

			Korean ��ü�� ���� animal �κ��� Human�� ��ó Ȯ��Ǹ� ������� ��ü�̴�.
			Korean ��ü��, Animal�� ������ ������ �ϳ��� ������ ����� �Ǳ⿡
		*/
		Animal a = new Korean();	// Korean ��ü�� ����Ÿ���� ��ü������ �����Ҽ� �ִ�.

		Human b;	//HumanŸ���� ��ü������ ����Ǵ� ��ü�� Human�� �迭�̸� �� ������ �� �ִ�.
		b = new Korean();
		b = new European();
		// b = new Tiger(); // Error

		Tiger t;
			t = new Tiger();
			t = new Tiger();
			//t = new Elephant(); //Error
		// �̰� �̿��ϱ� ���ؼ�, ��Ӱ��踦 ���� Ȱ���ϱ⵵ �Ѵ�.

		/*	
						   Promotion(������ Ÿ�Ժ�ȯ)

						 ----------------------------->    

			[ �ΰ� ]                                           [ ������ ]

						<-----------------------------

						   Cast (����� Ÿ�Ժ�ȯ)

		*/

		// ��ӹ��� ��ü�� ���� ��� ���� �������� �򰥸� �� �ִ�.
        // instanceof �� ����ϸ� ���� ��ü�� Ȯ���� �� �ִ�.
		/*

        if(mamal instanceof Cat) {
            Cat cat = (Cat)mamal;
            cat.mew();
        }else {
            System.out.println("����� ��ü�� �ƴմϴ�.");

		*/
		
		/*

		�� java���Ͽ� ���� class�� ������ �� �ִ�.
		�ٸ� �����̸��� class�̸��� ��ġ�ؾ��ϴµ�  ���� �̸��� class�� �������� ���� ����.

		���� ��ǥ class�� �����ش�.
		��ǥ class�� public���� �������ְ� ������ class���� public�� ������ �ʴ´�.

		�������� �ּ� 3���ڰ� ����.
		� ������ �ִ��� Ȯ���ϱ� ���� !

		*/
	}
}
