package exercise.chap12.generic;

public class ThreeDPrinterTestE {

	public static void main(String[] args) {

		// ThreeDPrinterGeneric<Plastic> printer = new ThreeDPrinterGeneric<>(new
		// Plastic());

		ThreeDPrinterGenericE<PlasticE> printer = new ThreeDPrinterGenericE<>();
		printer.setMaterial(new PlasticE());
		printer.doPrinting();
		System.out.println(printer.getMaterial());

		ThreeDPrinterGenericE<PowderE> printer2 = new ThreeDPrinterGenericE<>();
		printer2.setMaterial(new PowderE());
		printer2.doPrinting();
		
//		ThreeDPrinterGenericE<Water> printer3 = new ThreeDPrinterGeneric<>();

	}

}
