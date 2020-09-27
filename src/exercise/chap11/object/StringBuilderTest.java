package exercise.chap11.object;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder str1= new StringBuilder("Bundang Management");
		StringBuilder str2 = new StringBuilder(" & ITSoftware");
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str1의 identityHashCode : "+System.identityHashCode(str1));
		System.out.println("str2의 identityHashCode : "+System.identityHashCode(str2));
		System.out.println("------------------------------------");
		System.out.println("문자열 연결 : str1.append(str2)");
		System.out.println("------------------------------------");
		str1.append(str2);
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str1의 identityHashCode : "+System.identityHashCode(str1));
		System.out.println("str2의 identityHashCode : "+System.identityHashCode(str2));
	}

}
