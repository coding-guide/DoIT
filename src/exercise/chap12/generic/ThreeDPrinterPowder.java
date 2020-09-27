package exercise.chap12.generic;

public class ThreeDPrinterPowder {
	// 3D프린터 재료가 처음부터 powder로 설정되어 잇다.
	private Powder material = new Powder();
	
	public void doPrinting() {
		System.out.println(material+"로 3D작품을 출력하고 있습니다.");
	}
	
}
