package ch02_variable;
class Source02_VariableType {
	public static void main(String[] args) {
		/*
			��ġ
			- ���� : byte , short , int(��) , long
			- �Ǽ� : float , double(��)
			���� : char
			���ڿ� : String
			�� : boolean

			��ġ�迭�� Ÿ����ü�� �������ε�, �޸� ȿ������ ���õǾ� �ִ�.
			
			# ����� ��

			Ÿ�� �̸�;
		*/
		int v1;
		double v2;
		char v3;
		String v4; //�빮��
		boolean v5;
		//====================================================================
		v1 = 13;
		v2 = 43.222;
		v3 = '��';
		v4 = "���ڿ�";
		v5 = true;
		//====================================================================
		// ������ ���� �ִٰ� ġ����, �ռ� ���캻 ������ �� �����ϴ�.
		System.out.println(v1);
		System.out.println(v1 << 1);
		System.out.println(v1 / 5); //��
		System.out.println(v4 +"�̴�");
		System.out.println(v5 ? "Accessed":"Denied");

	}
}
