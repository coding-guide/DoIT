package exercise.chap08.customer;

public class CustomerTest {

	public static void main(String[] args) {
		
			Customer kimsunrye = new Customer("�輱��");
			VIPCustomer leehyori = new VIPCustomer("��ȿ��");
			GoldCustomer yoojaesuk = new GoldCustomer("���缮");
			VIPCustomer kwonyoungjun = new VIPCustomer("�ǿ���");
			
			kimsunrye.payThePrice(10000);
			leehyori.payThePrice(10000);
			yoojaesuk.payThePrice(10000);
			kwonyoungjun.payThePrice(10000);
			
			System.out.println(kimsunrye);
			System.out.println(leehyori);
			System.out.println(yoojaesuk);
			System.out.println(kwonyoungjun);
			
	}

}
