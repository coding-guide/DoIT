package exercise.chap10.pet;

public abstract class Animal {
	protected int legs;

	protected Animal(int legs) {
		this.legs = legs;
	}

	public abstract void eat();

	public void walk() {
		System.out.println(legs + "개의 발로 걷습니다.");
	}
}
