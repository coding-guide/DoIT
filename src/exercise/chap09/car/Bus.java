package exercise.chap09.car;

public class Bus extends Car{
	@Override
	protected void running() {
		System.out.println("버스가 달립니다.");
	}
	@Override
	protected void refuell() {
		System.out.println("버스에 천연가스를 충전합니다.");
	}
	
	protected void takePassenger() {
		System.out.println("버스에 승객을 태웁니다.");
		
	}

}
