
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldier ghost = new Soldier(3, 2500);
		SuperSoldier snake = new SuperSoldier(4,10000);
		SuperSoldier solid = new SuperSoldier(4,2500);
		ghost.takeDamage(1000);
		snake.takeDamage(1000);
		solid.takeDamage(1000);
		System.out.println("Ghost has " + ghost.getRemainingHP() + " HP remaining.");
		System.out.println("Solid has " + solid.getRemainingHP() + " HP remaining.");
		System.out.println("Snake has " + snake.getRemainingHP() + " HP remaining.");
		snake.superSelection();
		solid.superSelection();
		
		
	}

}
