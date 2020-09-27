package firstgrage.loop;

public class ForExam08 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10;i++){
			System.out.println(i+"번째 주사위 눈 값 :"+(int)(Math.random()*6+1));
		}
	}
}
