package exercise.chap09.player;

public class Level02 extends PlayerLevel {
	@Override
	protected void run() {
		System.out.println("������ 40���� �޸��ϴ�.");
	}
	
	@Override
	protected void jump() {
		System.out.println("2�� ������ �մϴ�.");
	}
	
	@Override
	protected void turn() {
		System.out.println("�ѹ��� ȸ���� �մϴ�.");
	}
	
	@Override
	protected void showLevel() {
		System.out.println("Level 02 �Դϴ�.");
	}

}
