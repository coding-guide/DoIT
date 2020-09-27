package exercise.chap12.generic;

public class ThreeDPrinter {
	private Object material;

	public Object getMaterial() {
		if (material != null) {
			return material;
		} else {
			return "재료가 설정되지 않았습니다.";
		}
	}

	public void setMaterial(Object material) {
		this.material = material;
	}

	public void doPrinting() {
		if (material != null) {
			System.out.println(material + "로 3D작품을 출력하고 있습니다.");
		} else {
			System.out.println("재료를 넣어주세요");
		}
	}

}
