
public class Source02_Wrapper {
	public static void main(String[] args) {
		// Wrap(Boxing) , UnWrap(UnBoxing) �� �ڵ����� �Ͼ��.
		Integer n1 = new Integer(4561);
		Integer n2 = 4561;
		Integer n3 = 4561;
		System.out.println(n1+" / "+n2+" / "+n3);
		System.out.println(n1==n2); //false
		System.out.println(n1==n3); //false
		System.out.println(n2==n3); //false
		System.out.println();
		System.out.println(n1.equals(n2));	// true;
	    /*
				public boolean equals(Object obj) {
			        if (obj instanceof Integer) {
			            return value == ((Integer)obj).intValue();
			        }
			        return false;
			    }
	    */
		System.out.println(n1.intValue()==n2.intValue()); //true;
		
		int v1 = n1; // UnWrap(UnBoxing)  �˾Ƽ� Ǯ���� ����
		System.out.println(v1);
		System.out.println(n2 + n3); // UnWrap(UnBoxing) ��ü�� ���ϱ�, 1.5 ���� �ڵ�����
		/*
		 * �̰� ����ڽ�,��ڽ� �̶�� �θ���
		 */		
		System.out.println("======================================");
		boolean b1 = true;		//������ new�� �����ϴ°��� ����
		boolean b2 = true;
		System.out.println(b1 == b2); //������ false�� ������ true, ���� ��ü
		
		Integer i1 = 127; // -128 ~ 127 ������ true ������ü
		Integer i2 = 127; // 			�̿��� ���� false �ٸ���ü
		// i1++; //
		System.out.println(i1 == i2); // true, ���� ��ü
		// why?
		
		Integer i3 = 128; // -128 ~ 127 ������ true ������ü
		Integer i4 = 128; // 			�̿��� ���� false �ٸ���ü
		// i1++; //
		System.out.println(i1 == i2); // false �ٸ� ��ü
	}
}
