package exercise.chap08.customer;

import java.util.ArrayList;

public class CustomerTest02 {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<Customer>();
//		list는 Customer형 자료를 담을 수 있는 인스턴스 변수이다. 즉 Customer,GoldCustomer,VIPCustomer
		list.add(new Customer("김선례"));
		list.add(new VIPCustomer("이효리"));
		list.add(new GoldCustomer("유재석"));
		list.add(new VIPCustomer("권용준"));
		list.add(new VIPCustomer("강동현"));
		
//		Customer,GoldCustomer,VIPCustomer클래스에 payThePrice가 오버라이드되어 있다.
//		따라서 인스턴스별 클래스타입에 맞는 payThePrice메서드가 호출되어 실행한다.=> 다형성
		for (Customer customer : list) {
			customer.payThePrice(100000);
			customer.payThePrice(200000);
		}
		
//		Customer,GoldCustomer,VIPCustomer클래스에 toString이 오버라이드되어 있다.
//		따라서 인스턴스별 클래스타입에 맞는 toString메서드가 호출되어 실행한다.
		for (Customer customer : list) {
//			customer가 어떤 클래스타입인지에 따라 해당클래스의 toString이 호출되는것=> 다형성
			System.out.println(customer);
		}
	}

}
