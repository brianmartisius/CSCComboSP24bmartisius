import java.util.Scanner;

public class TicTacToe {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int index = 0;
		int moveCount = 0;
		String[][] board = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = String.valueOf(index);
				index++;
			}
		}

		int player = 1;

		while (checkWinner(board) == 0) {
			// create a board function
			createBoard(board);

			// create a move function
			move(player, board);
			player = player % 2 + 1;
			// check winner function
			//checkWinner();
			moveCount++;
			if(moveCount == 10) {
				break;
			}
				
		}
		createBoard(board);
		if(moveCount == 9 && checkWinner(board) == 0) {
			System.out.println("cat game");
		}else {System.out.println("Player " + checkWinner(board) + "wins!");
			
		}
		
		// loop calling the move function and check winner

	}

	private static int checkWinner(String[][] board) {
		String line = "";
		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0:
				line = board[0][0] + board[0][1] + board[0][2];
				break;
			case 1:
				line = board[1][0] + board[1][1] + board[1][2];
				break;
			case 2:
				line = board[2][0] + board[2][1] + board[2][2];
				break;
			case 3:
				line = board[0][0] + board[1][0] + board[2][0];
				break;
			case 4:
				line = board[0][1] + board[1][1] + board[2][1];
				break;
			case 5:
				line = board[0][2] + board[1][2] + board[2][2];
				break;
			case 6:
				line = board[0][0] + board[1][1] + board[2][2];
				break;
			case 7:
				line = board[0][2] + board[1][1] + board[2][0];
				break;
			}
			

		}
		if (line.equals("XXX")) {
			return 1;
		}
		if (line.equals("OOO")) {
			return 2;
		}
		return 0;

	}

	private static void move(int player, String[][] board) {
		int pick = -1;
		while ((pick < 1 || pick > 9) != board[(pick - 1) / 3][(pick - 1) % 3].equals(String.valueOf(pick))) {
			System.out.println("Please make your move, by entering a number that corresponds with your location.");
			pick = input.nextInt();
			// if(player == 1);

		}
		String piece = "o";
		if (player == 1)
			piece = "x";
		{
			board[(pick - 1) / 3][(pick - 1) % 3] = piece;
		}

	}

	private static void createBoard(String[][] board) {
		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("-----");
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("-----");
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		// System.out.println("-----");

	}

}
