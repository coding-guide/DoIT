package exercise.chap07.itcompany;

public class ITCompany {
//	ITCompany instance생성
	private static ITCompany instance = new ITCompany();

	private ITCompany() {
		
	}//외부에서 생성하지 못하는 생성자
	
	public static ITCompany getInstance() {
		if(instance==null) {
			instance = new ITCompany();
		}
		return instance;
	}//인스턴스를 생성해서 넘겨주는 메서드

	@Override
	public String toString() {
		return "생성된 ITCompany 인스턴스의 메모리 주소는 " + hashCode() + "입니다.";
	}
	
		
}
