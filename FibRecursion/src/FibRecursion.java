import java.util.Scanner;

public class FibRecursion {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter the number");
		int n = input.nextInt();		
		for (int i = 0; i < n; i++) {
			System.out.println(" ");
		}
		fib(n);	
		System.out.print(n);

	}

		private static int fib(int n) {
			if (n == 0)
				return 0;
			else if(n == 1)
				return 1;
			else
				return fib(n-1) + fib(n-2);		
	}

}
