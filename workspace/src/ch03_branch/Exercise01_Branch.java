package ch03_branch;
class Excersice01_Branch {
	public static void main(String[] args) 	{
		/*
			����ڷκ��� ���嵥���Ϳ� ü�ߵ����͸� Ȯ���ؼ�
			�̰� ���� ��ü ���������� �����
			�� ��� ����� ���� 3���� branch�� ����
			����ڿ��� �ٸ� ����� �Ͼ�� �ְ� ������.
		*/
		System.out.println("[BIO]�ǰ����� ���");
		System.out.print("[BIO]����(����:m) �Է�: ");
		double m = Double.valueOf(System.console().readLine());
		System.out.print("[BIO]ü��(����:kg) �Է�: ");
		double kg = Double.valueOf(System.console().readLine());
		//��ü�������� �� �����ü��/���������� ���� ������ ��
		//�� ������� ��� - main
		double t = kg/(m*m);
		System.out.println("[BIO]��ü�������� : "+ t);

		//��ü�� �̸� 18.5  ǥ��ü�� �̸� 23.0 ��ü��  �� 3���� �������� branch�� ����
		//��ü�� ó���ϴ� branch ������ ǥ��ü�߿� ���� ���� �ּ� ü���� ������ؼ� ���
		//??/(*1.75*1.75) =18.5
		if(t<18.5){
			System.out.println("[BIO]��ü��");
			System.out.println("[BIO]ǥ��ü�߿� ���� ���� �ּ� ü�� : "+ 18.5*m*m +"kg");

		//��ü�� ó���ϴ� branch ������ ǥ��ü�߿� ���� ���� �ִ� ü���� ������ؼ� ���
		//??/(*1.75*1.75) =23.0
		}else if(t>23.0) {		// 18.5<bmi<23.0 �̷� ����� �Ұ�
			System.out.println("[BIO]��ü��");
			System.out.println("[BIO]ǥ��ü�߿� ���� ���� �ִ� ü�� : "+ 23.0*m*m +"kg");

		//ǥ��ü�� ó���ϴ� branch ������ 
		}else{
			System.out.println("[BIO]ǥ��ü��");
		}
		//�ǰ��� ��ü�� �ǰ��� ������ ���� ��� main branch �շ������� ���
		System.out.println("[BIO]�ǰ��� ��ü�� �ǰ��� ������ ����.");
		System.out.println("[BIO]terminate");
	}	
}
/*
	�ڵ� ��ý�Ʈ�� �۵��ؼ� , ���ϴ� ������ �ڵ尡 �� �ۼ��� �ȵȴٸ�
	���� - > �⺻���� >> ���� -���� �� �������� -> �ڹ� --> �ڵ��ϼ� uncheak

*/