package exercise.chap09.car2;

public class ManualCar extends CarTemplate{
	@Override
	protected void drive() {
		System.out.println("일반자동차를 사람이 운전합니다.");
		System.out.println("사람이 핸들을 조정하여 방향을 전환합니다.");
	}
	@Override
	protected void stop() {
		System.out.println("사람이 브레이크를 밟아 멈춥니다.");
	}
}
