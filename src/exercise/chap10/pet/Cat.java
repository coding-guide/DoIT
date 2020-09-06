package exercise.chap10.pet;

public class Cat extends Animal implements Pet {
	private String name;
	
	public Cat() {
		super(4);
	}
	
	public Cat(String name) {
		super(4);
		setName(name);
		
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void play() {
		System.out.println("고양이가 야~~옹하면서 놉니다.");
	}

	@Override
	public void eat() {
		System.out.println("고양이가 밥을 먹습니다.");
	}

}
