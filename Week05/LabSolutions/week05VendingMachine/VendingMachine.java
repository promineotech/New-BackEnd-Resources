/*
 * Copyright (c) 2023 Promineo Tech
 * Author:  Promineo Tech Academic Team
 * Subject:  Vending Machine Lab
 * Java Week 05 Lab Solution 
 */
package week05.week05VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
	Map<String, ItemSlot> itemLocation;

	
	VendingMachine() {
		this.itemLocation = new HashMap<>();
	}
	
	public Map<String, ItemSlot> getItemLocation() {
		return itemLocation;
	}


	public void setItemLocation(String itemName, ItemSlot itemSlot) {
		this.itemLocation.put(itemName,  itemSlot);
	}

	public Return purchase (double money, String location) {
		// find the item in the map using the location String
		ItemSlot itemSlot = itemLocation.get(location);
		Return newReturn = new Return();
		// If there are items AND there is enough money, process this.
		if ((itemSlot.quantity > 0) &&	(money - itemSlot.price > 0)) {
			newReturn.change = money - itemSlot.price;
			newReturn.item = itemLocation.remove(location).getItem();
		} else {
			newReturn.change = money;
		}
		
		
		return newReturn;
	}
	
	public void insert (Item item, int quantity, String location, double price) {
		ItemSlot itemSlot = new ItemSlot(item, price, quantity);
		itemLocation.put(location,  itemSlot);
	}

}
