package firstgrage.loop;

public class ForExam09 {

	public static void main(String[] args) {
// 5단 숫자탑 찍기
//		    1 (4칸)
//		   123 (3칸)
//		  12345 (2칸)
//		 1234567 (1칸)
//		123456789 (0칸)
		int last = 5;
		for (int row = 1; row <= last; row++) {
			for (int blank = 1; blank <= last - row; blank++) {
				System.out.print(" ");
			}
			for (int cnt = 1; cnt < row * 2; cnt++) {
				System.out.print(cnt);
			}
			System.out.println();
		}
	}
}
