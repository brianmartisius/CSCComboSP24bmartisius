
public class Recursion {

	public static void main(String [] args) {
		System.out.println();
	
		forever("");
	}

	private static void forever(String s) {		
		System.out.println("x");
		forever(s);
	}

}
