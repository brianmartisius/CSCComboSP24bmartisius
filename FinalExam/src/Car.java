
public class Car extends Vehicle {
	
	private int numDoors = next int;

	public Car(String make, String model, int year, int numDoors) {
		super(make, model, year);
		this.numDoors = numDoors;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	} 

}
