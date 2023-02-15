//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Object Oriented Programming
// Java Week 05 Lab  
//
package week05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week5OOPLabSolution {

	// This Lab will give you a basic look at creating an Object Oriented Card Game.  
	//		The idea here is to prepare you for your Week 6 Unit Final Project.
	//		There are many ways to implement this Lab, please use the tools that you know,
	//		and go from there.
	// These exercises are intended to be coded in order 1 through 5.
	
	
	public static void main(String[] args) {

		
		// A standard deck of playing cards has 52 cards as specified below 
		//		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
		//				
		//	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven, 
		//									 Eight, Nine, Ten, Jack, Queen, King & Ace
		//
		//	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
		//							 to make this easy, a Two will have a value of 2, a
		//							 Three will have a value of 3, ... and an Ace will have
		//							 a value of 14.
		//
		
			
		// 1. Card Class:
		//		Create a class called Card to represent a standard playing card. 
		//		Fields:   The Card class should have the following fields:
		// 			a. name field (Two, Three, Four, Five, etc.)
		//			b. suit field (Clubs, Diamonds, Hearts, Spades)
		//			c. value field for comparing against other cards (e.g. 2-14)
		//
		//		Methods:  This class can have any useful method.
		//			a. describe() to display the card information to the Console.
		//			b. Getters & Setters 
		//
		System.out.println("\nQuestion 1: Card Class");
		Card tempCard = new Card("Two", "Hearts", 2);
		
		// Call the describe method on the newly instantiated card.
		tempCard.describe();

		// 2. Deck Class:
		//		Create a class called Deck.
		//		Fields:  This class should have a list of Card field called cards that will hold all the cards in the deck. 
		//			List<Card> cards = new ArrayList<Card>(); 
		//
		//		Constructor: The constructor for the Deck Class should
		// 			instantiate all 52 standard playing cards and add them to the cards list.
		//
		//		Methods:  
		//			a.  describe() to describe the deck -- 
		//					print out all of the cards in the deck.
		//
		System.out.println("\nQuestion 2: Deck Class");
		Deck deck = new Deck();
		System.out.println("Deck has been created!");
		// Call the describe method on the newly instantiated deck.
		deck.describe();
		
		
		
		
		// 3. Deck shuffle() Method:
		//		Add a shuffle method to Deck within the Deck Class
		System.out.println("\nQuestion 3:");
		deck.shuffle();
		System.out.println("Shuffled Deck:");
		System.out.println("--------------");
		// Call the describe method on the newly shuffled deck.
		deck.describe();
		
		
		// 4. Deck draw() Method:
		//		Add a draw method to Deck within the Deck Class
		System.out.println("\nQuestion 4: Deck draw() method");
		Card card = deck.draw();
		card.describe();
		
		
		// 5. Create Game:
		//		Create and test a method that takes an int as a parameter (representing the
		// 			number of players for a game) and returns a Map<String, List<Card>>
		// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
		//			and their cards.
		//
		// 			The method should create a new instance of Deck, shuffle it,
		// 			and deal the cards out to the "players" in the Map.

		System.out.println("\nQuestion 5: Create Game");
		int numOfPlayers = 4;
		Map<String, List<Card>> gameBoard = createGame(numOfPlayers);
	
		// Print out each Player and their Hand here.
		System.out.println("--------------------------");
		for (int i = 1; i <= numOfPlayers; i++) {
			String playerName = "Player " + i;
			System.out.println(playerName + "\n--------");
			List<Card> playerList = gameBoard.get(playerName);
			for (Card handCard : playerList) {
				handCard.describe();
			}	
			System.out.println("--------------------------");
		}
		
		
		
	}
	
	// Method 5: 
	private static Map<String, List<Card>> createGame(int numOfPlayers) {
		Map<String, List<Card>> finalGameMap = new HashMap<>();
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println("Deck has " + deck.getCards().size() + " cards!");
		
		// Create the entries in the Map with the Player Name and an empty List
		for (int i = 1; i <= numOfPlayers; i++) {
			List<Card> playerList = new ArrayList<>();
			String playerName = "Player " + i;
			finalGameMap.put(playerName, playerList);
		}
		// Deal the deck:  draw a card, add the new card to a players hand, and store
		for (int i = 0; i < 52/numOfPlayers; i++) {
			for (int j = 1; j <= numOfPlayers; j++) {
				String playerName = "Player " + j;
				List<Card> playerList = finalGameMap.get(playerName);
				playerList.add(deck.draw());
				finalGameMap.replace(playerName, playerList);			
			}
		}
		
		if (52 % numOfPlayers != 0) {
			System.out.print("With " + numOfPlayers + " players -- ");
			System.out.println("Cards left in deck: " + 52%numOfPlayers); 
		} else {
			System.out.println("All cards have been dealt");
		}
		
		return finalGameMap;
	}

}
