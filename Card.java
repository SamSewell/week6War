package wargames;


public class Card {
				/*
				 * here we get our suits and values for our cards from out enum classes
				 */
	private final Suit suit;
    private final CardName cardName;

    public Card(Suit suit, CardName cardName) {
        this.suit = suit;
        this.cardName = cardName;
    }

    public Suit getSuit() {
        return suit;
    }

    public CardName getCardName() {
        return cardName;
    }


    
    @Override
    public String toString() {
        // prints e.g. "2-Hearts"
        return cardName.toString() + " of " + suit.toString();
    }
	
	




}
	

