class Knight extends Piece {
	Knight(int x, int y, boolean flag){
		super(x,y,flag);
	}
	String shape(){
		return "��";
	}
	boolean checkMove(int dx, int dy){
		if(this.x-2 == dx || this.x+2==dx) {
			if( this.y-1==dy || this.y+1==dy) {
				return true;
			}
		}else if(this.x-1==dx ||this.x+1==dx) {
			if( this.y-2==dy || this.y+2==dy) {
				return true;
			}
		}
		return false;
		//return �� break�� ��Ȱ�� �����Ѵ�. !!!

		/*
			x��=2, y��=1, or x��=1, y��=2
			
			int gx = this.x -dx;
			if(gx <0)
				gx *= -1;
			int gy = this.y > dy ? this.y - dy : dy - this.y;

			if(gx == 2 && gy==1 || gx==1 && gy==2)		//��������ϸ� ��ȣ�� �����
				return true;
			else
				return false;
		*/
	}
}

