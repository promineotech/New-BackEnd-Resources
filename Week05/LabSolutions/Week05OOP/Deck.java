//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Object Oriented Programming
// Java Week 05 Lab Solution 
//
package week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	
	
	Deck () {
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", 
							"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
		for (String suit : suits) {
			int count = 2;
			for (String numberName : numbers) {
				cards.add(new Card(numberName, suit, count));				
				count++;
			}
		}
	}
	
	
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}		
	}

	public void shuffle() {
		Collections.shuffle(this.cards);
	}

	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
}