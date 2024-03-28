
public class LogicKnowledge {

	public static void main(String[] args) {
		System.out.println(pickNumber(1, 2, 2));
		System.out.println(equiDistance(2, 6, 4));

	}

	public static boolean equiDistance(int a, int b, int c) {
		if(Math.abs(a - b) == c || (Math.abs(a - c) == b) || (Math.abs(b - c) == a)) {
		return true;
		}
		return false;
		
	}

	public static int pickNumber(int a, int b, int c) {
		if (a == b && b == c) {
			return a;
		}
		if (a != b && a != c && b != c) {
			return a + b + c;
		}
		if (a == b ) 
			return c;
		if (b == c)
			return a;
		if (a == c)
			return b;

		return 0;
				
	}

}
