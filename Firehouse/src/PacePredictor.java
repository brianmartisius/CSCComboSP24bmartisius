import java.util.Scanner;

public class PacePredictor {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please enter your pace");
		double pace = input.nextDouble();

		double marathonTime = marathonTime(pace);
		double halfMarathonTime = halfMarathonTime(pace);
		double kph = kph(pace);
	}

	private static double kph(double pace) {
		double kph = (pace / 1.609);
		return kph;
	}

	private static double halfMarathonTime(double pace) {
		double halfMarathonTime = (pace * 13.1);
		return halfMarathonTime;
	}

	private static double marathonTime(double pace) {
		double marathonTime = (pace * 26.2);
		return marathonTime;
	}

}
