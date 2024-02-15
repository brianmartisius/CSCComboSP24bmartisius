
//public class HCW {

/*public static void main(String[] args) {
	System.out.println("hello cruel world");
}

}*/

import java.util.Scanner;

public class MonthYear {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int monthNum = 0;
		String monthName;
		while (monthNum < 1 || monthNum > 12) {
			System.out.println("Enter number " + "of the month of the year (1-12):");
			monthNum = input.nextInt();
		

		}
		
		monthName = getMonth(monthNum);
		System.out.println("The month is " + monthName);
		
	}
	private static String getMonth(int monthNum) {
		String month;
		switch (monthNum) {
		case 1:
			month = "January";
		}
	}
}
