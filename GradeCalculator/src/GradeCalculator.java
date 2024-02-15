import java.util.Scanner;

public class GradeCalculator {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter your numeric grade");
		double numGrade = input.nextDouble();
		String letterGrade = null;
		
		if (numGrade > 91)
		{
			letterGrade = "A";
		}
		else if (numGrade > 88)
		{
			letterGrade = "A-";
		}
		else if (numGrade > 86)
		{
			letterGrade = "B+";
		}
		else if (numGrade > 81)
		{
			letterGrade = "B";
		}
		else if (numGrade > 78)
		{
			letterGrade = "B-";
		}
		else if (numGrade > 76)
		{
			letterGrade = "C+";
		}
		else if (numGrade > 71)
		{
			letterGrade = "C";
		}
		else if (numGrade > 68)
		{
			letterGrade = "C-";
		}
		else if (numGrade > 66)
		{
			letterGrade = "D+";
		}
		else if (numGrade > 59)
		{
			letterGrade = "D";
		}
		else if (numGrade > 0)
		{
			letterGrade = "F";
		}
		System.out.println("Your letter grade is " + letterGrade);
		}
	
		
		
	}


