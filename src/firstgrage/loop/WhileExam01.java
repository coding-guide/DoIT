package firstgrage.loop;

public class WhileExam01 {
	public static void main(String[] args) {
		// 1 ~ 10까지 출력하시오.
		int i = 1;
		while (i <= 10) { //i변수는 { }블록 밖에 선언
			System.out.println("숫자 :" + i++);// i = i+1 or i++
		}
	}
}
