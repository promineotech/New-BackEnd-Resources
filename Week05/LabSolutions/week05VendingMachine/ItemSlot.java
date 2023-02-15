/*
 * Copyright (c) 2023 Promineo Tech
 * Author:  Promineo Tech Academic Team
 * Subject:  Vending Machine Lab
 * Java Week 05 Lab Solution 
 */
package week05.week05VendingMachine;

public class ItemSlot {
	Item item;
	double price;
	int quantity;
	
	
	ItemSlot(Item item, double price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}


	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
