package exercise.chap06.transport;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void pickUpPerson(int money) {
		passengerCount++;
		this.money += money;
	}

	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", passengerCount=" + passengerCount + ", money=" + money + "]";
	}

	
}
