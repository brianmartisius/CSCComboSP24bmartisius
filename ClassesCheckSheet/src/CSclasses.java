
public class CSclasses {

	public static void main(String[] args) {
		//String cs101 = "cs101";
		Course[] courseList = new Course[6];
		courseList[0] = new Course();
		courseList[0].setCoursenumber("cs101");
		courseList[0].setNumstudents(13);
		courseList[0].setMaxstudents(32);
		courseList[0].setCredits(3.0);
		
		courseList[1] = new Course();
		courseList[1].setCoursenumber("en101");
		courseList[1].setNumstudents(14);
		courseList[1].setMaxstudents(30);
		courseList[1].setCredits(3.0);
		
		courseList[2] = new Course();
		courseList[2].setCoursenumber("bio101");
		courseList[2].setNumstudents(10);
		courseList[2].setMaxstudents(18);
		courseList[2].setCredits(4.0);
		
		courseList[3] = new Course();
		courseList[3].setCoursenumber("phy101");
		courseList[3].setNumstudents(20);
		courseList[3].setMaxstudents(40);
		courseList[3].setCredits(4.0);
		
		courseList[4] = new Course();
		courseList[4].setCoursenumber("cs101");
		courseList[4].setNumstudents(15);
		courseList[4].setMaxstudents(40);
		courseList[4].setCredits(4.0);
		
		courseList[5] = new Course();
		courseList[5].setCoursenumber("math101");
		courseList[5].setNumstudents(18);
		courseList[5].setMaxstudents(42);
		courseList[5].setCredits(4.0);
		
		
		
		//Course 
		System.out.println(courseList[0]);
		System.out.println(courseList[1]);
		System.out.println(courseList[2]);
		System.out.println(courseList[3]);
		System.out.println(courseList[4]);
		System.out.println(courseList[5]);

	}
	

}
