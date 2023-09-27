package com.sprint3.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint3.entities.Item;
import com.sprint3.repository.ItemRepo;
import com.sprint3.services.ItemServices;
@Service
public class ItemServiceImp implements ItemServices{
	
	
	@Autowired
	private ItemRepo itemRepo;
	
	@Override
	public Item createItem(Item item) {
		// TODO Auto-generated method stub
		
		itemRepo.save(item);
		
		return item;
	}


	@Override
	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return itemRepo.findAll();
	}


	@Override
	public Item updateItem(long id, Item item) {
		// TODO Auto-generated method stub
		Item i=itemRepo.findById(id).get();
		i.setName(item.getName());
		i.setDescription(item.getDescription());
		i.setPrice(item.getPrice());
		itemRepo.save(i);
		return i;
	}


	@Override
	public String deleteItem(long id) {
		// TODO Auto-generated method stub
		itemRepo.deleteById(id);
		return "Item record deleted successfully.";
	}

}
