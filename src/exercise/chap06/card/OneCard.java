package exercise.chap06.card;

public class OneCard {
	final String cardName="One Card";
	int cardId;
	String userName;
	
	
	public OneCard(int serialNumber, String userName) {
		cardId = serialNumber;
		this.userName = userName;
	}


	@Override
	public String toString() {
		return "OneCard [cardName=" + cardName + ", cardId=" + cardId + ", userName=" + userName + "]";
	}
	
}
