

import design.Box;
	// box�� public�� �ƴϸ� import�� �Ұ��� / final �̸� �Ұ���
class Container extends Box {
	String str;

	Container(){
//		data = 3;	
		// default access ���� ������, extends�� �ɰ� �����ϱ� ������ ��������� �Ұ�
		
		flag = true;
		// protected�� extends �ɰ� ����Ǵ� ��ü���, access�� ����� �ȴ�.
		
		str = "extendsion";
		
		rate = "0.25";
		// public�� ���� Ÿ ��Ű�������� ������ ���Ǵ� access �ܰ�
		System.out.println("contanier instance created");

	}





}
