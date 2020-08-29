package exercise.chap06.card;

public class CreateCardTest {

	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();
		OneCard card1 = company.createOneCard("권용준");
		OneCard card2 = company.createOneCard("김재현");
		OneCard card3 = company.createOneCard("김준성");
		TwoCard card4 = company.createTwoCard("강동현");
		TwoCard card5 = company.createTwoCard("강응찬");
		TwoCard card6 = company.createTwoCard("김석현");
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		System.out.println(card4);
		System.out.println(card5);
		System.out.println(card6);
		
	}

}
