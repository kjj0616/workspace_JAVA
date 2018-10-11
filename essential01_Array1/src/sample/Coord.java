package sample;
/*
 * 2���� ������ ��ǥ���� ��ü
 */
public class Coord {
	int x;
	int y;
	public Coord(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	@Override //�������̵� Ȯ��
	public String toString(){
		return "[x="+x+",y="+y+"]";
	}
	
	//#####���� ���Ǵ� ����#########################
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Coord) {
			Coord other = (Coord)obj;
			return this.x == other.x && y ==other.y;
		}else {
			return false;
		}
	}	
	//################################################
	public boolean isDuplicated(Coord other) {
		if (this.x == other.x && y ==other.y)
			return true;
		else
			return false;
	}
	//�̰� ���� �ٷ� equals�� �����ϸ� Object Ÿ������ �޴µ�
	//����Ÿ������ �����ϹǷ� x,y ������ �ȵ�
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize");
	}
}	//�������÷��� ���ư��� ����.
