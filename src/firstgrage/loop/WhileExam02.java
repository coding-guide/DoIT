package firstgrage.loop;

import java.util.Scanner;

public class WhileExam02 {
	public static void main(String[] args) {
//		키보드로 정수 N을 입력받아 0부터 N까지 출력하시오.
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 N을 입력하세요>>>");
		int inputNumber = in.nextInt();
		System.out.println("---0부터 숫자 N까지의 수 나열하기---");
		int i = 0;
		while(i <= inputNumber) {
			System.out.print(i + " ");
			i++;
		}
	}
}
