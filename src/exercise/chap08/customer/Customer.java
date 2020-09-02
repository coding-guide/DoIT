package exercise.chap08.customer;

public class Customer {
	//어떤 등급의 고객이든 고객ID는 유일하다. 고객생성시 고객의 고유번호를 할당하기 위한 serial number
	private static int serialID=10001; 
	
//	protected 접근제어자는 같은 패키지에 있는 클래스, 상속받은 자손클래스에서도 접근할 수 있는 권한이 부여된다.
	protected int customerID;
	protected String customerName;
	protected String customerGrade; 
	protected int pricePaid; //지불한 가격
	protected int accumulatePrice;//지불한 금액의 누적
	protected int bonusPoint; // 보너스 포인트
	protected double bonusRatio; // 보너스 적립 비율

	public Customer(String customerName) {//고객이름으로 생성
		this.customerID = serialID++;
		this.customerName = customerName;
		this.customerGrade="SILVER"; //기본등급
		this.bonusRatio=0.01; // 기본 보너스 적립비율
	}//Customer constructor
	
	public void payThePrice(int price) {
		accumulatePrice+=price;
		bonusPoint += price*bonusRatio; // 보너스포인트 적립
		pricePaid = price;
	}

	@Override
	public String toString() {
		return "[이름=" + customerName+", 아이디=" + customerID + ", 등급=" + customerGrade
				 + ", 보너스포인비율=" + bonusRatio + ", 보너스포인트="+ bonusPoint
				 + ", 누적구매금액(정가)=" + accumulatePrice+ ", 실지불금액=" + pricePaid+"]";
	}
	
}
