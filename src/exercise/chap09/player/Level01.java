package exercise.chap09.player;

public class Level01 extends PlayerLevel {
	@Override
	protected void run() {
		System.out.println("빠르기 10으로 달립니다.");
	}
	
	@Override
	protected void jump() {
		System.out.println("1단 점프를 합니다.");
	}
	
	@Override
	protected void turn() {
		System.out.println("turn스킬을 쓸 수 없습니다.");
	}
	
	@Override
	protected void showLevel() {
		System.out.println("Level 01 입니다.");
	}

}
