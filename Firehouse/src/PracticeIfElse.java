import java.util.Scanner;

public class PracticeIfElse {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("please enter four numbers");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		double num4 = input.nextDouble();

		double greatest = greatestNumber(num1, num2, num3, num4);
		System.out.println("The greatest number is " + greatest);

	}

	private static double greatestNumber(double num1, double num2, double num3, double num4) {
		double greatest = num1;
		if (num2 > greatest) {
			greatest = num2;
			if (num3 > greatest) {
				greatest = num3;
				if (num4 > greatest) {
					greatest = num4;
				}
			}
		}
		return greatest;
	}

}
