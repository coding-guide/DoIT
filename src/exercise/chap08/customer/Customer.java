package exercise.chap08.customer;

public class Customer {
	//� ����� ���̵� ��ID�� �����ϴ�. �������� ���� ������ȣ�� �Ҵ��ϱ� ���� serial number
	private static int serialID=10001; 
	
//	protected ���������ڴ� ���� ��Ű���� �ִ� Ŭ����, ��ӹ��� �ڼ�Ŭ���������� ������ �� �ִ� ������ �ο��ȴ�.
	protected int customerID;
	protected String customerName;
	protected String customerGrade; 
	protected int pricePaid; //������ ����
	protected int accumulatePrice;//������ �ݾ��� ����
	protected int bonusPoint; // ���ʽ� ����Ʈ
	protected double bonusRatio; // ���ʽ� ���� ����

	public Customer(String customerName) {//���̸����� ����
		this.customerID = serialID++;
		this.customerName = customerName;
		this.customerGrade="SILVER"; //�⺻���
		this.bonusRatio=0.01; // �⺻ ���ʽ� ��������
	}//Customer constructor
	
	public void payThePrice(int price) {
		accumulatePrice+=price;
		bonusPoint += price*bonusRatio; // ���ʽ�����Ʈ ����
		pricePaid = price;
	}

	@Override
	public String toString() {
		return "[�̸�=" + customerName+", ���̵�=" + customerID + ", ���=" + customerGrade
				 + ", ���ʽ����κ���=" + bonusRatio + ", ���ʽ�����Ʈ="+ bonusPoint
				 + ", �������űݾ�(����)=" + accumulatePrice+ ", �����ұݾ�=" + pricePaid+"]";
	}
	
}
