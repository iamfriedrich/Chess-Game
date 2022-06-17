package chess;

public class Rook extends Piece{
//	private PieceColour colour;
//	private String symbol;

	public Rook(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.setSymbol("♖");
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.setSymbol("♜");
		}
	}

//	public String getSymbol(){
//		return symbol;
//	}
//	public PieceColour getColour(){
//		return colour;
//	}

	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if (Board.hasPiece(i1, j1) && Board.getPiece(i1, j1).getColour() == this.colour)
			return false;
		
		if (i1 == i0) {
			int dir = j1 > j0 ? 1 : -1;
			int j = j0 + dir;
			while (j != j1) {
				if (Board.hasPiece(i0, j))
					return false;
				j += dir;
			}
		}
		else if (j1 == j0) {
			int dir = i1 > i0 ? 1 : -1;
			int i = i0 + dir;
			while (i != i1) {
				if (Board.hasPiece(i, j0))
					return false;
				i += dir;
			}
		}
		else
			return false;
		return true;
	}
}
