
public class Driver {
	public static void main(String[] args) {
		Car mustang = new Car(85000, "Blue", "Ford", "Mustang", 52);
		System.out.println(mustang);
		Car Prius = new Car(101000, "Silver", "Toyota", "Prius", 48);
		System.out.println(Prius);
		mustang.drive(12);
		mustang.paint("Orange");
		mustang.drive(12);
		System.out.println(mustang);
		Prius.drive(102);
		System.out.println(Prius);
		
	}
}
