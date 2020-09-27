package firstgrage.loop;

import java.util.Scanner;

public class ForExam05 {
	public static void main(String[] args) {
//		정수 N을 입력받아 1~N사이의 3의 배수를 뺀 나머지 정수를 출력하시오.
		System.out.println("정수 N을 입력하시오.>>>");
		Scanner in = new Scanner(System.in);
		int inputN = in.nextInt();
		System.out.println("=====" + inputN + "까지 3의 배수를 제외한 모든 수=====");
		for (int i = 1; i <= inputN; i++) {
			if (i % 3 == 0) {
//				반복문에서 특정 조건을 수행하지 않고 건너뛸대 사용함.
				continue;
			}
			System.out.print(i + " ");
		}
		in.close();
	}
}
