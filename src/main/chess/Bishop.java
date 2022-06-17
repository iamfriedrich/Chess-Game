package chess;

public class Bishop extends Piece{
//	private PieceColour colour;
//	private String symbol;

	public Bishop(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.setSymbol("♗");
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.setSymbol("♝");
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
		
		int delta_i = i1 - i0;
		int delta_j = j1 - j0;
		if (delta_i != delta_j && delta_i != -delta_j)
			return false;
		int dir_i = delta_i > 0 ? 1 : -1;
		int dir_j = delta_j > 0 ? 1 : -1;
		int i = i0 + dir_i;
		int j = j0 + dir_j;
		while (i != i1) {
			if (Board.hasPiece(i, j))
				return false;
			i += dir_i;
			j += dir_j;
		}
		return true;
	}
}
