package exercise.chap10.pet;

public class Spider extends Animal {
	public Spider() {
		super(8);
	}

	@Override
	public void eat() {
		System.out.println("거미줄로 곤충을 잡아 먹습니다.");
	}
}
