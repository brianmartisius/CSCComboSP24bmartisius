
public class ArrayKnowledge {

	public static void main(String[] args) {
		char[] chrs = {'a', 'b', 'x'};		
		System.out.println(hasxx(chrs));
	//	fromToArray();

	}

	public static boolean hasxx(char[] characters) {
		for (int i = 0; i < characters.length - 1; i++)
			if (characters[i] == 'x' && characters[i + 1] == 'x' ) {
					return true;
		}
		return false;
		
	}

	public int[] fromToArray(int start, int end) {
		int run[] = " ";
		
		return run[];
		
	}

}
