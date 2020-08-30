package exercise.chap07.employee;

import java.util.ArrayList;

public class EmployeesList {
//	employees를 관리하기 위한 단 하나의 인스턴스 생성
	private static EmployeesList instance = new EmployeesList();
	public ArrayList<Employees> list = new ArrayList<Employees>();
	
//	외부에서의 생성을 차단
	private EmployeesList() {
		
	}
	
	public static EmployeesList getInstance() {
		if(instance==null) {
			instance= new EmployeesList();
		}
		return instance;
	}//getInstance()
	
	public void addEmployees(Employees employees) {
		list.add(employees);
	}//addEmployees()
	
	public boolean removeEmployees(int employeeId) {
		boolean removed = false;
		for (Employees employees : list) {
			if(employees.getEmployeeId() == employeeId) {
//				list.indexOf(employees);
				System.out.println(employees+"삭제함");
				list.remove(employees);
				removed=true;
				break;
			}
		}
		return removed;
	}//removeEmployees
	
	public void enrolledEmployees() {
		list.add(new Employees("권용준","010-3312-3312"));
		list.add(new Employees("김재현","010-9914-9914"));
		list.add(new Employees("김준성","010-5801-5801"));
		list.add(new Employees("박건호","010-9557-9557"));
		list.add(new Employees("박성윤","010-7193-7193"));
		list.add(new Employees("강동현","010-9533-9533"));
		list.add(new Employees("강응찬","010-2921-2921"));
		list.add(new Employees("김석현","010-2338-2338"));
		list.add(new Employees("김우혁","010-5318-5318"));
		list.add(new Employees("김윤호","010-3086-3086"));
	}//enrolledEmployees
	
	public void displayMenu() {
		System.out.println("-------- ITCompany사원정보시스템 -----------");
		System.out.println("- 1. 사원정보조회                                 ");
		System.out.println("- 2. 신규사원등록                              ");
		System.out.println("- 3. 사원삭제                            ");
		System.out.println("- 4. 사원정보시스템 종료                             ");
		System.out.println("- --------------------------------------" );
		System.out.println(">>>>");
	}//displayMenu()
	
	public void showEmployees() {
		System.out.println(" --------------ITCompany 사원정보 -------------");
		for (Employees employees : list) {
			System.out.println(employees);
		}
	}//showEmployees()
	

}//EmployeesList class
