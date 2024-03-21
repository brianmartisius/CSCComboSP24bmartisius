
public class SumOfForNumbers {

	public static void main(String[] args) {

		System.out.println(sumNums(10));

	}

	public static int sumNums(int lastNum) {
		int total = 0;
		for (int x = 1; x <= lastNum; x++) {
			total += x;
		}
		return total;
	}

	public static int sumNumsR(int n) {
		if (n == 0) {
			return 0;
		}
		return n + 
				sumNumsR(n - 1);
	}

}
