package firstgrage.loop;

import java.util.Scanner;

public class ForExam04 {
	public static void main(String[] args) {
//	정수 N을 입력받아 입력받은 수의 2배값을 출력하고 0을 입력하면 프로그램을 종료하시오.
		Scanner in = new Scanner(System.in);
		for (;;) {
			System.out.println("정수 N을 입력하세요.(단,0은 프로그램 종료)>>>");
			int inputNumer = in.nextInt();
			if (inputNumer == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("입력된 숫자 " + inputNumer + "의 2배수 :" + inputNumer * 2);
		}
		in.close();
	}
}
