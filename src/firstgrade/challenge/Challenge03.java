package firstgrade.challenge;

public class Challenge03 {

	public static void main(String[] args) {
// 5*2단 숫자탑 찍기
//		    1 (4칸)
//		   123 (3칸)
//		  12345 (2칸)
//		 1234567 (1칸)
//		123456789 (0칸)
//		123456789 (0칸)
//		 1234567 (1칸)
//		  12345 (2칸)
//		   123 (3칸)
//		    1 (4칸)
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
		for (int row = last; row >= 1; row--) {
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
