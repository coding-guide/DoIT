package exercise.chap07;

public class ITCompany {
//	사원번호를 부여하기 위한 static 변수
	private static ITCompany instance = new ITCompany();

	private ITCompany() {
		
	}//외부에서 생성하지 못하는 생성자
	
	public static ITCompany getInstance() {
		if(instance==null) {
			instance = new ITCompany();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "생성된 ITCompany 인스턴스의 메모리 주소는 " + hashCode() + "입니다.";
	}
	
		
}
