
class Cage{
	static int idx;
	int num;

	Animal one;
	Animal other;
	
	Cage (){ // cage���������� ����++
		num = idx++;
	}
	
	boolean push(Animal t){
		if(one==null){
			one = t;
			return true;
		}else if(other == null){
			other = t;
			return true;
		}else{
			return false;
		}
	}

	Animal birth(){				// ������ü�� �����
		if(Math.random()>0.5){
			return new Tiger();		// ������ü����
		}else{
			return new Elephant();	// ��� ó���Ҽ� �ִ�.
		}
	} 
}

//=============================================================


class Source04_UsePolymorphism {
	public static void main(String[] args)	{
		Cage c = new Cage();
		Tiger t = new Tiger();
		c.push(t);
		Korean k = new Korean();
		c.push(k);
		// Ư��Ÿ�Կ� ���ѵ� ó���� �ƴ϶�,
		// �迭��ü�� ó���Ҽ� �ִ� ������ ��ɱ����� ����������.
		Animal a = c.birth();
		System.out.println(a); // Tiger@6d06d69c ,Elephant@6d06d69c

		System.out.println(a instanceof Tiger);	// ��ü Ÿ�� Ȯ�� �޼ҵ�
		System.out.println(a instanceof Korean);

		// ���� ���� Ÿ������ �������� �ʴ���, �� ��ü�� ���µ� ������ ����.
		
		Human h = new Human();
			h.healthUp();
		System.out.println(h.inform());
		
		// extends�� �ɾ ����� �ɶ�,
		// �˾Ƶ־� �Ǵ� ������ ���� ������� �� Ư¡���� �����Ҽ� �ִ�.
	}
}
