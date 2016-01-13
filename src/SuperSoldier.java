
public class SuperSoldier extends Soldier{

	public SuperSoldier(int newlives, int newHP) {
		super(newlives, newHP);
		// TODO Auto-generated constructor stub
	}
	public void takeDamage(int damage){
		super.setRemainingHP(getHP()-(damage/2));
	}
	public void superSelection(){
		if(getHP()<3000){
			System.out.println("A super soldier cannot have less than 3000 hitpoints.");
		}else{
			System.out.println("Next super soldier applicant!");
		}
	}

}
