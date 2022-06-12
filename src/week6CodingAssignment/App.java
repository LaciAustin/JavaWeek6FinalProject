package week6CodingAssignment;

public class App {

	public static void main(String[] args) {
		//Deck
		Deck deck = new Deck();
		//Two players
		Player playerOne = new Player();
		Player playerTwo = new Player();
		//Call on shuffle method
		deck.Shuffle();
		
		
		//iterate 52 times
		//calling draw method on Player One
		//using Deck
		for (int i = 0; i < 52; i++) {
			playerOne.draw(deck);	
		}
		//iterate 26 times
		//calling flip method for Tomato and Lettuce
		for (int i = 0; i < 26; i++) {
			System.out.println(playerTwo.flip(deck));
			System.out.println(playerOne.flip(deck));
		}
		
		
		
		Card finalScorePlayerOne = playerOne.flip(deck);
		Card finalScorePlayerTwo = playerTwo.flip(deck);
		
		//compare final score of each player
		//attempt to print out final score
		//apologies for this utter mess of a final project 
		if (finalScorePlayerOne == finalScorePlayerTwo) {
			System.out.println("Draw");
		} else if (finalScorePlayerOne > finalScorePlayerTwo) {
			System.out.println(finalScorePlayerOne + " is greater than " + finalScorePlayerTwo);
			} else {
				System.out.println(finalScorePlayerTwo + " is greater than " + finalScorePlayerOne);
			
			
			
			
			
			
	
		
		
		
		
		
		

	}
	}
}
