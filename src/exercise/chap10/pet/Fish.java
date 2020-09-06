package exercise.chap10.pet;

public class Fish extends Animal implements Pet{
	private String name;
	public Fish() {
		super(0);
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		if(name == null) {
			return "이름이 없습니다.";
		}else {
			return name;
		}
		
	}
	@Override
	public void play() {
		System.out.println("물고기가 헤엄을 치고 놉니다.");
	}
	@Override
	public void eat() {
		System.out.println("물고기가 밥을 먹습니다.");
	}
	@Override
	public void walk() {
		System.out.println("물고기가 지느러미로 헤엄쳐 이동합니다.");
	}

}
