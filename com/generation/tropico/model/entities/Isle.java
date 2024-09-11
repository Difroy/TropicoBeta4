package com.generation.tropico.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Isle {

	protected final int id;
	protected int width,height;
	protected String name;
	protected int popolation;
	public List<Building> buildings = new ArrayList<Building>();
	
	
	public Isle (int id, int width, int height, String name) {
		
		
		this.id = id;
		this.width = width;
		this.height = height;
		this.name = name;
	}

	

	public int getPopolation() {
		return popolation;
	}



	public void setPopolation(int popolation) {
		this.popolation = popolation;
	}



	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Building> getBuildings() {
		return buildings;
	}


	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}


	public int getId() {
		return id;
	}

	public void addBuilding(Building b) {
	   
	    if (b.getX1() < 0 || b.getY1() < 0 || b.getX2() > width || b.getY2() > height) {
	        throw new RuntimeException("Building out of bounds");
	    }

	    this.buildings.add(b);
	}

	public void removeBuilding(Building b) {
	    this.buildings.remove(b);
	}
	
	
}
