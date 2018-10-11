/*
 *  ���Խ� : regular expression
 */
public class Source04_Regex {
	public static void main(String[] args) {
		// ���Խ��� ���ڿ��� �ۼ��ϸ� �ȴ�.
		// �� �ȿ� ���ڰ�����, ������ �м��ϴµ� ���ȴ�.
		
		/*	.matches(String regex)
		 * 
		 *  [] : �� ���ڸ� ��Ÿ������ �Ҷ� ���, �� �ȿ� �����ִ� ���ڴ� ���� or ó��
		 *  
		 *     : �� �ȿ� ���ڱ����� �ϰ��� �Ҷ�, ����Ǿ��ִ� ���ڰ��̶�� - ó���� ������
		 *     
		 *    ���� ��� [A-Za-z] ���ĺ�, [��-�R] �ѱۿϼ�������
		 *    
		 *     : ^�� ���̸� ���ܸ� �ǹ��Ѵ�.
		 *  
		 *  ��� ������ ���� ��ߵǴ°� �ƴϰ�,
		 *  �̸� ������ �ִ� Ư�� �׷��� �ִ�.
		 *  
		 *  .  : (�ƹ�����) anychar
		 *  
		 * \\d : ��ġ�� ���� : ==>[0-9]
		 * \\D : ��ġ�� ���� ���� : ==>[^0-9]
		 * 
		 * \\w : ������ ���� :  ==> [A-Za-z_0-9] -�����(_)����
		 * \\W : ������ ���� ���� :  \\w ����
		 * 
		 * \\s : ������ ����
		 * \\S : ������ ���� ����
		 */
		String[] sample = "ȫ�浿,trump,arump, rump,trumt,te0505,Arump".split(",");
		for (int i = 0; i < sample.length; i++) {
			String s = sample[i];
			System.out.print("["+i+"] "+s+" : ");
			//System.out.println(s.matches("[at]rum[pt]")); // [a or t] / [p or t]
			//System.out.println(s.matches("[a-t]rum[pt]"));	// [a ~ t]
			//System.out.println(s.matches("[^a-p]rum[pt]")); // [not a ~ p]
			System.out.println(s.matches(".rum[pt]")); // . �ƹ����ڻ������ ���鵵����			
		}
		System.out.println("13".matches("\\d\\d"));
		System.out.println("loc_p5".matches("loc_[a-z]\\d")); 
		System.out.println("loc_p5".matches("loc_[a-z][0-9]")); // ==
		System.out.println("loc_pa".matches("loc_[a-z]\\D"));
		
				
	}
}
