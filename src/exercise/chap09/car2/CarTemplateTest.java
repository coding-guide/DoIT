package exercise.chap09.car2;

public class CarTemplateTest {

	public static void main(String[] args) {
		AICar aiCar = new AICar();
		ManualCar manualCar = new ManualCar();
		
		aiCar.run();//���������ڵ���Ŭ������ run���ø��޼��� ����
		System.out.println("-------------");
		manualCar.run();//�Ϲ��ڵ���Ŭ������ run���ø��޼��� ����
		
	}

}
