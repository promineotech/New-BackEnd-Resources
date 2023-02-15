/*
 * Copyright (c) 2023 Promineo Tech
 * Author:  Promineo Tech Academic Team
 * Subject:  Vending Machine Lab
 * Java Week 05 Lab Solution 
 */
package week05.week05VendingMachine;

public class Return {
	Item item;
	double change;
	
	Return() {
		
	}
	
	Return(Item item, double change) {
		this.item = item;
		this.change = change;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}
	
	public void describe() {
		System.out.println("\tItem: " + item.getDescription());
		System.out.println("\tChange: " + change);
	}

}
