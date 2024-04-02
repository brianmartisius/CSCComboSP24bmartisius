import java.util.Random;

public class Battle {

	public static void main(String[] args) {
		Random rand = new Random();
		
		Character barbarian = new Character("Hank", 500, 500);
		barbarian.setWeapon("Broken foil", 12);
		Character monolith = new Character("Frank", 500, 500);
		monolith.setWeapon("Good foil", 235);
		System.out.println(barbarian);
		System.out.println();
		System.out.println(monolith);
		
		int dmg = 0;
		//barbarian.doDamage();
		int round = 0;
		
		while(!barbarian.isDead() && !monolith.isDead()) {
			int turn = rand.nextInt(1, 11);
			System.out.println(turn + " " + round);
			round++;
			if(turn <= 5 && !barbarian.isDead()) {
				dmg = barbarian.doDamage();
				monolith.recieveDamage(dmg);
			}
			if (turn == 2 && !monolith.isDead()) {
				dmg = monolith.doDamage();
				barbarian.recieveDamage(dmg);
			}
		//int dmg = barbarian.doDamage();
		monolith.recieveDamage(dmg);
		
		dmg = monolith.doDamage();
		barbarian.recieveDamage(dmg);
		}
		
		if(barbarian.isDead()) {
			System.out.println(monolith.getName() + " has defeated " + barbarian.getName());
		}else
		{
			System.out.println(barbarian.getName() + " has defeated " + monolith.getName());
		}
		
		System.out.println();
		System.out.println(barbarian);
		System.out.println();
		System.out.println(monolith);
	}
		

}
