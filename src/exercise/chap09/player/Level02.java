package exercise.chap09.player;

public class Level02 extends PlayerLevel {
	@Override
	protected void run() {
		System.out.println("빠르기 40으로 달립니다.");
	}
	
	@Override
	protected void jump() {
		System.out.println("2단 점프를 합니다.");
	}
	
	@Override
	protected void turn() {
		System.out.println("한바퀴 회전을 합니다.");
	}
	
	@Override
	protected void showLevel() {
		System.out.println("Level 02 입니다.");
	}

}
