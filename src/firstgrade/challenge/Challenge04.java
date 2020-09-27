package firstgrade.challenge;

import java.util.Scanner;

public class Challenge04 {

	public static void main(String[] args) {
//		1단부터 입력한 단수까지 한 행에 5단씩 출력되는 구구단 프로그램을 완성하시오.
		Scanner in = new Scanner(System.in);
		System.out.println("출력할 단수를 입력하세요");
		int n = in.nextInt();

		for (int i = 0; i <= n / 5; i++) { // i는 행을 의미
			int max = i * 5 + 5 < n ? i * 5 + 5 : n;
			for (int j = 1; j <= 9; j++) {
				int dan = i * 5 + 1;
				for (int k = dan; k <= max; k++) {
					System.out.print(k + " X " + j + " = " + (k * j) + "\t");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		in.close();
	}
}
