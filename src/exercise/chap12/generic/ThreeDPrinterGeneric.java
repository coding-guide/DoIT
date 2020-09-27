package exercise.chap12.generic;

public class ThreeDPrinterGeneric<T> {
	private T material;
	
	//public ThreeDPrinterGeneric(T t) {
	//	material = t;
	//}

	public T getMaterial() {
		if (material != null) {
			return material;
		} else {
			return (T)"재료가 설정되지 않았습니다.";
		}
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
