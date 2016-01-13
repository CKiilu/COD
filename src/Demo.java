
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldier ghost = new Soldier(3, 2500);
		SuperSoldier snake = new SuperSoldier(4,4000);
		SuperSoldier solid = new SuperSoldier(4,2500);
		ghost.takeDamage(400);
		snake.takeDamage(400);
		solid.takeDamage(400);
		System.out.println("Ghost has " + ghost.getRemainingHP() + " HP remaining.");
		System.out.println("Ghost has " + solid.getRemainingHP() + " HP remaining.");
		System.out.println("Ghost has " + snake.getRemainingHP() + " HP remaining.");
		snake.superSelection();
		solid.superSelection();
	}

}
