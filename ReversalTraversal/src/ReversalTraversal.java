import java.util.Arrays;
import java.util.Scanner;
public class ReversalTraversal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		int num = 0;
		int count = 0;
		while (num != -1) {
			System.out.println("Enter your numbers and enter -1 to quit");
			num = input.nextInt();
			if (num == -1)
				break;
			array[count] = num;
			count++;
		}
		array = Arrays.copyOf(array, count);
		System.out.println(Arrays.toString(array));
		array = reverseArray(array, count);
		System.out.println(Arrays.toString(array));
	}
	private static int[] reverseArray(int[] array, int count) {
		int[] temp = new int[count];
		int index = 0;
		for (int i = temp.length - 1; i >= 0; i--) {
			temp[i] = array[array.length - (1 + i)];
		}
		return temp;
	}
}

//int num = input.next(int C);
//int newArrayLength = 0;
//while (num != -1) {
//	array[newArrayLength] = num;
//	System.out.println("Enter number -1 to quit");
//	num = input.next(int C);
//	newArrayLength++;
//}
//array = Arrays.copyOf(arr,  newArrayLength);