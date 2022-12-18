package wargames;

import java.util.ArrayList;
import java.util.Set;

public class Player {
	
	// here we setup our players with a name score and a hand
	public Card za;
	private String name = "";
	private int score = 0;
	private Deck deck;
	private ArrayList<Card> hand;
	private ArrayList<Integer> cardValue = new ArrayList<>();
	public Player(String name, int score, ArrayList<Card> hand, ArrayList<Integer> cardValue ){
		
		this.hand = hand;
		this.name = name;
		
	}
		// this is our way we increase the score
	 public void incrementScore() {
		 this.setScore(); ;
	 }
	 			// how we get the name of the player
	    public String getName() {
	        return name;
	    }	
				// how we show what cards are in the deck
	    public String showDeck(){
	        return deck.toString();
	    }
	    		// another way to shuffle the deck wh
	   

	    @Override
	    public String toString() {
	        return  name ;
	                
	    }

		public int getScore() {
			return score;
		}

		public void setScore() {
			this.score += 1;
		}

		public Card Flip() {
			
			return hand.remove(0);
		}
	
		public int getCardValue( int i) {
			return cardValue.get(i);
		}

		public void Draw(Card card) {
			hand.add(card);
		}

		public void  setCardValue(Deck deck) {
			cardValue.add(deck.getNextCardValue());
		}
	
	public int getHandSize() {
		return hand.size();
	}
	
	
	
	}	
	


