package com.sprint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprint3.entities.Item;
import com.sprint3.services.ItemServices;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class Controller {
	
	@Autowired
	private ItemServices itemServices;
	
	@GetMapping("/items")
	
	public List<Item> getItems(){
		return this.itemServices.getItems();
	}
	
	@PostMapping("/postitem")
	public Item createItems(@RequestBody Item item) {
		return this.itemServices.createItem(item);
	} 
	@PutMapping("/updateItem/{id}")
	Item updateItem(@PathVariable Long id,@RequestBody Item i) {
		return this.itemServices.updateItem(id, i);
	}
	
	
	@DeleteMapping("/deleteItem/{id}")
	String deleteItem(@PathVariable Long id) {
		return this.itemServices.deleteItem(id);
	}

}
