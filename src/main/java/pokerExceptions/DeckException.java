package pokerExceptions;

public class DeckException extends Exception {
	private int deck;
	public DeckException(int deck){
		this.deck = deck;
	}
	public int getDeck(){
		return deck;
	}
	

}
