import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Third Set :
//			Write a Java program that takes an integer as input from the user and
//			determines whether it's an even or odd number.
//			i.e.> OUTPUT :
//			56 is EVEN number.

		Scanner scr = new Scanner(System.in);
		int num = 0, ans = 1;

				while (ans == 1) {		
				
					System.out.println("Enter number");
					num = scr.nextInt();
					System.out.println(num);

					if ((num % 2) == 0) {
						System.out.println(num + " Even number");
					} else {
						System.out.println(num + " Odd number");
			
		}
					System.out.println("do you want to input another number yes (1) no (0)");
					ans = scr.nextInt();
		}
	}

}
