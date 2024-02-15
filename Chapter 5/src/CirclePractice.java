import java.util.Scanner;

public class CirclePractice {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the radius");
		double radius = input.nextDouble();
		
		double diameter = getDiameter(radius);
		double area = getArea(radius);
		double circumference = getCircumference(radius);
		System.out.println("The diameter is " + diameter);
		System.out.println("The area is " + area);
		System.out.println("The circumfrence is " + circumference);
		

	}
	private static double getDiameter(double radius) {
		
		double diameter = 2 * radius;
		
		return diameter;
	}
	private static double getCircumference(double radius) {
		
		double circumference = 2 * radius * Math.PI;
		
		return circumference;
	}
	private static double getArea(double radius) {
		
		double area = Math.PI * radius * radius;
		
		return area;
	}

}
