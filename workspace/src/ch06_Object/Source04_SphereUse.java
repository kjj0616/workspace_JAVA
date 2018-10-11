/*
	������ sphere ��ü�� ���� �����Ǽ� �۵��ɶ� ����� ���ư����� Ȯ��
*/
class Source04_SphereUse {
	public static void main(String[] args)	{
		new Sphere();
		
		Sphere sp1 = new Sphere();
		System.out.println(sp1); //Sphere@15db9742
		System.out.println(sp1.calcArea()+ "..."+sp1.radius);//�����͸� �������ϰ� ��ü�� ������?
								//0.0		...		0
		/*
			��ü�� ��������� ������ ������ ���ٸ� 0���� ������ �Ȼ��·� �۵��� �ȴ�.

			boolean : false , ���������� 0, �Ǽ������� : 0.0, ��ü�� null
		*/
		sp1.radius = 3;
		System.out.println(sp1.calcArea()+ "..."+sp1.calcVolume()); 
						// 113.09731200000002...113.09731200000002
		sp1.grow(2);
		System.out.println(sp1.radius);		//	5

		System.out.println(sp1.calcArea()+ "..."+sp1.calcVolume()); 
							// 314.1592		...		523.5986666666666

		Sphere sp2 = new Sphere(); 
		System.out.println(sp2); //Sphere@6d06d69c
		sp2.change(5);
		System.out.println(sp2.calcArea()+ "..."+sp2.calcVolume()); 
							// 314.1592		...		523.5986666666666

		System.out.println(sp1 == sp2); // ������ü�ƴϹǷ� false
		System.out.println(sp1.radius == sp2.radius); //���������� �����Ƿ� true

		System.out.println(sp1.greaterThan(3)); //true
		System.out.println(sp1.greaterThan(sp2.radius));//false

		/*
		Sphere@15db9742
		0.0...0
		113.09731200000002...113.09731200000002
		5
		314.1592...523.5986666666666

		Sphere@6d06d69c
		314.1592...523.5986666666666
		false
		true
		true
		false
		*/
	}
}
