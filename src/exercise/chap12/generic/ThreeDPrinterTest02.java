package exercise.chap12.generic;

public class ThreeDPrinterTest02 {

	public static void main(String[] args) {

		ThreeDPrinter printer = new ThreeDPrinter();

		// new Plastic()으로 넘겨준 인자를 Object클래스가 받으므로 Plastic로 자동캐스팅됨
		printer.setMaterial(new Plastic());
		printer.doPrinting();

		// 3D 프린터에 설정된 재료를 확인하여 또 다른 작업을 하기 위해 아래와 같이 코드를 작성한다고 할때...
		// 3D 프린터에 설정된 재료가 Plastic인지 Power인지에 따라 형변환연산자를 써줘야 된다.
		Plastic material = (Plastic) printer.getMaterial();
		// 어떤 재료인지 확인하고 형변환을 해주기 위해서 아래와 같이 해주는게 정석.
		// if (printer.getMaterial() instanceof Plastic) {
		//    Plastic material = (Plastic) printer.getMaterial();
		//    System.out.println("재료는 " + material + "입니다.");
		// } else if (printer.getMaterial() instanceof Powder) {
		//    Powder material = (Powder) printer.getMaterial();
		//    System.out.println("재료는 " + material + "입니다.");
		// }
		// new Powder()으로 넘겨준 인자를 Object클래스가 받으므로 Powder로 자동캐스팅됨
		printer.setMaterial(new Powder());
		printer.doPrinting();
	}

}
