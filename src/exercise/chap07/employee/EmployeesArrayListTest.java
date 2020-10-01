package exercise.chap07.employee;

import java.util.Scanner;

public class EmployeesArrayListTest {

	public static void main(String[] args) {
		EmployeesList list = EmployeesList.getInstance();
		
		list.enrolledEmployees();//기존사원 등록
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			list.displayMenu(); //메뉴 선택
			int menu = in.nextInt();
			
			switch(menu) {
//			사원정보표시
			case 1:
				list.showEmployees();
				break;
				
//			신규사원등록
			case 2:
				System.out.println("이름을 입력하세요>>>");
				String name = in.next();
				System.out.println("전화번호를 입력하세요>>>");
				String phoneNumber = in.next();
				list.addEmployees(new Employees(name,phoneNumber));
				break;
				
//			사원삭제
			case 3:
				System.out.println("삭제할 사원 아이디를 입력하세요>>>");
				int id = in.nextInt();
				if(!list.removeEmployees(id)) {
					System.out.println("사원을 삭제하지 못하였습니다.");
				}
				break;
			case 4:
				System.out.println("시스템을 종료합니다.");
				in.close();
				System.exit(0);
				
			default:
				System.out.println("잘못선택하셨습니다.");
		
			}
			
		}//while
		
	}//main()
	
}
