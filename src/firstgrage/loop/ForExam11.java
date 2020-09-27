package firstgrage.loop;

import java.util.Scanner;

public class ForExam11 {

	public static void main(String[] args) {
		final int MAX = 10;// MAX값을 조정하면서 cnt의 변화를 잘 살펴보세요.
		Scanner in = new Scanner(System.in);
		int number = (int) (Math.random() * 1000 + 1);
		System.out.println("1~1000사이 행운의 숫자는?");
//		System.out.println(number); //확인을 위한 숫자 출력
		int cnt = 1;
		while (cnt <= MAX) {
			System.out.println(">>>");
			int inputNumber = in.nextInt();
			if (inputNumber > number) {
				System.out.println("입력한 수보다 작습니다.");
			} else if (inputNumber < number) {
				System.out.println("입력한 수보다 큽니다.");
			} else {
				System.out.println("축하합니다.^^ 정답입니다~~~");
				break;
			}
			cnt++;
		} // while
		if (cnt > MAX) {
			System.out.println("실패~");
		}
	}
}
