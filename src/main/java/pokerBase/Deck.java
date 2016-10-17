package pokerBase;

import java.util.ArrayList;
//DeckException
import java.util.Collections;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				if (eSuit != eSuit.JOKER){
					
				}
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				
			}
			 
		}
		Collections.shuffle(deckCards);
	}
	
	public Deck(int NbrOfJokers) { //Two Jokers in the deck
		this();
		for(int i = 0; i< NbrOfJokers; i++){
			Card c = new Card(eSuit.JOKER, eRank.JOKER,99);
			deckCards.add(c);
		}
		Collections.shuffle(deckCards);
		
		
	}
	
	
	public Deck(int NbrOfJokers, ArrayList<Card> Wilds) {
		this(NbrOfJokers);
		for(Card wild: Wilds){
			if(deckCards.contains(wild)){
				int index = deckCards.indexOf(wild);
				deckCards.get(index).setbWild(true);
			}
		}

		
	 
		
	}
	public Card Draw(){
		throw new DeckException(this);
		return deckCards.remove(0);
	}
}
