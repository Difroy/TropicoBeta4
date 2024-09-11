package com.generation.tropico.model.entities;

public enum ServiceType {

	HEALTH(0),
	EDUCATION(0),
	ENTERTAINMENT(0.33),
	LUXURY(0.6),
	OTHER(0.22);
	
	private double taxPercentage;
	
	ServiceType (double tax){
		this.taxPercentage = tax;
	}
	
	public double getTaxPercentage() {
		return taxPercentage;
		
	}
	
	
}
