package exercise.chap09.car2;

public abstract class CarTemplate {
	protected void start() {
		System.out.println("�õ��� �մϴ�.");
	}
	protected abstract void drive();//�����ϴ� ���
	protected abstract void stop();//���ߴ¹��
	
	protected void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
//	��ӹ��� Ŭ�������� �������ϸ� �ȵǹǷ� final�� ����
	final protected void run() {
		start();
		drive();
		stop();
		turnOff();
	}//templete method
	
}
