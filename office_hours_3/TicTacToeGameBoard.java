package office_hours_3;

public class TicTacToeGameBoard {
	
	/*
	Create a class and name it PrintTicTacToeGameBoard

	Using 2 dimensional char array print tic tac toe game board in the consol like below:
	  | |
	 -+-+-
	  | |
	 -+-+-
	  | | 
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
		
		for(char[] row: gameBoard) {
			for(char column: row) {
				System.out.print(column);
			}
			System.out.println();
		}
	}

}
