package exercise.chap08.customer;

public class CustomerTest {

	public static void main(String[] args) {
		
			Customer kimsunrye = new Customer("김선례");
			VIPCustomer leehyori = new VIPCustomer("이효리");
			GoldCustomer yoojaesuk = new GoldCustomer("유재석");
			VIPCustomer kwonyoungjun = new VIPCustomer("권용준");
			
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
