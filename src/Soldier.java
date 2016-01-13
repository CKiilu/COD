
public class Soldier {
	public Soldier(int newlives, int newHP){
		this.lives=newlives;
		this.HP=newHP;
	}
	private int lives = 4;
	private int HP = 3000;
	private int remainingHP;
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getRemainingHP() {
		return remainingHP;
	}
	public void setRemainingHP(int remainingHP) {
		this.remainingHP = remainingHP;
	}
	public void takeDamage(int damage){
		this.remainingHP=getHP() - damage;
	}
}
