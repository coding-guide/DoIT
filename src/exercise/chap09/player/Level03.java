package exercise.chap09.player;

public class Level03 extends PlayerLevel {
	@Override
	protected void run() {
		System.out.println("������ 80���� �޸��ϴ�.");
	}
	
	@Override
	protected void jump() {
		System.out.println("3�� ������ �մϴ�.");
	}
	
	@Override
	protected void turn() {
		System.out.println("�����ϸ鼭 2���� ȸ���� �մϴ�.");
	}
	
	@Override
	protected void showLevel() {
		System.out.println("Level 03 �Դϴ�.");
	}

}
