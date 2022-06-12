package week6CodingAssignment;
import java.util.ArrayList;

public class Player {
	
	//Fields
	//hand
	//List of Card
	ArrayList<Card> hand = new ArrayList<Card>();
	//score
	//set to 0 in the constructor
	int score = 0;
	//name
	String name;
	
	
	
	
	
	//describe
	//prints out information about the player and calls the describe method for each card in the Hand List
	public String describe(String name, int score) {
		Card hand = new Card();
		hand.describe();
		return  name + score;
	}

	//flip
	public Card flip (Deck deck) {
		Card topCard = hand.remove(0);
		return topCard;
	}
	
	//draw
	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}
	
	//increment score
	public void incrementScore() {
		score += 1;
	}
	
	//
	
	
	}


