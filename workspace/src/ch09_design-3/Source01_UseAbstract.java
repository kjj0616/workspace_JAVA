/*
	exer01_���� chess game�� ����µ� �־ �ʿ��� ��ü���� �����غ��Ҵµ�,

	Piece�� ��Ȱ..? �̰� �����ٸ�..?
	������ �������� ����� ��ü���� �����ϱ� ���ؼ�, �⺻Ʋ�� ���� �뵵�� ������ ��
	(Piece ��ü�� ���� �������Ѽ� ����ϰڴ� �̷� �� �ƴϾ���)

	�̷� �뵵�϶� �ڹٿ����� �߻�Ŭ���� (abstract) ������ ���踦 �Ҽ� �ְ� �صξ���.
	�� Ÿ������ ������������ �ش� Ÿ���� ��ü�� ������ ������ �ǰ�,
	���� ����� ��ü���ʿ��� �������̵��Ų�� ȣ���ϱ� ���ؼ� �����ξ���
	���ǹ��� �Լ�������� abstract ó���صѼ� �ִ�.


*/
abstract class Piece {
	int x;
	int y;
	Piece(){

	}
	Piece(int x, int y){
		this.x = x;
		this.y = y;
	}
	void confirm(int dx, int dy){
		x = dx;
		y = dy;
	}
	/*
	boolean check(int dx, int dy){
		return true;
	}
	*/
	abstract boolean check(int dx, int dy);
	// ���� �ʿ��Ѱ͵� -> abstract ó���ϰ� �����ϰ� pass
	// class ��ü�� abstract �̾�߸� ���� �޼ҵ带 abstract ó���Ҽ� �ִ�.
	// Ʋ��� �뵵�� ���ÿ� ������ ������
	abstract String shape();
}
//==================================================================================

class Rook extends Piece {
	String shape(){
		return "��";
	}
	boolean check(int dx, int dy){
		return dx == dy;
	}
}
//==================================================================================
/*
	�Ϲ� extends ���� �ٸ��� abstract type�� extends�� �ϰԵǸ�,

	�θ�Ŭ���� �ʿ��� abstract ó���ص� ��ɵ���,
	�ڽ�Ŭ���� ��ü���� ������ �۵��ɼ� �ְ� �����صξ�߸� 

	�������� �ǰ�, ��ü���谡 �ϼ��ȴ�.
*/

class Queen extends Piece{
	String shape(){
		return "r";
	}
	boolean check(int dx, int dy){ 
		return dx == dy;
	}
	//������ abstract ���� �޼ҵ�� -> shape, ckeck ���� �ʼ�����
}

//==================================================================================
class Source01_UseAbstract {
	public static void main(String[] args)	{
		// abstract ó���ص� Ÿ���� ��ü���� ������ �Ұ����ϴ�. cannot be instantiated
		// new Piece(); --> Error
		// Ÿ�����ν� ���ǹ��ϴٴ� ���� �ƴϴ�.

		Piece p = new Rook(); // ��ü ��� �ϴµ� ������ ����
		
		System.out.println(p.shape());
		System.out.println(p.check(3,3));
	}
}
