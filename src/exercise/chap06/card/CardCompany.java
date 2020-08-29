package exercise.chap06.card;

public class CardCompany {
//	회사에서 발급하는 카드의 시리얼번호. 모든 카드의 종류에 상관없이 고유한 카드 번호를 갖는다.
//	외부에서 카드번호에 대한 접근을 차단하기 위해 private로 접근제한을 둔다.
	private static int serialNumber = 1001;
	
//	외부에서 접근할 수 없도록 private로, 유일한 인스턴스를 만들기 위해 static으로
	private static CardCompany instance = new CardCompany();
	
//	외부에서 생성자를 호출하게 되면 여러개의 인스턴스를 생성할 수 있으므로  private로 선언. 즉 클래스 내부에서만 사용할 수 있도록 한다.
//	즉, Test클래스에서 OneCardCompany company = new OneCardCompany(); 를 사용할 수 없다.
	private CardCompany() {
		
	}
	
//	외부에서 생성된 인스턴스를 사용할 수 있는 public메서드를 만든다.
//	단, 싱글톤패턴으로 구현된 인스턴스를 가져와야 되므로 프로그램구동과 함게 인스턴스가 생성된것을 반환하는 메서디이므로 static으로 선언.
	public static CardCompany getInstance() {
		//instance가 생성이 안될리는 없지만, 생성이 안되었다면 인스턴스를 만들라는 코드로 방어적인 코드임
		if(instance==null) 
			instance = new CardCompany();
		return instance;
	}
	
	public OneCard createOneCard(String name){
		OneCard card = new OneCard(serialNumber++, name);
		return card;
	}
	
	public TwoCard createTwoCard(String name){
		TwoCard card = new TwoCard(serialNumber++, name);
		return card;
	}
	
}
