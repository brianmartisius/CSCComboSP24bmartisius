
public class Dog extends Animal{
	
	private String type;
	public Dog () {
		super();
		this.type = "dog";

	}

	public Dog(String type) {
		super();
		this.type = type;
	}
	
	public Dog(String name, double height, double weight, String type) {
		super(name, height, weight);
		this.type = type;
		
	}
	@Override	
	public String makeSound() {
		return "ruff ruff";
	}

	@Override
	public String toString() {
		String str = super.toString() + "Dog's type is " + type;
		return str;
	}

}
