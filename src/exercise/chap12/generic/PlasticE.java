package exercise.chap12.generic;

public class PlasticE  extends Material{
	private String material;

	public PlasticE() {
		material = "Plastic";
	}

	@Override
	public String toString() {
		return material;
	}

}
