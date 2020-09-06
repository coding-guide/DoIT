package exercise.chap06.card;

public class TwoCard {
	final String CARDNAME="Two Card";
	int cardId;
	String userName;
	
	public TwoCard(int serialNumber, String userName) {
		cardId = serialNumber;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "TwoCard [cardName=" + CARDNAME + ", cardId=" + cardId + ", userName=" + userName + "]";
	}
	
}
