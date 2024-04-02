import java.util.Random;

public class Character {
	private String name;
	private int power;
	//private double speed;
	private int health;
	private Weapon weapon;
	private Random rand = new Random();
	
	
	
	public Character() {
		super();
		this.name = "barbarian";
		this.power = 10;
		this.health = 50;
	}

	public Character(String name, int power, int health) {
		super();
		this.name = name;
		this.power = power;
		this.health = health;
}
	public int doDamage() {
		int addDmg = rand.nextInt(1, 7);
		int damage = (power + weapon.getDamage()) * addDmg / 2;
		return damage;
	}
	public void recieveDamage(int damage) {
		this.health -= damage;
	}
	public boolean isDead() {
		return health <= 0;
	}
	public Weapon getWeapon() {
		return this.weapon;
	}
	public void setWeapon(String name, int damage) {
		this.weapon = new Weapon(name, damage);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	@Override
	public String toString() {
		return "Character name: " + name + "\npower: " + power + "\nhealth: " + health + "\nWeapon: " + this.getWeapon();
	}
}
