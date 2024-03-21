import java.util.Scanner;
public class Triangles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String another = "y";
		while (another.equals("y")) {
			System.out.println("Enter the fill character");
			String chr = input.next();
			System.out.println("How many rows?");
			int rows = input.nextInt();
			while (rows > 50 || rows < 1) {
				System.out.println("Rows must be between 1 and 50. How many rows?");
				rows = input.nextInt();
			}
			for (int i = 1; i <= rows; i++) {
				for (int j = 1; j <= rows; j++) {
					System.out.print("");
				}
				for (int j = rows; j >= i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(chr + " ");
				}
				System.out.println();

			}
			System.out.println("Another triangle?");
			another = input.next();
		}
	}
}

