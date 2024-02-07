import java.util.Scanner;

public class YourHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double inch;
		double cm;
	
		
		System.out.println("Please enter your height in inches ");
		inch = in.nextInt();
		cm = inch * 2.54;		
		System.out.print(inch + " in = ");
		System.out.println(cm + " cm");
		
		System.out.println("Please enter your height in centimeters");
		cm = in.nextInt();
		inch = cm / 2.54;
		System.out.print(cm + " cm = ");
		System.out.println(inch + " inch");	
		
		
	}

}
