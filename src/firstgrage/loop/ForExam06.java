package firstgrage.loop;

import java.util.Scanner;

public class ForExam06 {
	public static void main(String[] args) {
//		사용자가 정수 N을 입력하면 N까지 2의 배수의 개수와 합을 구하시오.
		Scanner in = new Scanner(System.in);
		System.out.println("정수N을 입력하세요>>>");
		int inputN = in.nextInt();
		System.out.println("===="+inputN+"까지 2의 배수입니다.====");
		int count=0;
		int sum=0;
		for(int i = 1; i<=inputN;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				count++;
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("2의 배수의 개수 :"+count);
		System.out.println(inputN+"까지 2의 배수의 합 :"+sum);
		in.close();
	}
}
