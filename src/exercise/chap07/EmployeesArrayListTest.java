package exercise.chap07;

import java.util.ArrayList;

public class EmployeesArrayListTest {

	public static void main(String[] args) {
		ArrayList<Employees> list = new ArrayList<Employees>();
		list.add(new Employees("권용준","010-3312-3312"));
		list.add(new Employees("김재현","010-3312-3312"));
		list.add(new Employees("김준성","010-3312-3312"));
		list.add(new Employees("박건호","010-3312-3312"));
		list.add(new Employees("박성윤","010-3312-3312"));
		list.add(new Employees("강동현","010-3312-3312"));
		list.add(new Employees("강응찬","010-3312-3312"));
		list.add(new Employees("김석현","010-3312-3312"));
		list.add(new Employees("김우혁","010-3312-3312"));
		list.add(new Employees("김윤호","010-3312-3312"));
		
		System.out.println(" --------------ITCompany 사원정보 -------------");
		for (Employees employees : list) {
			System.out.println(employees);
		}
		
	}

}
