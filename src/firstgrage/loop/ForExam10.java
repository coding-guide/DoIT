package firstgrage.loop;

public class ForExam10 {

	public static void main(String[] args) {
// 숫자탑 찍기
		for(int row = 1 ; row <=10;row++) {
			for(int col=1;col <=row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
