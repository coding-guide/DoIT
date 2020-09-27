package firstgrade.challenge;

import java.util.Scanner;

public class Challenge02 {
	public static void main(String[] args) {
//		1+(1*2)+(1*2*3)+(1*2*3*4)+ …+(1*2*3*…*N) = ?
		Scanner in = new Scanner(System.in);
		System.out.println("1+(1*2)+(1*2*3)+ …+(1*2*…*N)를 위한 정수  N을 입력하세요>>>");
		int n = in.nextInt();
		int hang;
		int sum=0;
		for(int i = 1; i<=n ; i++) {
			hang=1;
			for(int j = 1; j<=i;j++) {
				hang = hang*j;
			}
			sum = sum + hang;
		}
		System.out.println(n+"까지의 연산결과는 = "+sum);

	}

}
