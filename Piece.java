package javaChess;

public class Piece {
	private boolean colour;
	protected Coordinate pos;
	
	public Piece(boolean colour, Coordinate startPosition) {
		this.colour = colour;
		this.pos = startPosition;
	}

	private boolean takePiece(Coordinate position) {
		return false;
	}
	
	public Coordinate[] getMoves() {
		// should be overridden: return a 0-length array
		return new Coordinate[0];
	}
	
	public boolean moveTo(Coordinate position) {
		return false;
	}
	
	public boolean colour() {
		return this.colour;
	}
	//TODO merge these two functions, add in limiter for range
	public boolean isStraightMove(Coordinate position){
		//If the move is straight, only one of the coordinates will change
		int[] currentPos = this.pos.value();
		int[] nextPos = position.value();
		if(currentPos[0]==nextPos[0]||currentPos[1]==nextPos[1]){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isDiagonalMove(Coordinate position){
		//If the difference between the coordinates is constant, the move is diagonal
		int[] currentPos = this.pos.value();
		int[] nextPos = position.value();
		int currentPosDiff = currentPos[0] - currentPos[1];
		int nextPosDiff = nextPos[0] - nextPos[1];
		if(currentPosDiff==nextPosDiff){
			return true;
		}else{
			return false;
		}
	}
}
