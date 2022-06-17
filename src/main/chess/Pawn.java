package chess;

public class Pawn extends Piece{
//	private PieceColour colour;
//	private String symbol;

	public Pawn(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.setSymbol("♙");
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.setSymbol("♟");
		}
	}

//	public String getSymbol(){
//		return symbol;
//	}
//	public PieceColour getColour(){
//		return colour;
//	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if (j1 == j0) {
			if (Board.hasPiece(i1, j1))
				return false;
			if (this.colour == PieceColour.BLACK) {
				boolean isFirstMove = i0 == 1;
				if (i1 == i0 + 1)
					return true;
				if (isFirstMove && i1 == i0 + 2)
					return true;
				}
			if (this.colour == PieceColour.WHITE) {
				boolean isFirstMove = i0 == 6;
				if (i1 == i0 - 1)
					return true;
				if (isFirstMove && i1 == i0 - 2)
					return true;
			}
		}
		else if (j0 == j1 + 1 || j0 == j1 - 1) {
			if ((this.colour == PieceColour.BLACK && i1 == i0 + 1) || (this.colour == PieceColour.WHITE && i1 == i0 - 1)) {
				if (Board.hasPiece(i1, j1) && Board.getPiece(i1, j1).getColour() != this.colour)
					return true;
			}
		}
		return false;
	}
}
