
public class Design {

	public static void main(String[] args) {
		printROW(3);

	}

	private static void printROW(int n) {
		for(int i = 1; i < 6; i++) {
			System.out.printf("%4d", n * i);
		}
		System.out.println();
		
	}

}
