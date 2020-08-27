package exercise.chap06.transport;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void pickUpPerson(int money) {
		passengerCount++;
		this.money += money;
	}

	@Override
	public String toString() {
		return "Subway [lineNumber=" + lineNumber + ", passengerCount=" + passengerCount + ", money=" + money + "]";
	}

}
