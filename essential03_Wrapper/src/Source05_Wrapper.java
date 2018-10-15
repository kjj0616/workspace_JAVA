import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Source05_Wrapper {
	public static void main(String[] args) {
		// Boolean
		String s1 = Boolean.toString(true); // String.valueOf(ture);
		// Byte , Short ...
		
		// Integer
		 	// - Integer -> String
		String s2 = Integer.toHexString(255); // int -> 16�� ���� string ��ȯ
		System.out.println(s2); 
		String s3 = Integer.toBinaryString(10); // int -> 2�� ���� string ��ȯ
		System.out.println(s3);
		String s4 = Integer.toOctalString(16); // int -> 8�� ���� string ��ȯ
		System.out.println(s4);
		
		int[] d = new int[] {2, 8, 10, 16};
		for (int i = 0; i < d.length; i++) {
			System.out.println("16 �� "+d[i]+"�� ���ڿ� "+ Integer.toString(16, d[i]));
		}
		 	// - String -> Int
		int n = Integer.parseInt("1a", 16); //
		System.out.println(n);
		
		// Long
		 
		// Float, Double
		double r = 10.0/0.0;
		System.out.println(r); // Infinity
		System.out.println(Double.isFinite(r));
		System.out.println(Double.isInfinite(r));
		double rr = 0.0/0.0;
		System.out.println(rr); // NaN
		double rrr = Math.sqrt(-1);
		System.out.println(rrr); //NaN
		System.out.println(Double.isNaN(rrr));
		/*
		��ǻ�� ���꿡�� NaN(Not a Number)�� ���� �������� �߸��� �Է��� �޾����� ��Ÿ���� ��ȣ�̴�.
		Ư�� �ε� �Ҽ��� ���꿡�� ����Ѵ�. ���� ��, ��κ��� �ε� �Ҽ��� ��ġ�� ������ ���ؼ�
		�������� ���Ϸ��� ���꿡 ���ؼ� �̰��� �Ұ���(invalid)�ϴٴ� �޽����� �Բ� NaN ���� ��ȯ�Ѵ�.
		*/
		
		
		// Character
		String str = "Jdk 1.8.181";
		char[] ar = str.toCharArray();
		for (int i = 0; i < ar.length; i++) {
			char t = ar[i];
			System.out.println(t + " : "+ Character.isWhitespace(t)); // ��������? boolean
			System.out.println(t + " : "+ Character.toUpperCase(t)); // �빮�ڷ�(���ĺ���)
			System.out.println(t + " : "+ Character.toLowerCase(t)); // �ҹ��ڷ�(���ĺ���)
			System.out.println(t + " : "+ Character.isDigit(t)); // ��ġ�������� boolean
		}
		
		// ������ ���캼 ��ü�� �����ؼ�, ��� ����� ���� �ܿ� �ʿ�� ����.
		// ��ɵ鿡 ���� �� ������ API ������ Ȯ���ؾ� �ȴ�.
		// java.oracle.com - Essential link - Java APIs - verã�Ƽ� �˻�
	}
}
