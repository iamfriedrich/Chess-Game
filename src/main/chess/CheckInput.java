package chess;

public class CheckInput {
	
	public static boolean checkCoordinateValidity(String input){
		if (input.length() != 2)
			return false;
		char row = input.charAt(0);
		if (row < '1' || row > '8')
			return false;
		
		char col = input.charAt(1);
		if (col < 'a' || col > 'h')
			return false;
		
		return true;
	}
}
