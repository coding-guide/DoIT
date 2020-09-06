package exercise.chap09.player;

public class Player {
	private PlayerLevel level;

	public Player() {
		level = new Level01();
		level.showLevel();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void setLevel(PlayerLevel level) {
		this.level = level;
		level.showLevel();
	}

	public void gameStart() {
		level.play();
	}

}
