/*
	Extension (Ȯ��/���)
	: ��ü�� �����Ҷ�, �̹� ������� ��ü�� �̿��ؼ� �߰� ���踦�� �ְ�
	 Ȯ���̶�°��� �����ϰ� �ִ�.

	Extension�� ����?
	 1. �������� ���� - (�������� ->Ȯ����)
	 2. �����ؾߵ� ��ü�� ������ �������� �����ؼ� �ϳ��� �����ΰ�,
		�������� �� Ȯ����� �߰��κи� ���������ν� ȿ�������� ���谡 �����ϴ�.
	 3. 
*/
class Android extends Robot {
	int happiness;

	Android(String n, int t, int h){
		this.name = n;
		type = t;
		happiness = h;
	}

	boolean doCleaning(){
		if(this.happiness>=10){
			happiness -=10;
			return true;
		}else {
			return false;
		}
	}

	String tell(){
		if (happiness >=30){
			String m = greet();
			return m;
		}else{
			return ".....�Դϴ�.";
		}
	}
}
