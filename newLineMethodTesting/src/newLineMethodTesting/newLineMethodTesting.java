package newLineMethodTesting;

public class newLineMethodTesting {
	
	public static void newLine() {
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void threeLine() {
		newLine();
		newLine();
		newLine();
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.out.println("First line.");
		threeLine();
		System.out.println("Second line.");
	}


		}

