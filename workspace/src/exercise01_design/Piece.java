/*
	Chess (8x8) �� �����ϴµ� �־ ��ü���� ������, �׽�Ʈ�� �غ���

	- Pawn / Bishop / Knight / Rock / Queen / King
	- �� ��ü���� �� ���� ���踦 �Ϸ��� �ϴµ�, �������� �κе鵵 �ְ�, ��ɵ鵵 ����
	�̰� ��ӱ����� �̿��ؼ� �����غ���.
*/

class Piece {
	/*
		������ 0,0 - ���� �Ʒ� 7.7 (�迭����- �Ŀ� ���ϰ�)
	*/
	int x;	// ���� x ��ǥ�� �����ų ����
	int y;  // ���� y ��ǥ�� �����ų ����
	boolean whiteFlag; // ������� �ƴ����� �����ų ����

	Piece(int x , int y , boolean whiteFlag ){
		this.x = x;
		this.y = y;
		this.whiteFlag = whiteFlag;
	}

	boolean checkMove(int dx, int dy){
		//�� ��ü�� x,y�� �������� �ش� ��ǥ�� �̵��������� Ȯ�����ִ� ���
		return false;
		//�̸� ������ �Ŀ� ��ӹ޾� ����Ҷ� Override �ؼ� �����
	}
	void confirmMove(int dx, int dy){
		this.x = dx;
		this.y = dy;
	}

	String shape(){
		return "��"; //�������̵��ؼ� ��, ���,�� ... ���� ����
	}

}
