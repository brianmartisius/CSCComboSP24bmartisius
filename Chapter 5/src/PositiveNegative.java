import java.util.Scanner;

public class PositiveNegative {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
	double num;
	System.out.println("Enter a real number");
	num = input.nextDouble();
	
	String result =	isZero(num);
	System.out.println(result);

	}

	private static String isZero(double num) {
		String str = "";
		if (num > 0) {
			str = str + "Positive ";
		} else if (num < 0) {
			str = str + "Negative ";
		} else {
			str = str + "Zero ";
		}
		if (Math.abs(num) < 1) {
			str = str + "small";
		}
		if (Math.abs(num) > 1000000) {
			str = str + "large";
		}

		return str;
	}
}
