import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
	public static void main(String[] args) {
		int[] randomArray = randomArray(33);
		System.out.println(Arrays.toString(randomArray));
	}
	public static int[] randomArray(int size) {
		Random random = new Random();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}
		return a;
	}
//	System.out.println(a);
}

	//public static void main(String[] args) {
//		int[] array = randomArray(8);
//		printArray(array);
//	}
//
//private static int[] randomArray(int i) {
//	// TODO Auto-generated method stub
//	return null;
//}
//}
//		// out loop: for each lowercase letter
//		for (char c = 'a'; c <= 'z'; c++) {
//			// inner loop: count how many times the letter appears
//			for (int i = 0; i < str.length(); i++) {
//				
//			}
//		}
//		System.out.println(char c);
//		
//	}
//}
//		// int [] array = new int [5];
//		int[] array = { 1, 2, 3, 4, 5 };
//		shuffleArray(array);
//		for (int num : array) {
//			System.out.println(num + " ");
//		}
//	}
//
//	
//	private static void shuffleArray(int[] array) {
//		Random rand = new Random();
//		for (int i = array.length - 1; i > 0; i--) {
//			int j = rand.nextInt(i + 1);
//			int temp = array[i];
//			array[i] = array[j];
//			array[j] = temp;
//		}
//
//	}

// }
//		System.out.println(Arrays.toString(array));
//		array = shuffledArray(array);
//		
//		
//		
//
//	}
//
//	private static int[] shuffledArray(int[] array) {
//		int [] temp = new int [array.length];
//		
//		
//		
//		
//		return temp;
