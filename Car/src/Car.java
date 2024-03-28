
public class Car {
	private int odometer;
	private String color;
	private String make;
	private String model;
	private int height;

	public Car() {
		this.odometer = 0;
		this.color = null;
		this.make = null;
		this.model = null;
		this.height = 0;
	}
	public void drive(int miles) {
		this.odometer += miles;
	}
	public void paint(String color) {
		this.color = color;
		
	}
	public int getOdometer() {
		return odometer;
	}
	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public Car(int odometer, String color, String make, String model, int height) {
		super();
		this.odometer = odometer;
		this.color = color;
		this.make = make;
		this.model = model;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Car: " + color + " " + make + " " + model + " with " + odometer + " " + "miles. " + "Height: " + height;
	}
}
