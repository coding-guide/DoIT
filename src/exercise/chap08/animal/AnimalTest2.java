package exercise.chap08.animal;

import java.util.ArrayList;

public class AnimalTest2 {

	public static void main(String[] args) {
		ArrayList<Animal> animal = new ArrayList<Animal>();
		
		animal.add(new Human());
		animal.add(new Eagle());
		animal.add(new Tiger());
		animal.add(new Animal());
		
		for (Animal ani : animal) {
			ani.move();
			if(ani instanceof Human) {
				Human human = (Human)ani;
				human.readBook();
//				((Human) ani).readBook();
			}else if(ani instanceof Eagle) {
				Eagle eagle = (Eagle)ani;
				eagle.flying();
//				((Eagle) ani).flying();
			}else if(ani instanceof Tiger) {
				Tiger tiger = (Tiger)ani;
				tiger.hunting();
//				((Tiger) ani).hunting();
			}else {
				System.out.println("Animal을 상속받지 않은 자료형입니다.");
			}
			System.out.println();
			
		}
	}

}
