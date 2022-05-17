package office_hours_6;

public class PrintTicTacToeGameBoard {
	
	/*
	Create a class and name it PrintTicTacToeGameBoard
	write a method and name it ticTacToeGameBoard, which accepts 2 dimensional char array (char [][] gameBoard) and prints gameBoard.
	submit your code as usual.

	*/
	
	public static void main(String[] args) {
		char[][] gameBoard = {
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}
		};
		
		printGameBoard(gameBoard);
	}
	
	public static void printGameBoard(char[][] gameBoard) {
		for(char[] row: gameBoard) {
			for(char column: row) {
				System.out.print(column);
			}
			System.out.println();
		}
	}

}
