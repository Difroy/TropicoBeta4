package com.generation.tropico.model.entities;

public class Industry extends Activity {

	
	protected ProductType productType;
	protected int production;
	
	public Industry(int id, int x2, int x1, int y2, int y1, String name, int salary, int jobs) {
		super(id, x2, x1, y2, y1, name, salary, jobs);
		
	}

	@Override
	public int getIncome() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTaxes() {
		// TODO Auto-generated method stub
		return 0;
	}

}
