package exercise.chap09.car2;

public class ManualCar extends CarTemplate{
	@Override
	protected void drive() {
		System.out.println("�Ϲ��ڵ����� ����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����Ͽ� ������ ��ȯ�մϴ�.");
	}
	@Override
	protected void stop() {
		System.out.println("����� �극��ũ�� ��� ����ϴ�.");
	}
}
