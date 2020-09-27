package firstgrage.loop;

import java.util.Scanner;

public class ForExam07 {
	public static void main(String[] args) {
//		사용자로부터 정수 N을 입력은 수에따라 ‘홀수’, ‘짝수’를 출력하고 0을 입력하면 프로그램을 종료하시오
		System.out.println("짝수, 홀수를 판별하는 프로그램입니다.");
		Scanner in = new Scanner(System.in);
		int inputN;
		do {
			System.out.println("정수 N을 입력하세요>>>");
			inputN = in.nextInt();
			if (inputN % 2 == 0) {
				System.out.println(inputN + "은 짝수입니다.");
			} else {
				System.out.println(inputN + "은 홀수입니다.");
			}
		} while (inputN != 0);
		in.close();
	}
}
