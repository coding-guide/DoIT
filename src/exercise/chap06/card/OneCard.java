package exercise.chap06.card;

public class OneCard {
	final String CARDNAME="One Card";
	int cardId;
	String userName;
	
	
	public OneCard(int serialNumber, String userName) {
		cardId = serialNumber;
		this.userName = userName;
	}


	@Override
	public String toString() {
		return "OneCard [cardName=" + CARDNAME + ", cardId=" + cardId + ", userName=" + userName + "]";
	}
	
}
