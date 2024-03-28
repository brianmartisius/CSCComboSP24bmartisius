
public class Time {
	private int hour;
	private int minute;
	private double second;
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
	}
	public Time(int hour, int minute, double second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
//	public int getHour() {
//		return this.hour;
//	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public double getSecond() {
		return second;
	}
	public void setSecond(double second) {
		this.second = second;
	}
	public int gethour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public Time add(Time that) {
		Time sum = new Time();
		sum.hour = this.hour + that.hour;
		sum.minute = this.minute + that.minute;
		sum.second = this.second + that.second;
		if(sum.second >= 60.0) {
			sum.minute += 1;
			sum.second -= 60.0;
		}
		if (sum.minute >= 60) {
			sum.hour += 1;
			sum.minute -= 60;
		}
		if(sum.hour >= 24) {
			sum.hour -= 24;
		}
		return sum;
	}
	public boolean equals(Time that) {
		final double DELTA = 0.001; //constants are all caps
		return this.hour == that.hour &&
		this.minute == that.minute &&
		//this.second == that.second;
		Math.abs(this.second - that.second) < DELTA;
	}
	@Override
	public String toString() {
		return "Time is:" + hour + ":" + minute + ":" + second;
	}
	
}
