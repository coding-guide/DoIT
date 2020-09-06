package exercise.chap09.car;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> car = new ArrayList<Car>();
		car.add(new Bus());
		car.add(new AutoCar());
		for (Car c : car) {
			c.refuell();
			c.running();
			if (c instanceof Bus) {
				Bus bus = (Bus) c;
				bus.takePassenger();
//				((Bus) c).takePassenger();
			} else if (c instanceof AutoCar) {
				AutoCar autocar = (AutoCar) c;
				autocar.load();
			}
			c.stop();
			System.out.println();
		}

	}

}
