package exercise.chap12.generic;

public class ThreeDPrinterTest01 {

	public static void main(String[] args) {
		ThreeDPrinterPlastic plastic3D = new ThreeDPrinterPlastic();
		ThreeDPrinterPowder powder3D = new ThreeDPrinterPowder();
		plastic3D.doPrinting();
		powder3D.doPrinting();
		// 3D 프린터의 기능은 같은데, 재료에 따라 같은 기능을 하는 클래스를 계속 만들어야 되는 문제가 있음
		// 하나의 3D프린터 객체를 통해 doPrinting()메서드가 실행될 때
		// 재료가 어떤걸로 설정되어 있느냐에 따라 재료에 맞게 작품이 산출되게 하고 하고자 한다. 
		// ThreeDPrinter클래스를 재료에 따라 작동할 수 있도록 만들자.
		
	}

}
