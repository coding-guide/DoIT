package exercise.chap08.animal;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		ArrayList<Animal> animal = new ArrayList<Animal>();
		
		animal.add(new Human());
		animal.add(new Eagle());
		animal.add(new Tiger());
		animal.add(new Animal());
		
		for (Animal ani : animal) {
			ani.move();			
		}
	}

}
