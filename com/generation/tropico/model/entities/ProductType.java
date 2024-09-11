package com.generation.tropico.model.entities;

public enum ProductType {
    
	WHEAT("FOOD", 400, 30, 2),
	ANANAS("FOOD", 40, 50, 2);
	
	public String category;
	public int calories, proteins, price;
	
	
	ProductType(String category, int calories, int proteins, int price){
		
		this.category = category;
		this.calories = calories;
		this.proteins = proteins;
		this.price = price;
		
	}
	
}
