package com.generation.tropico.model.entities;

public abstract class Building {

	protected final int id;
	protected int x2,x1,y2,y1;
	protected String name;
	
	
	public Building (int id, int x2, int x1, int y2, int y1, String name) {
		
		if (id<0) {
			throw new IllegalArgumentException("ID cannot be negative");
		}
		this.id = id;
		
		if (x2 <= x1 || y2 <= y1) {
			throw new IllegalArgumentException("Invalid coordinates");
		}
		this.x2 = x2;
		this.x1 = x1;
		this.y2 = y2;
		this.y1 = y1;
		this.name = name;
	}
	
	public int getArea () {
		return (x2-x1)*(y2-y1);
	}

	public int getId() {
		return id;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String toString();
	
	
	
}
