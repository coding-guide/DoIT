package exercise.chap07.itcompany;

public class ITCompanyTest {

	public static void main(String[] args) {
		ITCompany instance1 = ITCompany.getInstance();
		System.out.println(instance1);
		
		ITCompany instance2 = ITCompany.getInstance();
		System.out.println(instance2);
		
	}

}
