package exercise.chap06.transport;

public class TakeTrans {

	public static void main(String[] args) {
		Person person = new Person("송지효", 30, 10000);
		Bus bus = new Bus(1005);
		Subway subway = new Subway("분당선");
		System.out.println(person);
		System.out.println(bus);
		System.out.println(subway);
		person.takeBus(bus);
		person.takeBus(bus);
		person.takeBus(bus);
		person.takeBus(bus);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		System.out.println("-----------------------------------");
		System.out.println(person);
		System.out.println(bus);
		System.out.println(subway);
		System.out.println("-----------------------------------");
		person.takeSubway(subway);
		
	}

}
