package exercise.chap08.customer;

public class GoldCustomer extends Customer{
//	GoldCustomer�� �θ�Customer�� �������(==�ν��Ͻ�����)�� ��� ����� �� ������
// ���η��̶�� ��������� �ϳ� �� ���´�.
	private double saleRatio; //������. ������ ������ ������ �� �������� �����Ͽ� �����Ѵ�.

	public GoldCustomer(String customerName) {
		// �θ�����ڴ� ��ӹ��� ���ϹǷ�, �θ�����ڰ� �ʿ��� �� super()�� �θ�����ڸ� ȣ���Ѵ�.
		super(customerName); 
		bonusRatio=0.03;  //�ڼ��� �θ�(Customer)�� �ν��Ͻ������� ��ӹ޴´�.
		customerGrade="Gold";
		saleRatio = 0.1;
	}//GoldCustomer constructor
	
	@Override
	public void payThePrice(int price) {
		super.accumulatePrice += price;
		pricePaid= (int) (price - price*saleRatio); //������ ������ �ݾ�
		bonusPoint += price*bonusRatio; // ���ʽ�����Ʈ ����
		
		pricePaid = price;
	}//payThePrice

	@Override
	public String toString() {
		return "[�̸�=" + customerName+", ���̵�=" + customerID + ", ���=" + customerGrade
				+ ", ���ʽ����κ���=" + bonusRatio + ", ���ʽ�����Ʈ="+ bonusPoint +", ������=" + saleRatio
				+ ", �������űݾ�(����)=" + accumulatePrice+ ", �����ұݾ�=" + pricePaid+"]";
	}//toString

}
