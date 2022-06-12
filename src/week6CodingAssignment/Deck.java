package week6CodingAssignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Deck {
	// fields cards
	List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] nameOfCard = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
		for (String suit : suits) {
			for (int i = 2; i < 15; i++) {
				Card x = new Card();
				x.setname(nameOfCard[i-2] + "of " + suit);
				x.setValue(i);
				cards.add(x);
			}
		}
			
		}

	
		
	//Methods
	
	//Shuffle cards
	//Randomizes the order of the cards
	public void Shuffle () {
		Collections.shuffle(cards);
	}

	//Draw cards
	//removes and returns the top card of the Cards field
	public Card draw() {
		Card playersCard = cards.get(0);
		cards.remove(0);
		return playersCard;
		
	}
	
	
	

}
