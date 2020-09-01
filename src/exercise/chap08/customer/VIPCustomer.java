package exercise.chap08.customer;

public class VIPCustomer extends Customer{
//	VIPCustomer는 부모Customer의 멤버변수(==인스턴스변수)를 모두 사용할 수 있으며
// 할인률이라는 멤버변수를 하나 더 갖는다.
	private double saleRatio; //할인율. 물건의 가격을 지불할 시 할인율을 적용하여 지불한다.

	public VIPCustomer(String customerName) {
		// 부모생성자는 상속받지 못하므로, 부모생성자가 필요할 시 super()로 부모생성자를 호출한다.
		super(customerName); 
		bonusRatio=0.05;  //자손은 부모(Customer)의 인스턴스변수를 상속받는다.
		customerGrade="VIP";
		saleRatio = 0.15;
	}//GoldCustomer constructor
	
	@Override
	public void payThePrice(int price) {
		super.accumulatePrice += price;
		pricePaid= (int) (price- price*saleRatio); //할인율 적용한 금액
		bonusPoint += price*bonusRatio; // 보너스포인트 적립
	}//payThePrice

	@Override
	public String toString() {
		return "[이름=" + customerName+", 아이디=" + customerID + ", 등급=" + customerGrade
				 + ", 보너스포인비율=" + bonusRatio + ", 보너스포인트="+ bonusPoint
				 +", 할인율=" + saleRatio+ ", 누적구매금액(정가)=" + accumulatePrice+ ", 실지불금액=" + pricePaid+"]";
	}//toString

}
