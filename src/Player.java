
public class Player {
	private int lives, level, score;
	private String  handleName;
	
	public Player(String hName){
		this.handleName = hName;
	}
	public Player(int life){
		this.lives = life; 
	}
	public Player(int lvl, int points){
		this.level =lvl;
		this.score = points;
	}
	
	/*handle name*/
	public void setHandleName(String hName) {
		this.handleName = hName;
	}
	public String getHandleName() {
		return handleName;
	}
	
	/*Level*/
	public void setLevel(int lvl) {
		this.level = lvl;
	}
	public int getLevel() {
		return level;
	}
	
	/*Lives*/
	public void setLives(int life) {
		this.lives = life;
	}
	public int getLives() {
		return lives;
	}
	
	/*Score*/
	public void setScore(int points) {
		this.score = points;
	}
	public int getScore() {
		return score;
	}	
}
