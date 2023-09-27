package com.sprint3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
	@Id
	long id;
	String name;
	String description;
	double price;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(long id, String name, String description, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
}
