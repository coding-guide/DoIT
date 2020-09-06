package exercise.chap09.car;

public class AutoCar extends Car {
	@Override
	protected void running() {
		System.out.println("자동차가 달립니다.");
	}

	@Override
	protected void refuell() {
		System.out.println("자동차에 휘발유를 주유합니다.");

	}
	
	protected void load() {
		System.out.println("자동차에 짐을 싣습니다.");
	}

}
