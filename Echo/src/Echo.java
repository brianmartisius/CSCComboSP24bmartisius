import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		int num1 = 23, num2;
		
		Scanner in = new Scanner(System.in);
		// Scanner in;
		
		System.out.print("Type number: ");
		num2 = in.nextInt();
		System.out.println("You typed " + num2);
		in.nextLine();
		
		System.out.print("Type something: ");
		line = in.nextLine();
		System.out.println("You said something else " + line);
		line = in.nextLine();
		System.out.println("You also said " + line);
	}

}

