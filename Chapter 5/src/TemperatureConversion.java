import java.util.Scanner;

public class TemperatureConversion {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Enter the temperature in Fahrenheit");
		double fahTemp = input.nextDouble();
		
		double celTemp = getCelTemp(fahTemp);
		double calTemp = getCalTemp(fahTemp);
		System.out.println("The temperature in Celsius is " + celTemp);
		System.out.println("The temperature in Kelvin is " + calTemp);
		
		

	}
	
	private static double getCalTemp(double fahTemp) {
		
		double calTemp = (fahTemp - 32) * 5 / 9 + 273.15;
		
		return calTemp;
	}

	private static double getCelTemp(double fahTemp) {
		
		double celTemp = (fahTemp - 32) * 5 / 9;				
		
		return celTemp;
		
	
			
		}	
		
		
	}


