import java.util.Arrays;

public class Max {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		int max = Integer.MIN_VALUE;
		for (String arg : args) {
			int value = Integer.parseInt(arg);
			if(value > max) max = value;
		}
		System.out.println("The highest value is " + max);

	}

}
