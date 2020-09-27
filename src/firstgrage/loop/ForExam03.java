package firstgrage.loop;

import java.util.Scanner;

public class ForExam03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			System.out.println("숫자 N을 입력하세요(단, -1은 프로그램 종료)>>>");
			int inputNumber = in.nextInt();
			if (inputNumber == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("---0부터 숫자 N까지의 수 나열하기---");
			for (int i = 0; i <= inputNumber; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
