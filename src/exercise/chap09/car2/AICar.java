package exercise.chap09.car2;

public class AICar extends CarTemplate{
	@Override
	protected void drive() {
		System.out.println("���������ڵ����� ������ ������ �մϴ�.");
		System.out.println("������ �˾Ƽ� ������ȯ�� �մϴ�.");
	}
	@Override
	protected void stop() {
		System.out.println("������ ����ϴ�.");
	}

}
