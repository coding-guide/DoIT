package exercise.chap09.player;

public class Level01 extends PlayerLevel {
	@Override
	protected void run() {
		System.out.println("������ 10���� �޸��ϴ�.");
	}
	
	@Override
	protected void jump() {
		System.out.println("1�� ������ �մϴ�.");
	}
	
	@Override
	protected void turn() {
		System.out.println("turn��ų�� �� �� �����ϴ�.");
	}
	
	@Override
	protected void showLevel() {
		System.out.println("Level 01 �Դϴ�.");
	}

}
