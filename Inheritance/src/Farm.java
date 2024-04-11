
public class Farm {

	public static void main(String[] args) {
		Animal animal1 = new Animal ("Doggy", 2.0, 30.0);
		
		System.out.println(animal1);
		System.out.println(animal1.makeSound());
		
		Cat cat1 = new Cat ("Hobbes", 1.5, 18, "Tiger stripped");
		
		System.out.println(cat1.toString());
		System.out.println(cat1.makeSound());
		
		Dog dog1 = new Dog ("Cujo", 2.0, 25, "Lab");
		
		System.out.println(dog1.toString());
		System.out.println(dog1.makeSound());

	}

}
