import sample.Coord;

/*
 * �迭 ��ü?
 * 	-��(������,��ü��) ������(����)��
 *   �Ѳ����� �����ų�� �ְ� ����� ��ü
 *       
 * 	-��������� �Ϲ� ��ü�������̶��� ���� �ٸ���.
 * 
 *  -new ����������[����];
 */
public class Source05_Array {
	public static void main(String[] args) {
		System.out.println(new int[5]);
		// ������ ��ü���� ��¸� �ϰ� ��򰡿� ������ ���߱⿡
		// �� �迭��ü�� �ٽ� ������ �ȵ�
		
		System.out.println(new Sword[3]);
		// �� �迭��ü�� �����ϱ� ���ؼ��� ��ü���� �޾ƾ� �Ǵµ�, Ÿ�Լ�����
		// Ÿ�Լ����� ����������[] ����;
		
		int[] a;
		Sword[] b;
		boolean[] f;
		Coord[] c; 		// ctrl + shift + O : smart import
		
		a = new int[3];
		int [] aa = new int[5];
		Object o = aa; // Object �ֻ�����ü
		// �迭��ü�� ���ٵǴ� ������ length ��� �̸��� ���� int�� ������ �ִ�.
		System.out.println(a.length);	// ��ĭ¥�� ��������� length�� �������ִ�.		
		System.out.println(aa.length);
		
		// �迭��ü�� ������ �ִ� ���� ������ ��������� ����Ϸ���,
		// ����[ĭ��ȣ] : �ε���(ĭ��ȣ) ������ 0������ ���ʴ�� �ٿ��� ����
		a[0] = 4;
		a[1] = 9;
		a[2] = 30;
		
		// ĭ��ȣ�� �߸������Ǽ� ���ٵǸ� ���ܹ߻�(���α׷��� �� ��� ���� �߸鼭 ����)
		// a[5] = 2;
		
		Sword[] sw = new Sword[2];
		System.out.println("sw.length = "+sw.length);
		sw[0] = new Sword();
		
		Sword s = new Sword();
		sw[1] = s;
		
		
	}
}
