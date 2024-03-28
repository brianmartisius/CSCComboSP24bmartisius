
public class StringKnowledge {

	public static void main(String[] args) {
		
		System.out.println(howManyCat("catABC cat"));
		System.out.println(endOther("hiabc", "abc"));

	}

	public static boolean endOther(String a, String b) { 
		String small = a;
		String big = b;
		if (a.length() > b.length()) {
			small = b;
			big = a;
		}
		
		if (big.substring(big.length() - small.length()).equals(small)) {
			return true;
			
		}
		return false;
		
		
	}

	public static int howManyCat(String str) {
		int count = 0;
		for (int i = 0; i <= str.length() - 3; i++) {
		
			if (str.substring(i, i + 3).equals("cat")) {
				count++;
			}
		}
				
		return count;
		
	}

}
