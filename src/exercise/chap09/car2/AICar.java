package exercise.chap09.car2;

public class AICar extends CarTemplate{
	@Override
	protected void drive() {
		System.out.println("자율주행자동차가 스스로 운전을 합니다.");
		System.out.println("스스로 알아서 방향전환을 합니다.");
	}
	@Override
	protected void stop() {
		System.out.println("스스로 멈춥니다.");
	}

}
