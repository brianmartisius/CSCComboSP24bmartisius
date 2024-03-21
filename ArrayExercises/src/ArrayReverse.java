import java.util.Arrays;
//import java.util.Scanner;

public class ArrayReverse {
	public static void main (String[] args) {
	int [] array = {1, 2, 3, 4, 5};
	System.out.println(Arrays.toString(array));
	array = reverseArray(array);
	System.out.println(Arrays.toString(array));
	
	}

	private static int[] reverseArray(int[] array) {
		int [] temp = new int [array.length];
		int index = 0;
		 for (int i = temp.length - 1; i >= 0; i--) {
			 temp [index] = array[i];
			 index++;
		 }
		return temp;
	}
	
}
//	public static int[] reverseArrayWithoutTempArray(int[] array) {
//
//	    for (int i = 0; i < array.length / 2; i++, j--) {
//	        int temp = array[i];
//	        array[i] = array[array.length -(1 + i)];
//	        array[array.length -(1 + i)] = temp;
//	    }
//	    return array;
//	}

	
//	Scanner input = new Scanner (System.in);
//	
//	int [] array = {1, 2, 3, 4, 5};
//	
//	System.out.println("Input array: " + Arrays.toString(array));
//	
//	for (i = 0; i < array.length / 2; i++) {
//		int i = array[i];
//		array[i] = array[array.length - i -1];
//		array[array.length - i - 1] = i;
//	}
	


//	Integer[] intArray = {1, 2, 3, 4, 5};
//	
//	System.out.println("Original array:");
//	
//	for (int i=0; i<intArray.length(); i++) {
//		System.out.print(intArray[i] + " ");
//		
//	System.out.println();
//	
//	System.out.println("Original Array printed in reverse order:");
//		for (int i=intArray.length-1; i >= 0; i--) {
//			System.out.print(intArray[i] + " ");
//		}
//	}
//	
//	}


