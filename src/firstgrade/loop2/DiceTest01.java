package firstgrade.loop2;

import java.util.Scanner;

public class DiceTest01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("총 10번의 주사위를 던질 수 있습니다. 한번당 정답을 맞출 기회는 3번!");
		System.out.println("게이머의 이름을 입력하세요>>>>");
		String palyer = in.nextLine();
		int jumsu = 0;
		for (int gameCount = 1; gameCount <= 2; gameCount++) {
			System.out.println("******" + gameCount + "번째 주사위를 던집니다.******");
			int valueOfDice = (int) (Math.random() * 6 + 1);
			for (int i = 3; i >= 1; i--) {
				System.out.println("주사위 눈값은?>>>");
				int answerOfDice = in.nextInt();
				if (valueOfDice == answerOfDice) {
					jumsu += i * 10;
					System.out.println("맞았습니다." + valueOfDice);
					break;
				} else {
					System.out.println("틀렸습니다.");
				}
			}
			System.out.println(palyer + "님의 점수는 : " + jumsu);
		}
	}
}
