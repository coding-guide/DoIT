package exercise.chap07;

public class Employees {
//	생성되는 사원인스턴스에 고유번호를 부여하기위한 static int serialNumber
//	외부에서 고유번호를 수정할 수 없도록 private제한
	private static int serialNumber = 1001;
	
	public int employeeId;
	public String employeeName;
	public String employeePhoneNumber;
	
	public Employees(String employeeName,String employeePhoneNumber) {
		employeeId = serialNumber++;
		this.employeeName = employeeName;
		this.employeePhoneNumber = employeePhoneNumber;
	}//constructor
	
	@Override
	public String toString() {
		return " [사원번호=" + employeeId + ", 이름=" + employeeName + ", 전화번호="
				+ employeePhoneNumber + "]";
	}
	
}
