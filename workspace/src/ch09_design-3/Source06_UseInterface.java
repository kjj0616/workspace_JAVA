/*
	��â�� Interface�� abstract ó���� �Լ��鸸 ���谡 ��������
	������ default ������ ���ټ��� �ִ�.
	
	���� class�ʹ� �ݴ��
	Interface ������ default������ abstract�̹Ƿ�
	default�� �ٿ��ָ� �⺻��� ������ �����ϴ�.

	�������̽��� extends�� �ƴϹǷ� super�� �ٷ� ����� �Ұ��ϴ�.
	���� ��ü�̸����� ȣ���Ѵ�.
*/

interface ItemShop {
	default void open(){
		System.out.println("ItemShop.open()");
	}
	void close();
}

class SwordShop implements ItemShop{
	public void open(){
		ItemShop.super.open();
		System.out.println("SwordShop!!!");
	}
	public void close(){

	}
}

class Source06_UseInterface {
	public static void main(String[] args)	{
		ItemShop is = new SwordShop();
			is.open();

	}
}
