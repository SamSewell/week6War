package wargames;

import java.util.*;


public class Deck {
	
	private final ArrayList<Card> deck;
	private int cardValue;
   
	/*
	 * Here we take the values from the cardname and add them with the suits and create a our deck of cards
	 * 
	 */
	
	
	public Deck(){
 
        Suit[] allSuits = Suit.values();
        CardName[] allCardNames = CardName.values();
        this.deck = new ArrayList<Card>(52);
        for (Suit suit : allSuits) {
            for (CardName cardnames : allCardNames) {
                deck.add(new Card(suit, cardnames));
            }
        }
    }

   // used the collection shuffle class to shuffle our deck
    public void shuffle() {   
        Collections.shuffle(deck);
    }
    		//getting the value of the card so we can compair them later
    public int getNextCardValue() {
    	return deck.get(0).getCardName().getValue();
    }
    			// our draw from the deck class
    public Card draw()      
    {
        
        return deck.remove(0);
    }



  
    public int getNoRemainingCars(){
        return deck.size();
    }

    @Override
    public String toString() {
        return deck.toString();
    }


	public int getCardValue() {
		return cardValue;
	}


	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}
	
	
}
