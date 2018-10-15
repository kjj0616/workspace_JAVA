
public class Source03_Wrapper {
	public static void main(String[] args) {
		// Ư�� �����͸� ���� Wrapper ��ü�� ������ ����
		// ������ ���ΰ� �ƴϴ�.
		
		// ��� Wrapper ��ü�� valueOf ��� ����� �ִµ�, �̰� ���ؼ��� ������ �ִ�.
		// �Ű������� ���������� ����, �� ��ü�� ������ Ÿ���̳�, String�̴�
		Boolean b1 = new Boolean(true);
		Boolean b2 = Boolean.valueOf(true);	  // boolean
		Boolean b3 = Boolean.valueOf("true"); // String
		System.out.println(Boolean.TRUE); //�̸� �����ص� ��ü
		
		Integer i1 = new Integer(41);
		Integer i2 = Integer.valueOf(41);	 // int
		Integer i3 = Integer.valueOf("41");  // String
		/*
			valueOf  : ��ü�� �����ϴ� �޼ҵ�
			
			String d = "135000";
			int v = Integer.valueOf(d); // String -> Integer -> int 
		*/ 
		// b1 == b2 ���� ��ü? / b2 == b3 ���� ��ü?
		// i1 == i2 ���� ��ü? / i2 == i3 ���� ��ü?
		System.out.println(b1 == b2); // false
		System.out.println(b2 == b3); // true
		System.out.println(i1 == i2); // false
		System.out.println(i2 == i3); // true
		/*
		 * valueOf �� �̿��ؼ� Ȯ���ϴ� Wrapper��ü�� �̸� ������� ��ü�� �ش�.
		 * 	(Boolean �� true ������ �ִ� ��ü��, false ���� ��ü�� �̸� �����ΰ� ���߿� �ϳ��� ����)
		 *  ��ġ�� Wrapper ���� ����, -128 ~ 127 ������ �����ΰ�,
		 *  �� ���� ��ü�� ��������ɷ� ����, ���� ���� ���� ����
		 *  
		 * ########�ڵ� Boxing �Ͼ��, valueOf()�� ��ü�� Ȯ���Ѵ�.##########
		 * 
		###### 	Boolean  #######
		
		      public static Boolean valueOf(boolean b) {
        		return (b ? TRUE : FALSE);
    		  }
    		  public static final Boolean TRUE = new Boolean(true);
    		  public static final Boolean FALSE = new Boolean(false);
    		  
    		  
		######	Integer  #######
		
			  public static Integer valueOf(int i) {
        		if (i >= IntegerCache.low && i <= IntegerCache.high)
            		return IntegerCache.cache[i + (-IntegerCache.low)];
        			return new Integer(i);
    			}
    			
		 */
		
		Double d1 = Double.valueOf(3.14);
		Double d2 = 3.14;
		System.out.println(3.14);
		/*  ��ġ����ü�� ��� ���������� �����Ƿ� ���� ��ü�� �����Ѵ�.
		 
		###### Double  #######
		    public static Double valueOf(double d) {
        		return new Double(d);
    		}
    		
    	*/
	
	}
}
