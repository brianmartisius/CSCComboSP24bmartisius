import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		int largestNumber = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largestNumber) {
				largestNumber = array[i];
			}
		}
		int[] newArray = new int[array.length - 1];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != largestNumber) {
				newArray[index] = array[i];
				index++;
			}
		}
		int smallestNumber = array[0];
		for (int j = 1; j < array.length; j++) {
			if (array[j] < smallestNumber) {
				smallestNumber = array[j];
			}
		}
		int[] newArray2 = new int[array.length - 1];
		int index = 0;
		for (int j = 0; j < array.length; j++) {
			if (array[j] != smallestNumber) {
				newArray2[index] = array[j];
				index++;

				System.out.println(Arrays.toString(newArray));
			}
int [] averge = newArray;
int sum = 0;
for (int i = 0; i < average.length; i++) {
	sum += average[i];
}
		}
		double average = sum / average.length;
	}
}
}

//	public static void main(String[] args) {
//		int[] array = {1, 2, 3, 4, 5};
//		int largestNumber = Arrays.stream(array).max().getAsInt();
//		int[] newArray = Arrays.stream(array).filter(i -> i != largestNumber).toArray();
//	System.out.println((Arrays.toString(newArray)));
//	int smallestNumber = Arrays.stream(array).min().getAsInt();
//	int[] new
//	}
//}
//		Scanner input = new Scanner (System.in);
//		System.out.println("Enter array size: ");
//		int size = nextInt();
//		int[] array = new int[size];
//		
//		System.out.println("Enter array values: ");
//		for (int i = 0; i < size; i++) {
//			int value = nextInt();
//			array[i] = value;
//		}
//		int length = array.length;
//		
//		int sum = 0;
//		
//		for (int i = 0; i < array.length; i++) {
//			sum += array[i];
//		}
//		double average = sum / length;
//		System.out.println("Average of array: " + average);
//	}
//}

//		int[] array = {1, 2, 3, 5, 9, 10, 11, 11, 17};
//		
//		int length = array.length;
//		
//		int sum = 0;
//		
//		for (int i = 0; i < array.length; i++) {
//			sum += array[i];
//		}
//		double average = sum / length;
//		System.out.println("Average of array: " + average);
//	}
