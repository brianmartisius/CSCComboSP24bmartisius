import java.util.Arrays;

public class Student {
	private String fname;
	private String lname;
	private String sNum;
	
	private Course[] courses = new Course[4];
	
	public Student() {
		this(null, null, null);		
	}	
	public Student(String fname, String lname, String sNum) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.sNum = sNum;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getsNum() {
		return sNum;
	}
	public void setsNum(String sNum) {
		this.sNum = sNum;
	}
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", sNum=" + sNum + ", courses="
				+ Arrays.toString(courses) + "]";
	}
	
}
