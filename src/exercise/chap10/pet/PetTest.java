package exercise.chap10.pet;

public class PetTest {

	public static void main(String[] args) {
		Fish f = new Fish();
		System.out.println(f.getName());
		Cat c = new Cat("little tiger");
		System.out.println(c.getName());
		
		Animal a = new Fish();
		Animal b = new Spider();
		b.walk();
		Pet p = new Cat();
		if(a instanceof Fish) {
			Fish fish = (Fish)a;
			fish.play();
		}
		if(p instanceof Cat) {
			Cat cat = (Cat)p;
			cat.walk();
		}
		
		System.out.println(p.getClass());
	}

}
