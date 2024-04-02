
public class Course {
	private String coursenumber;
	private int numstudents;
	private int maxstudents;
	private double credits;	
	public Course() {
	//	super();
		this.coursenumber = null;
		this.numstudents = 0;
		this.maxstudents = 32;
		this.credits = 18;
		
	}
	public Course(String coursenumber, int numstudents, int maxstudents, double credits) {
		super();
		this.coursenumber = coursenumber;
		this.numstudents = numstudents;
		this.maxstudents = maxstudents;
		this.credits = credits;
		
	}

	public String getCoursenumber() {
		return coursenumber;
	}

	public void setCoursenumber(String coursenumber) {
		this.coursenumber = coursenumber;
	}
	
	public int getNumstudents() {
		return numstudents;
	}

	public void setNumstudents(int numstudents) {
		this.numstudents = numstudents;
	}

	public int getMaxstudents() {
		return maxstudents;
	}

	public void setMaxstudents(int maxstudents) {
		this.maxstudents = maxstudents;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}
	
	@Override
	public String toString() {
		return "The course number is: " + coursenumber + " The number of students is: " + numstudents + 
				" The maximum number of students is: " + maxstudents + " and the class is " + credits + "credits.";
		
		
		
	}
	
	
	

}
