package chess;

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
}
