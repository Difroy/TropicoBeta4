package com.generation.tropico.model.entities;

public class Residential extends Building {


	protected int capacity, rent;
	
	
	public Residential(int id, int x2, int x1, int y2, int y1, String name, int capacity, int rent) {
		super(id, x2, x1, y2, y1, name);
		
		this.capacity = capacity;
		this.rent = rent;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException("Capacity cannot be negative");
		}
		this.capacity = capacity;
	}


	public int getRent() {
		return rent;
	}


	public void setRent(int rent) {
		if(rent<0) {
			throw new IllegalArgumentException("Rent cannot be negative");
		}
		this.rent = rent;
	}


	@Override
	public String toString() {
		return "Residence: id " + getId()+ " name: "+ getName()+" area: "+getArea()+ " capacity: "+ capacity+" rent: "+rent+"€";
	}

}
