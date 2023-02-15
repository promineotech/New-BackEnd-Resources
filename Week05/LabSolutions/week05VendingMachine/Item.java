/*
 * Copyright (c) 2023 Promineo Tech
 * Author:  Promineo Tech Academic Team
 * Subject:  Vending Machine Lab
 * Java Week 05 Lab Solution 
 */
package week05.week05VendingMachine;

public class Item {

	String description;
	
	
	Item(String description) {
		this.description = description;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
}
