package exercise.chap12.generic;

public class ThreeDPrinterPlastic {
	// 3D프린터 재료가 처음부터 palstic으로 설정되어 잇다.
	private Plastic material = new Plastic();

	public void doPrinting() {
		System.out.println(material+"로 3D작품을 출력하고 있습니다.");
	}

}
