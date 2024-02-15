import java.util.Scanner;

public class Bottles {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of bottles to start with:");
		int bottles = input.nextInt();

		bottlesOfBeer(bottles);

	}

	private static void bottlesOfBeer(int bottles) {
		for (int i = bottles; i >= 0; i--) {

			if (i > 1) {
				System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
				System.out.println("Take one down and pass it around, " + i + " bottle of beer on the wall");

			} else if (i == 0) {
				System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
				System.out.println("Go to the store and buy some more, 5 bottles of beer on the wall.");

			} else {
				System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
				System.out.println("Take one down and pass it around, " + i + " bottles of beer on the wall");
			}
		}

	}

}
