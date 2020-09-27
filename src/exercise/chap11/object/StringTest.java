package exercise.chap11.object;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "Information Technology & Software"; // 상수풀에 생성
		String str2 = "Information Technology & Software"; // str1과 같은 상수풀 메모리를 참조함
		String str3 = new String("Information Technology & Software"); // 힙 메모리에 할당하여 생성
		String str4 = new String("Information Technology & Software"); // str3와 다른 힙 메모리 할당하여 생성

		// System.identityHashCode()는 객체의 고유한 hashcode를 리턴하는 메소드
		System.out.println("str1의 identityHashCode : "+System.identityHashCode(str1)); 
		System.out.println("str2의 identityHashCode : "+System.identityHashCode(str2));
		System.out.println("str3의 identityHashCode : "+System.identityHashCode(str3));
		System.out.println("str4의 identityHashCode : "+System.identityHashCode(str4));
		System.out.println();
		                                       
		// 논리적으로  str1 ~ str4의 값은 모두 같다.
		// 따라서 String클래스에서 hashCode를  Override하여 물리적으로도 같은것으로 느낄수 있도록 재정의 하였다.
		// 일반적으로 equals()가 Override된 클래스는 hashCode도 Override한다.
		System.out.println("str1의 hashCode : "+str1.hashCode());
		System.out.println("str2의 hashCode : "+str2.hashCode());
		System.out.println("str3의 hashCode : "+str3.hashCode());
		System.out.println("str4의 hashCode : "+str4.hashCode());
		
	}
}