package exercise.chap14.exception;

public class ExceptionTest01 {

	public static void main(String[] args) {
		
		try {
			int num = Integer.parseInt(args[0]);
			System.out.println("100 / " + num + "= " + 100 / num);
		} catch(Exception e) {
			System.out.println(e);
		}
//		try {
//			int num = Integer.parseInt(args[0]);
////			System.out.println(num);
//			System.out.println("100 / " + num + "= " + 100 / num);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//			System.out.println("아규먼트값을 설정하시기 바랍니다.");
//		} catch (NumberFormatException e) {
//			System.out.println(e);
//			System.out.println("아규먼트값은 정수입니다.");
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//			System.out.println("0이 아닌 정수로 아규먼트값을 설정하시기 바랍니다.");
//		}

	}

}
