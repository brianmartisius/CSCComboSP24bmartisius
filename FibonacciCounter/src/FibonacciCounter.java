import java.util.Scanner;

public class FibonacciCounter {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0, num2 = 1, num3 = 0, userNum;
		System.out.println("Enter a number: ");
		userNum = input.nextInt();
		if (userNum < 2) {
			System.out.println(userNum);}
		else {
			
//			for (int i = 0; i <= userNum; i++) {
//				System.out.print(num1 + " ");
//				num3 = num1 + num2;
//				num1 = num2;
//				num2 = num3;
				
			}
			System.out.println();
			
		}

	}

}








//import java.util.Scanner;
//
//public class WhileFibonacci {
//	static Scanner input = new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		int num1 = 0, num2 = 1, num3, userNum, i; num3 = num1 + num2;
//		i = 0;
//		System.out.println("Enter a number: ");
//		userNum = input.nextInt();
//		if (userNum < 2) {
//			System.out.println(userNum);
//		}
//		System.out.println(num1 + " " + num2 + " ");
//		while (i + 2 < userNum) {
//			i = i + 1;
//			num3 = num1 + num2;
//			num1 = num2;
//			num2 = num3;
//			System.out.print(num3 + " ");
//		}
//	}
//}