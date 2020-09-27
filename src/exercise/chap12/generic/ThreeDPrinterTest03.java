package exercise.chap12.generic;

public class ThreeDPrinterTest03 {

	public static void main(String[] args) {

		// ThreeDPrinterGeneric<Plastic> printer = new ThreeDPrinterGeneric<>(new
		// Plastic());

		ThreeDPrinterGeneric<Plastic> printer = new ThreeDPrinterGeneric<>();
		printer.setMaterial(new Plastic());
		printer.doPrinting();
		System.out.println(printer.getMaterial());

		ThreeDPrinterGeneric<Powder> printer2 = new ThreeDPrinterGeneric<>();
		printer2.setMaterial(new Powder());
		printer2.doPrinting();

	}

}
