package exercise.chap06.transport;

public class Person {
	String personName;
	int age;
	int money;

	public Person(String personName, int age, int money) {
		this.personName = personName;
		this.age = age;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
//		요금을 내면, 버스의 총액 및 승객은 증가
		if(age>=19) {
			
			if(this.money >= 1300) {
				bus.pickUpPerson(1300);
				this.money -= 1300;
			}else {
				System.out.println("요금이 부족하여 버스를 탈 수 없습니다.");
			}
			
		}else {
			
			if(this.money >= 1000) {
				bus.pickUpPerson(1000);
				this.money -= 1000;
			}else {
				System.out.println("요금이 부족하여 버스를 탈 수 없습니다.");
			}
			
		}
		
	}
	
	public void takeSubway(Subway subway) {
//		요금을 내면, 지하철의 총액 및 승객은 증가
if(age>=19) {
			
			if(this.money >= 1250) {
				subway.pickUpPerson(1250);
				this.money -= 1250;
			}else {
				System.out.println("요금이 부족하여 지하철을 탈 수 없습니다.");
			}
			
		}else {
			
			if(this.money >= 720) {
				subway.pickUpPerson(720);
				this.money -= 720;
			}else {
				System.out.println("요금이 부족하여 지하철을 탈 수 없습니다.");
			}
			
		}
		
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", age=" + age + ", money=" + money + "]";
	}
	
	
	
}
