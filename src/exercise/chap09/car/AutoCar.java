package exercise.chap09.car;

public class AutoCar extends Car {
	@Override
	protected void running() {
		System.out.println("�ڵ����� �޸��ϴ�.");
	}

	@Override
	protected void refuell() {
		System.out.println("�ڵ����� �ֹ����� �����մϴ�.");

	}
	
	protected void load() {
		System.out.println("�ڵ����� ���� �ƽ��ϴ�.");
	}

}
