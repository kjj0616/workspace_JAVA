/*
	extends �� �̿��� ����� ����, �˾Ƶ� �͵�

	1. extends �� ��� (����, �θ�, ����, ���� Ÿ��)�� ������ �ǰ�,
	 ����� extends�� ����صξ���߸� �����ϴ�.
		final - extends �Ұ����ϴ�

	2. extends �� ���� ����Ǵ� ��ü�� ����(�θ�)�� ����ҿ� access ������ �ʴ´�.
	 access �ܰ迡 ���� ������ �ȵǴ� �͵��� �������� �ִ�.

	3. super Ű���带 �̿��ؼ�, 

*/
package design;

// public final class Box {	// --> extends �Ұ���
public class Box {		
	int data;
	protected boolean flag;
	public String rate;
	
	/*
		�⺻�����ھ���
		�Ű������� �� �����ڸ� �����Ѵٸ�
		��ӹ��� ��ü�� �����Ҷ� ������ �߻���		
	*/

	public Box(){ //�⺻������ 
		System.out.println("box instance created!");
								//��ü==�ν��Ͻ� (new�ؼ� ���� ��ü��)
	}

	public String inform(){
		return data+", "+flag+", "+rate;
	}
/*
protected ���� ������.

protected�� ��Ӱ� ���õ� ���� ������.
���� ��Ű�������� ���� ������ ������, �ٸ� ��Ű�������� �ڽ� Ŭ������ ������ �����.

�ٸ� ��Ű���� �ڽ� Ŭ�������� �θ� Ŭ������ �����ڸ� ȣ���� ��, 
new�� ���� ȣ�� �� ���� ����, super()�� �����ڸ� ȣ�� �� �� �ִ�.

* �θ� Ŭ������ ��Ű��.Ŭ������ import�ؾ� ��.
*/
}
