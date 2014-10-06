package javaChess;

public class Coordinate {
	private int x;
	private int y;
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int[] value() {
		return new int[] {x, y};
	}
}
