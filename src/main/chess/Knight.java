package chess;

public class Knight extends Piece{
//	private PieceColour colour;
//	private String symbol;

 	public Knight(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.setSymbol("♘");
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.setSymbol("♞");
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
		if (Board.hasPiece(i1, j1) && Board.getPiece(i1, j1).getColour() == this.colour)
			return false;
		
		if (i1 == i0 + 1 || i1 == i0 - 1) {
			if (j1 == j0 + 2 || j1 == j0 - 2)
				return true;
		}
		
		if (j1 == j0 + 1 || j1 == j0 - 1) {
			if (i1 == i0 + 2 || i1 == i0 - 2)
				return true;
		}
		return false;
	}
}
