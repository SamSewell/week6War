package wargames;

public enum CardName
				{	/*
				 	* Here we are setting up the names and values of the cards when we combine
					 * these with out suits we will get a full card TWO(2, "Two"),
					 */
    THREE(3, "Three"),
    FOUR(4, "Four"),
    FIVE(5, "Five"),
    SIX(6, "Six"),
    SEVEN(7, "Seven"),
    EIGHT(8, "Eight"),
    NINE(9, "Nine"),
    TEN(10, "Ten"),
    JACK(11, "Jack"),
    QUEEN(12, "Queen"),
    KING(13, "King"),
    ACE(14, "Ace");

    
	
	
	private final int value;
    private final String display;

				    
    CardName(int value, String display) {
        this.value = value;       // this is the value of the card
        this.display = display;  //  this is what will be displayed to the user
    }

    public int getValue() {
        return value;
    }

    public String getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return display;
    }

}
