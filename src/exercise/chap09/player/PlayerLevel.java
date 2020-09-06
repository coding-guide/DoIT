package exercise.chap09.player;

public abstract class PlayerLevel {
	
	protected abstract void run();
	protected abstract void jump();
	protected abstract void turn();
	protected abstract void showLevel();

	final public void play() {
		run();
		jump();
		turn();
	}

}
