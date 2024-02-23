import java.util.Scanner;

public class Scrabble {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter tiles (letters)");
		// enter the tiles from the user
		
		
		String tiles = input.next();
		// the actual tiles (or letters)
		
		System.out.print("Enter word ");
		String word = input.next();
		// the word we are checking
		
//		int character1countW = HowManyTimes (word, 2);
//		System.out.println("The character " + word.charAt(2) + character1countW);
//		
//		int character1countT = CountLetters (tiles, word.charAt(2));
//		System.out.println("The character " + word.charAt(2) + character1countT);
		
		boolean works = true;
//		if the following 		
		
		
		
		for (int j = 0; j < word.length(); j++) {
			int character1countW = HowManyTimes (word, j);
			System.out.println("The character " + word.charAt(j) + character1countW);
//		starting to count how many times a character appears in the word			
			
			int character1countT = CountLetters (tiles, word.charAt(j));
			System.out.println("The character " + word.charAt(j) + character1countT);
//		counting the total letters in the word				
		
			
			
			
			if (character1countT < character1countW) {
				works = false;
				System.out.println("There are NOT enough " + word.charAt(j) + "'s in " + tiles);
			} 
			else {
				
				System.out.println("There are enough " + word.charAt(j) + "'s in " + tiles);
				// the false statement the conditions are not met
				
			}
		}
		
	
		if(works) {
			System.out.println("this works");
		} else {
			System.out.println("This does NOT work!");
		}
		
		
	}

	public static int HowManyTimes(String str, int i) {
		str.charAt(i);
		int j, count = 0;
		
		for (j = 0; j < str.length(); j++) {
			if (str.charAt(i) == str.charAt(j)) {
				count++;
				// the method to count the frequency of letters in the word
			}
			
		}
		return count;
	}
	
	public static int CountLetters(String str, char a) {
		int j, count = 0;
		
		for (j = 0; j < str.length(); j++) {
			if (str.charAt(j) == a) {
				count++;
				// the method to count the letters in the tiles
				
			}
		}
		return count;
	}
	
	
	
	
}
