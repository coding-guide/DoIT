package exercise.chap09.car;

public class Bus extends Car{
	@Override
	protected void running() {
		System.out.println("������ �޸��ϴ�.");
	}
	@Override
	protected void refuell() {
		System.out.println("������ õ�������� �����մϴ�.");
	}
	
	protected void takePassenger() {
		System.out.println("������ �°��� �¿�ϴ�.");
		
	}

}
