import java.util.Scanner;

public class Firehouse {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the weight in grams");
		double grams = input.nextDouble();
		System.out.println("Enter integers for triangle lengths to find hypotenuse");
		double numa = input.nextDouble();
		double numb = input.nextDouble();

		double micrograms = getMicrograms(grams);
		double kilograms = getKilograms(grams);
		double pounds = getPounds(grams);
		double hyp = getHyp(numa, numb);
		System.out.println("The weight in micrograms is " + micrograms);
		System.out.println("The weight in kilogrms is " + kilograms);
		System.out.println("The weight in pounds is " + pounds);
		System.out.println("The hyp is " + hyp);

		// private static double getMicrograms(double grams) {
		// double micrograms = grams / 1000;
		// return micrograms;

	}

	private static double getHyp(double numa, double numb) {
		double hyp = Math.sqrt(numa * numa + numb * numb);
		return hyp;
	}

	private static double getPounds(double grams) {
		double pounds = grams / 0.00220462;
		return pounds;
	}

	private static double getKilograms(double grams) {
		double kilograms = grams / 1000;
		return kilograms;
	}

	private static double getMicrograms(double grams) {
		double micrograms = grams * 1000000;
		return micrograms;
	}
}