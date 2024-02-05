import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// 05Feb2024 lecture
		
//		Write a Java program that takes two integers as input from the user and prints
//		the sum (addition), multiply, subtract, & divide of two numbers.
	//	i.e.> OUTPUT :
//		First number is 10 and second number is 2. 10 + 2 = 12
		
		
		Scanner scr = new Scanner(System.in);
		int num1 = 0, num2 = 0, sum = 0, subTotal = 0, prod = 0;
		System.out.println("Enter the first number please");
		num1 = scr.nextInt();
	
		System.out.println(num1);
		
		System.out.println("Enter the second number please");
		num2 = scr.nextInt();
	
		System.out.println(num2);
		
		sum = num1 + num2;
		prod = num1 * num2;
		subTotal = num1 - num2;
		
		System.out.println("The Sum is " + sum);
		System.out.println("The product is " + prod);
		System.out.println("Substraction total is " + subTotal);
		
		
		
		
		

	}

}
