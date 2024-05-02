
public class Vehicle {
	private String Make = "";
	private String Model = "";
	private int Year = new int;
	
	


	public Vehicle(String make, String model, int year) {
		super();
		Make = make;
		Model = model;
		Year = year;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	@Override
	public String toString() {
		return "Vehicle [Make=" + Make + ", Model=" + Model + ", Year=" + Year + "]";
	}
	
	}
