
public class Animal {
	private String name;
	private double height;
	private double weight;
	public Animal () {
		
		this.name = "animal";
		this.height = 1.0;
		this.weight = 1.0;
	}
	
	
//	public Animal(String name, double height, double weight) {
//		super();
//		this.name = name;
//		this.height = height;
//		this.weight = weight;
//	}
//	
//	public Animal(String name, double height, double weight) {
//		super();
//		this.name = name;
//		this.height = height;
//		this.weight = weight;
//	}
	
//	public Animal (String name) {
//		super();
//		this.name = "Frank";
//		this.height = 5.0;
//		this.weight = 100.0;
//	}
	
	
	public Animal(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String makeSound() {
		return "blah blah";
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	

}
