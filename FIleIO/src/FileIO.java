import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		String inFilePath = "C:\\Users\\irom_\\CSCComboSP24bmartisius\\FIleIO\\items.txt";

		double subtotal = 0;
		double taxes = 0;
		double total = 0;

		try {
			Scanner read = new Scanner(new File(inFilePath));
			while(read.hasNextDouble()) {
				double value = read.nextDouble();
				subtotal += value;
			}
			taxes = subtotal * 0.053;
			total = subtotal + taxes;ss
			System.out.println("Items added total: ");
			System.out.println(subtotal);
			System.out.printf("%.2f\n", taxes);
			System.out.printf("%.2f\n", total);
		//	System.out.println("debug");
			read.close();

		//	System.out.println("Success!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println("Failure");
		}
		String outFilePath = "C:\\Users\\irom_\\CSCComboSP24bmartisius\\FIleIO\\total.txt";
		try {
			FileWriter write = new FileWriter(outFilePath);
			String line1 = String.format("Your subtotal is: %.2f\n", subtotal);
			String line2 = String.format("Your taxes are: %.2f\n", taxes);
			String line3 = String.format("Your totall is: %.2f\n", total);
			
			write.write(line1);
			write.write(line2);
			write.write(line3);
			
			write.close();


			


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
