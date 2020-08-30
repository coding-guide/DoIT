package exercise.chap07;

public class EmployeesTest {

	public static void main(String[] args) {
		Employees[] employeesList = new Employees[20];
		employeesList[0] = new Employees("권용준","010-3312-3312");
		employeesList[1] = new Employees("김재현","010-9914-9914");
		employeesList[2] = new Employees("김준성","010-5801-5801");
		employeesList[3] = new Employees("박건호","010-9557-9557");
		employeesList[4] = new Employees("박성윤","010-7193-7193");
		employeesList[5] = new Employees("강동현","010-9533-9533");
		employeesList[6] = new Employees("강응찬","010-2921-2921");
		employeesList[7] = new Employees("김석현","010-2338-2338");
		employeesList[8] = new Employees("김우혁","010-5318-5318");
		employeesList[9] = new Employees("김윤호","010-3086-3086");
		
		System.out.println(" --------------ITCompany 사원정보 -------------");
		int i = 0; 
		while(employeesList[i] != null) {
			System.out.println(employeesList[i++]);
		}
		
	}

}
