import java.util.Scanner;

public class CharacterSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String another = "y";
		while (another.equals("y")) {
			System.out.println("How many rows?");
			int rows = input.nextInt();
			while (rows > 50 || rows < 1) {
				System.out.println("Rows must be between 1 and 50. How many rows?");
				rows = input.nextInt();
			}
			System.out.println("How many colums?");
			int colums = input.nextInt();
			while (colums > 50 || rows < 1) {
				System.out.println("Colums must be between 1 and 50. How many colums?");
				colums = input.nextInt();
			}
			createBox(rows, colums);
			System.out.println("Another box? ");
			another = input.next();

		}
	}

	public static void createBox(int rows, int colums) {
		for (int i = 0; i < rows; i++) {
			if (i == 0 || i == rows - 1) {
				for (int j = 0; j < colums; j++) {
					System.out.print("^");
				}
			}
			else {	
				System.out.print("^");
				for (int j = 0; j < colums - 2; j++) {
					System.out.print("^");
					
				}
				System.out.print("^");
				
			}
			System.out.println();

		}

	}

}
