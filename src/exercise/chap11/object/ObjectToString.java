package exercise.chap11.object;

class NewClassType{
	
}

public class ObjectToString {

	public static void main(String[] args) {
		// Object클래스의 doc문서
		// toString()메서드의 내부
		//  getClass().getName() + '@' + Integer.toHexString(hashCode())
		NewClassType nc = new NewClassType();
		System.out.println(nc);
		System.out.println(nc.getClass().getName()+'@'+Integer.toHexString(nc.hashCode()));
		System.out.println(nc.toString());

	}

}
