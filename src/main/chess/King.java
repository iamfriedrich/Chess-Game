package chess;

public class King extends Piece{
//	private PieceColour colour;
//	private String symbol;

	public King(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.setSymbol("♔");
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.setSymbol("♚");
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
		
		if (i1 > i0 + 1 || i1 < i0 - 1)
			return false;
		if (j1 > j0 + 1 || j1 < j0 - 1)
			return false;
		
		return true;
	}
}
