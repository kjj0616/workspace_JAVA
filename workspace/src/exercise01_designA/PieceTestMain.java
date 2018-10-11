public class PieceTestMain {
	public static void main(String[] args)	{
		Piece p = new Piece(3,3,true);
		PieceTestEngine pte = new PieceTestEngine(p);
		
		pte.execute();

		Piece pp = new Rook(3,4,false);
		pte.changePiece(pp);
		pte.execute();
		// ����
		King k = new King(5,4,false);
		pte.changePiece(k);
		pte.execute();
		
		Piece p2 = new Bishop(3,4,true);
		pte.changePiece(p2);
		pte.execute();
		
		Piece p3 = new Queen(3,4,true);
		pte.changePiece(p3);
		pte.execute();
		
		Piece p4 = new Knight(3,4,true);
		pte.changePiece(p4);
		pte.execute();
		
		Piece dpawn = new Pawn(3,4,true);
		pte.changePiece(dpawn);
		pte.execute();
		
		Piece wpawn1 = new Pawn(3,6,true);
		pte.changePiece(wpawn1);
		pte.execute();
		
		Piece wpawn2 = new Pawn(3,6,false);
		pte.changePiece(wpawn2);
		pte.execute();
		
		Piece bpawn1 = new Pawn(3,1,false);
		pte.changePiece(bpawn1);
		pte.execute();
		
		Piece bpawn2 = new Pawn(3,1,true);
		pte.changePiece(bpawn2);
		pte.execute();
		
		/*
			King ��ü : cheakMove , �̵���Ű���� �ϴ� ��ǥ�� ������ǥ�ϰ� ��������
						x���� 1���ϰ�, y���� 1���ϱ⸸ �ϸ� ��.

			Bishop ��ü : x���ϰ� y���� ������ �ȴ�.

			Queen ��ü : Rock�̶� Bishop�� ���� �� ���´�.

			Knight ��ü : ~~ ���� �˾Ƽ� �غ���
						  �̵������� ���� x��, y���� �����غ��� �ȴ�.

			Pawn ��ü : ���� ������
						������ ����� ���θ� ����, �������� �Ʒ��θ� ����.
						�⺻�� 1ĭ��������, ��ŸƮ������ �ִ� ��쿡 ���ؼ��� 2ĭ�� �̵������ϴ�.
		*/

		/*
		(0,0)(1,0)(2,0)(3,0)(4,0)(5,0)(6,0)(7,0)

		(0,1)(1,1)(2,1)(3,1)(4,1)(5,1)(6,1)(7,1)

		(0,2)(1,2)(2,2)(3,2)(4,2)(5,2)(6,2)(7,2)

		(0,3)(1,3)(2,3)(3,3)(4,3)(5,3)(6,3)(7,3)

		(0,4)(1,4)(2,4)(3,4)(4,4)(5,4)(6,4)(7,4)

		(0,5)(1,5)(2,5)(3,5)(4,5)(5,5)(6,5)(7,5)

		(0,6)(1,6)(2,6)(3,6)(4,6)(5,6)(6,6)(7,6)

		(0,7)(1,7)(2,7)(3,7)(4,7)(5,7)(6,7)(7,7)	 
		
		*/
		for(int y=0;y<8;y++){
			for(int x=0;x<8;x++){
				System.out.print("("+x+","+y+")");
			}
			System.out.println("");
		}	
	}
}
