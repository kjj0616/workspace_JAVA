class Source08_VariableOperation {
	public static void main(String[] args) {
		/*
			String �� �����ϴ� �������� = �ܿ� ����Ҽ� �ִ� �۾��� �ִµ�
			 += �۾��̰�, �̰� ���� ���� ���ڿ��� �ڿ� �����͸� ������ ���ڿ��� ���������.
		*/
		int hour = 13;
		String str = "�Է��Ͻ� �ð���";
		str += hour>=12 ? "����" : "����"; // str = str + ??;
		str += "�Դϴ�.";
		str += 13;
		str += 1;
		str += 2; //���� ������ �ִ� ���ڿ��� �ش� ���ڿ� �ڿ� ���ؼ� ����

		System.out.println(str);

		String rev = "����..";
		//rev = "����ʹ�.." +rev;
		rev = rev + "����ʹ�.." ;
		//rev = "��ġ����.." +rev;
		rev = rev +"��ġ����.." ;
		System.out.println(rev); // �տ��� �߰��ؾ��� ���
		
	}
}
