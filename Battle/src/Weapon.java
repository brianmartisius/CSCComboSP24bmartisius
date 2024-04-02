
public class Weapon {
	private String name;
	private int damage;
	public Weapon() {
		this.name = "foil";
		this.damage = 8;
	}
	public Weapon(String name, int damage) {
		super();
		this.name = name;
		this.damage = damage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	@Override
	public String toString() {
		return "Weapon name:" + name + "\n damage=" + damage + "\n";
	}
	
}
