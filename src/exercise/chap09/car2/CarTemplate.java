package exercise.chap09.car2;

public abstract class CarTemplate {
	protected void start() {
		System.out.println("시동을 켭니다.");
	}
	protected abstract void drive();//운전하는 방법
	protected abstract void stop();//멈추는방법
	
	protected void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
//	상속받은 클래스에서 재정의하면 안되므로 final로 선언
	final protected void run() {
		start();
		drive();
		stop();
		turnOff();
	}//templete method
	
}
