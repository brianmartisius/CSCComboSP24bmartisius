import java.util.Scanner;

public class IsPositive {
	static Scanner input =  new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num2;
	
		System.out.println("Enter a number");
		num2 = input.nextInt();
		if (isPositive(num2)) {
			System.out.println(num2 + " is positive");
			
		}else
		{
			System.out.println(num2 + " is negative");
		}

	}
	
	public static boolean isPositive (int num)
	{
			
		if(num >= 0) {
			return true;
		}
		return false;
	}

}
