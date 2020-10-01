package exercise.chap12.generic;

public class ThreeDPrinterGenericE<T extends Material> {
	private T material;
	
	//public ThreeDPrinterGeneric(T t) {
	//	material = t;
	//}

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
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
