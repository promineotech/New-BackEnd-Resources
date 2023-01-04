//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Object Oriented Programming
// Java Week 05 Lab Solution 
//
package week05;

public class Card {
	 String name;
	 String suit;
	 int value;
	 
	 public Card(String name, String suit, int value){
		 this.name = name;
		 this.suit = suit;
		 this.value = value;
		 
	 }
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public void describe() {
		System.out.println(this.name + " of " + this.suit + ": " + this.value);
		
	}

}
