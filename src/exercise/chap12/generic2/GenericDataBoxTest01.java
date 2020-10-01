package exercise.chap12.generic2;

public class GenericDataBoxTest01 {

	public static void main(String[] args) {

		DataBox<String> data1 = new DataBox<String>("kimsunrye");
		DataBox<Integer> data2 = new DataBox<Integer>(1000);
		System.out.println(data1.getData());
		System.out.println(data2.getData());
		data1.setData("change");
		data2.setData(2000);
		System.out.println(data1.getData());
		System.out.println(data2.getData());
	}

}
