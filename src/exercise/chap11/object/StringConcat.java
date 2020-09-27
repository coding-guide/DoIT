package exercise.chap11.object;

public class StringConcat {

	public static void main(String[] args) {
		String str1 = new String("Bundang Management");
		String str2 = new String(" & ITSoftware");
		System.out.println("str1문자열 : "+str1);
		System.out.println("str2문자열 : "+str2);
		System.out.println("str1의 identityHashCode : "+System.identityHashCode(str1));
		System.out.println("str2의 identityHashCode : "+System.identityHashCode(str2));
		System.out.println("---------------------------------");
		System.out.println("문자열 연결 : str1 = str1.concat(str2)");
		System.out.println("---------------------------------");
		str1 = str1.concat(str2);
		System.out.println("str1문자열 : "+str1);
		System.out.println("str2문자열 : "+str2);
		System.out.println("str1의 identityHashCode : "+System.identityHashCode(str1));
		System.out.println("str2의 identityHashCode : "+System.identityHashCode(str2));
		
	}

}
