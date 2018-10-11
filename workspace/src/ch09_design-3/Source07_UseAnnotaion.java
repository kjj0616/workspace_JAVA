/*
	Annotation ����
		-�� ������̼��� ���α׷���ü���� ������ ������, �̰ſ� ������� ȯ���ʿ� ������
		��ĥ �뵵�� �����ϴ� ��찡 ����.
		
		-jvm , ��Ÿ������ ������ ���� , �����뵵, �����, ����....
		
		-.class���Ϸ� ������(�����ϵ�)

		-java ���ܰ��� �н��� �ʿ���, xml ���...

		-�����Ϸ��� �ν��ϴ� �ܰ�
*/
@interface Test{

}

//===============================================================================
class ShieldShop implements ItemShop{
	@Override
	public void closed(){
		System.out.println("ShieldShop.close()");
	}
}


//===============================================================================
class Source07_UseAnnotaion {
	public static void main(String[] args)	{
		System.out.println("Hello World");
		ItemShop i = new ShieldShop();
		i.close();

	}
}
/*
---------- ������ ----------
Source07_UseAnnotaion.java:14: error: ShieldShop is not abstract and does not override abstract method close() in ItemShop
class ShieldShop implements ItemShop{
^
Source07_UseAnnotaion.java:15: error: method does not override or implement a method from a supertype
	@Override
	^
2 errors

��� �Ϸ� (0�� ���) - ���� ����
*/

/*

	��������� Editplus �� �ڹٶ�� �� ������ �츮�� � �͵��� �Ҽ� �ְ�,
	�����Ҽ� �ִ� �͵鿣 ��͵��� �ִ��� ���캸�Ҵ�.

	�����δ� �츮�� �����Ұ͵� ����, �⺻������ �����Ǵ� �ֵ��� ��� �۾��� �ؾߵǴµ�,
	Editplus�� �׷� �۾��� �ϱ⿣ ���� ���� �ƴϴ�.

	tool ������ �Ҳ���, �ڹ� �����ڰ� �ٷ�ߵǴ� �������߿� �ʼ��� Eclipse �� �۾��� �غ���.

	eclipse.org 

*/