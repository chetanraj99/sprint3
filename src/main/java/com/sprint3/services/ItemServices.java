package com.sprint3.services;

import java.util.List;

import com.sprint3.entities.Item;

public interface ItemServices {
	
	List<Item> getItems();
	
	Item createItem(Item item);
	
	Item updateItem(long id,Item item);
	
	String deleteItem(long id);
}
