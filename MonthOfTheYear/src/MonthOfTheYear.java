import java.util.Scanner;

public class MonthOfTheYear {

	public static void main(String[] args) {
		

		class WeekDays {
			static Scanner input = new Scanner (System.in);
			public static void main(String[] args) {
				int dayNum = 0;
				String dayName;
				while(dayNum < 1 || dayNum > 7) {
					System.out.println("Enter number " + "of the day of the week (1-7):");
					dayNum = input.nextInt();
				}
				
				
				dayName = getWeekDay(dayNum);
				System.out.println("The day of the week is " + dayName);
				

			}
			private static String getWeekDay(int dayNum) {
				String day;
				switch (dayNum) {
				case 1:
					day = "Sunday";
					break;
				case 2:
					day = "Monday";
					break;
				case 3:
					day = "Tuesday";
					break;
				case 4:
					day = "Wednesday";
					break;
				case 5:
					day = "Thursday";
					break;
				case 6:
					day = "Friday";
					break;
				case 7:
					day = "Saturday";
					break;
				default:
					day = "Unknown";
					break;
				}
				return day;
			}

		}

	}

}
