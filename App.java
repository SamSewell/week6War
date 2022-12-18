package wargames;

import java.util.*;

public class App {

	public static void main(String[] args) {
	Player p1 = new Player("Player 1", 0, new ArrayList<Card>(), new ArrayList<Integer>());
	Player p2 = new Player("Player 2", 0, new ArrayList<Card>(), new ArrayList<Integer>());
	Deck deck = new Deck();
	
	deck.shuffle();
		

	int round = 1;
	while(deck.getNoRemainingCars() > 0)
	{
		p1.setCardValue(deck);
		p1.Draw(deck.draw());
		p2.setCardValue(deck);
		p2.Draw(deck.draw());
		
	}
		int a = 0;
		while(p1.getHandSize() > 0) {
			try {
				
				System.out.println("Starting round: " + round);
				Thread.sleep(100);
				System.out.println(p1.getName() + " Played " + p1.Flip());
				Thread.sleep(100);
				System.out.println(p2.getName() + " Played " + p2.Flip());
				if(p1.getCardValue(a) > p2.getCardValue(a)) {
					System.out.println(p1.getName()+ " Won that Round");
					p1.incrementScore();
				}
				else if(p2.getCardValue(a) > p1.getCardValue(a)) {
					System.out.println(p2.getName()+ " Won that Round");
					p2.incrementScore();
				}
				else {
					System.out.println("That round was a tie!!!");
				}
				Thread.sleep(100);
				System.out.println(p1.getName() + " Has a score of " + p1.getScore());
				Thread.sleep(100);
				System.out.println(p2.getName() + " Has a score of " + p2.getScore());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a++;
			round++;
		}
		if(p1.getScore() > p2.getScore()) {
			System.out.println("Congrats Player 1 You won this Game");
		}else if(p1.getScore() < p2.getScore()){
			System.out.println("Congrats Player 2 You won this Game");
		}else {
			System.out.println("Its a Tie");
		}
		}
	
		
		
	}
	
	
		

	
	
		
		
		
	
