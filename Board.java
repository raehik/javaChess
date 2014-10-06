package chess;

public class Board {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BOLD = "\u001B[1m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	private int boardLength = 8;
	private Player players[];
	//private Piece[][] board;
	private Piece[][] board;
	
	private void initialiseBoard() {
		this.board = new Piece[this.boardLength][this.boardLength];
		for (int i = 0; i < this.boardLength; i++) {
			for (int j = 0; j < this.boardLength; j++) {
				if (i == 0) {
					this.board[i][j] = new Pawn(true, new Coordinate(i, j));
				}

				if (i == 1) {
					this.board[i][j] = new Pawn(true, new Coordinate(i, j));
				}
				
				if (i == 6) {
					this.board[i][j] = new Pawn(false, new Coordinate(i, j));
				}

				if (i == 7) {
					this.board[i][j] = new Pawn(false, new Coordinate(i, j));
				}
			}
		}
	}

	public Board() {
		this.initialiseBoard();
	}
	
	public boolean removePiece(Coordinate position) {
		return false;
	}
	
	public void printBoard() {
		for (int i = this.board.length - 1; i > -1; i--) {
			Piece[] row = this.board[i];
			System.out.print(ANSI_RED + i + " " + ANSI_RESET);
			for (Piece piece : row) {
				try {
					if (piece.colour()) {
						System.out.print(ANSI_BOLD + ANSI_WHITE + "P" + ANSI_RESET);
					} else {
						System.out.print(ANSI_BOLD + ANSI_BLACK + "P" + ANSI_RESET);
					}
				} catch (NullPointerException e) {
					System.out.print("-");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println(ANSI_RED + "  a b c d e f g h" + ANSI_RESET );
	}
	
	public static void main(String[] args) {
		Board board = new Board();
		board.printBoard();
	}
}
