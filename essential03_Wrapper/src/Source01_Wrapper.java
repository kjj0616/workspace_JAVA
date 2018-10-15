/*
 *  Wrapper ��ü��
 *  	�⺻�����͸� ��üȭ��Ű�� ���ؼ� ������ �͵��̴�.
 *  	�⺻������ --> ��ü
 */
public class Source01_Wrapper {
	public static void main(String[] args) {
		// �⺻������
		// (��ü�� ������ : true,false/����/�Ǽ�/���� �����͸� �ǹ��Ѵ�)
		
		boolean b = true;
		Boolean wb1 = new Boolean(b);	// Wrap (�����ÿ��� ����)
		Boolean wb2 = new Boolean(b);	// �빮�� ����
		System.out.println(wb1 + " / "+wb2);
		// Wrapper ��ü���� ����ϸ� toString()�� ���� �������ִ� �����Ͱ� ������.
		System.out.println(wb1==wb2);
		
		boolean d1 = wb1.booleanValue(); // UnWrap
		boolean d2 = wb2.booleanValue(); // UnWrap
		System.out.println(d1==d2);
		/*
		 * boolean : Boolean(boolean)	, boolean booleanValue()
		 * byte : Byte(byte)	, 	byte byteValue()
		 * short 		: shortValue()
		 * Integer (int) : intValue()
		 * Long (long)	: longValue()
		 * Float (float) : floatValue()
		 * Double (double) : doubleValue()
		 * Character (char) : charValue()
		 */
		

	}
}
