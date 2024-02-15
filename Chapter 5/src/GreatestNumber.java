import java.util.Scanner;

public class GreatestNumber {
	static Scanner input = new Scanner(System.in)
	public static void main(String[] args) {
		
		//Take three numbers from the user and print the greatest number. 
		//main() should call a method named greatestNumber() 
		//that takes the 3 numbers and returns the greatest number. (Call the class Exercise2)
	
		
		System.out.println("Enter three numbers");
		int num = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		int greatest = greatestNumber(num, num2, num3);{
		System.out.println("The biggest number is " + greatest);
		
		
	public static int greatestNumber(int num, int num2, int num3)
		{
			int greatest = num;
			if(num2 > greatest) {
				greatest = num2;{
				
			}
			if(num3 > greatest) {
				greatest = num3;
			}
			return greatest;{
			}
			
			
			
		
	
					
	


