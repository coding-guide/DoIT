package exercise.chap09.player;

public class Level03 extends PlayerLevel {
	@Override
	protected void run() {
		System.out.println("빠르기 80으로 달립니다.");
	}
	
	@Override
	protected void jump() {
		System.out.println("3단 점프를 합니다.");
	}
	
	@Override
	protected void turn() {
		System.out.println("점프하면서 2바퀴 회전을 합니다.");
	}
	
	@Override
	protected void showLevel() {
		System.out.println("Level 03 입니다.");
	}

}
