package exercise.chap08.customer;

import java.util.ArrayList;

public class CustomerTest02 {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<Customer>();
//		list�� Customer�� �ڷḦ ���� �� �ִ� �ν��Ͻ� �����̴�. �� Customer,GoldCustomer,VIPCustomer
		list.add(new Customer("�輱��"));
		list.add(new VIPCustomer("��ȿ��"));
		list.add(new GoldCustomer("���缮"));
		list.add(new VIPCustomer("�ǿ���"));
		list.add(new VIPCustomer("������"));
		
//		Customer,GoldCustomer,VIPCustomerŬ������ payThePrice�� �������̵�Ǿ� �ִ�.
//		���� �ν��Ͻ��� Ŭ����Ÿ�Կ� �´� payThePrice�޼��尡 ȣ��Ǿ� �����Ѵ�.=> ������
		for (Customer customer : list) {
			customer.payThePrice(100000);
			customer.payThePrice(200000);
		}
		
//		Customer,GoldCustomer,VIPCustomerŬ������ toString�� �������̵�Ǿ� �ִ�.
//		���� �ν��Ͻ��� Ŭ����Ÿ�Կ� �´� toString�޼��尡 ȣ��Ǿ� �����Ѵ�.
		for (Customer customer : list) {
//			customer�� � Ŭ����Ÿ�������� ���� �ش�Ŭ������ toString�� ȣ��Ǵ°�=> ������
			System.out.println(customer);
		}
	}

}
