package chess;

public class Pawn extends Piece {
	private boolean firstMove;
	
	public Pawn(boolean colour, Coordinate startPosition) {
		super(colour, startPosition);
		this.firstMove = true;
	}
	
	public Coordinate[] getMoves() {
		if (this.firstMove) {
			return new Coordinate[] {new Coordinate(1, 2)};
		} else {
			return new Coordinate[] {new Coordinate(1, 2)};
		}
	}
}
