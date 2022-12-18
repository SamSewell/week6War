package wargames;

public enum Suit {
	
	 	SPADES("Spades"),
	    HEARTS("Hearts"),
	    CLUBS("Clubs"),
	    DIAMONDS("Diamonds");

	    // display value in console
	    private final String display;

	    /**
	     * Suit of a card
	     * @param display display value for a suit
	     */
	    Suit(String display) {
	        this.display = display;
	    }

	    public String getDisplay() {
	        return display;
	    }

	    @Override
	    public String toString() {
	        return display;
	    }

}
