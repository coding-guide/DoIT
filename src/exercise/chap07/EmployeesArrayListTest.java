package exercise.chap07;

import java.util.ArrayList;

public class EmployeesArrayListTest {

	public static void main(String[] args) {
		ArrayList<Employees> list = new ArrayList<Employees>();
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
		
		System.out.println(" --------------ITCompany 사원정보 -------------");
		for (Employees employees : list) {
			System.out.println(employees);
		}
		
	}

}
