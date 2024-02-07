import java.util.Scanner;

public class SIOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		int num;
		String str;
		
		System.out.println("Type in a number:");
		num = input.nextInt();		
		System.out.println("You typed in " + num);
		
		System.out.print("Type in a word: ");
		str = input.next();
		System.out.println("You entered " + str);
	}

}
