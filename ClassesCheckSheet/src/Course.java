
public class Course {
	private String coursenumber;
	private int numstudents;
	private int maxstudents;
	private double credits;	
	private Student[] classList;
	
	
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
		classList = new Student[maxstudents];
	}
	public void addStudent(Student student) {
		if(this.getNumstudents() <= this.getMaxstudents()) {
			classList[this.getNumstudents()] = student;
			this.setNumstudents(this.getNumstudents() + 1);
		}else {
			System.out.println("Student not added. Maximum students reached");
		}
		
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
		classList = new Student[this.maxstudents];
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}
	
	public String printClasslist() {
		String str = "";
		for(int i = 0; i < this.classList.length; i++) {
			if(this.classList[i] == null) {
				break;
			}
			str += this.classList[i] + "\n";
		}
		return str;
	}
	
	@Override
	public String toString() {
		return "The course number is: " + coursenumber + " The number of students is: " + numstudents + 
				" The maximum number of students is:" + maxstudents + " and the class is " + credits + " credits.";			
	}
}
