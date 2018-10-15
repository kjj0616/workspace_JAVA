
public class Source04_Wrapper {
	public static void main(String[] args) {
		/*
		 * Wrapper ��ü�� �����ϸ鼭, ���� ��ü�� ������ �����͸� ����
		 * 	equals �� compareTo �� �����͸� ���Ҽ� �ִ� ��ɵ��� ��κ� �����ص�
		 *  
		 *  �����͸� ������� �۵��ϴ� ��ɵ��� �׷��� ������ ��ɵ��� ������ �ʴ�.
		 *  
		 *  static���� �ش� Ÿ���� �����͸� �ٷ궧 ����� ��ɵ��� �ν� ������ �͵��� ����.
		 */
		Boolean b = new Boolean(true);
		//�޼ҵ� �߿� �����ܿ� S�پ��ִ°͵��� static �پ�����, �������� �ٷ����ٰ���
		
		Integer i = 44;
		i.doubleValue();
		boolean a = Boolean.logicalAnd(true, true);
		System.out.println(a);
		boolean aa = Boolean.logicalOr(true, false);
		System.out.println(aa);
		
		/*
		 * �� Wrapper ��ü�� ������ �߿��� ��ɵ��� (������)
		 *  
		 *  String �� �м��ؼ� �ش� type�� �����͸� ������ ����̴�.
		 *  
		 *  ( valueOf �� �������� ��Ա� ������, �װ� �ᵵ �Ǳ� �� -> ��ü���� ->�����ڽ�)
		 */
		
		// Boxing  VS Parsing�м�
				
		boolean r1 = Boolean.parseBoolean("true"); // return value�� Boolean�� �ƴ� boolean��
			int r2 = Integer.parseInt("123"); // parsing �Ľ� 
			int r3 = Integer.valueOf("123"); // ��ü���� -> ��ڽ�
		 double r4 = Double.parseDouble("3.14");
		  float r5 = Float.parseFloat("1.4");
		
		 /*
		  *  �� Wrapper ��ü�� String ==> data�� �м��Ҽ� �ִ� parsing ����� �����Ѵ�. 
		  */

	}
}
