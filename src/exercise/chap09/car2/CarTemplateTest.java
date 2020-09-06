package exercise.chap09.car2;

public class CarTemplateTest {

	public static void main(String[] args) {
		AICar aiCar = new AICar();
		ManualCar manualCar = new ManualCar();
		
		aiCar.run();//자율주행자동차클래스의 run탬플릿메서드 실행
		System.out.println("-------------");
		manualCar.run();//일반자동차클래스의 run탬플릿메서드 실행
		
	}

}
