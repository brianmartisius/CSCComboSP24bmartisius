
public class Driver {

	public static void main(String[] args) {
		Time time = new Time(19, 20, 0.0);
		Time time2 = time;
		Time time3 = new Time (9, 20, 0.0);
		
		System.out.println(time.equals(time2));
		System.out.println(time.equals(time3));
		
		System.out.println(time.add(time3));
				//new Time();
		System.out.print(time2.gethour() + ":");
		System.out.print(time2.getMinute() + ":");
		System.out.println(time2.getSecond());
		System.out.println();
		
		time.setHour(10);
		time.setMinute(10);
		time.setSecond(0.0);
		
		System.out.print(time.gethour() + ":");
		System.out.print(time.getMinute() + ":");
		System.out.print(time.getSecond());
		
		printTime(time);
		
		System.out.println(time.toString());
		
	//	System.out.println(time.toString()); // prints memory location, too
		
		//System.out.println(time); // prints memory location
		

	}
	public static void printTime(Time t) {
		System.out.print(time.gethour() + ":");
		System.out.print(time.getMinute() + ":");
		System.out.print(time.getSecond());
	}

}
