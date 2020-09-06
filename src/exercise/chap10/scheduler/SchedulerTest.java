package exercise.chap10.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("R : 한명씩 차례대로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객에게 할당");
		System.out.println("전화 상담 할당 방식을 선택하세요>>>");

		// 입력값에 따라 다형성을 이용하여 인스터스를 생성해서 대입하기 위해 준비
		Scheduler schedule = null;

//		System.in.read();는 콘솔창에서 입력받는 값을 모두 아스키코드값으로 읽어들임 
		int ch = System.in.read();
		switch (ch) {
		case 'r':
		case 'R':
			schedule = new RoundRobin();
			break;
		case 'l':
		case 'L':
			schedule = new LeastJob();
			break;
		case 'p':
		case 'P':
			schedule = new PriorityAllocation();
			break;
		default:
			System.out.println("잘못 선택하셨습니다.");
			return;//프로그램을 바로 종료하기 위함
		}
		schedule.getNextCall();
		schedule.sendCallToAgent();

	}

}
