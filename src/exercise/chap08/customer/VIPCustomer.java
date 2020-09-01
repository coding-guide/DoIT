package exercise.chap08.customer;

public class VIPCustomer extends Customer{
//	VIPCustomer�� �θ�Customer�� �������(==�ν��Ͻ�����)�� ��� ����� �� ������
// ���η��̶�� ��������� �ϳ� �� ���´�.
	private double saleRatio; //������. ������ ������ ������ �� �������� �����Ͽ� �����Ѵ�.

	public VIPCustomer(String customerName) {
		// �θ�����ڴ� ��ӹ��� ���ϹǷ�, �θ�����ڰ� �ʿ��� �� super()�� �θ�����ڸ� ȣ���Ѵ�.
		super(customerName); 
		bonusRatio=0.05;  //�ڼ��� �θ�(Customer)�� �ν��Ͻ������� ��ӹ޴´�.
		customerGrade="VIP";
		saleRatio = 0.15;
	}//GoldCustomer constructor
	
	@Override
	public void payThePrice(int price) {
		super.accumulatePrice += price;
		pricePaid= (int) (price- price*saleRatio); //������ ������ �ݾ�
		bonusPoint += price*bonusRatio; // ���ʽ�����Ʈ ����
	}//payThePrice

	@Override
	public String toString() {
		return "[�̸�=" + customerName+", ���̵�=" + customerID + ", ���=" + customerGrade
				 + ", ���ʽ����κ���=" + bonusRatio + ", ���ʽ�����Ʈ="+ bonusPoint
				 +", ������=" + saleRatio+ ", �������űݾ�(����)=" + accumulatePrice+ ", �����ұݾ�=" + pricePaid+"]";
	}//toString

}
