package com.generation.tropico.model.entities;

public class Industry extends Activity {

	protected ProductType productType;
	protected int production;

	public Industry(int id, int x2, int x1, int y2, int y1, String name, int salary, int jobs, ProductType productType,
			int production) {

		super(id, x2, x1, y2, y1, name, salary, jobs);
		this.productType = productType;
		this.production = production;

	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		 if (productType == null) {
		        throw new IllegalArgumentException("Product type cannot be null");
		    }
		this.productType = productType;
	}

	public int getProduction() {
		return production;
	}

	public void setProduction(int production) {
		if (production < 0) {
			throw new IllegalArgumentException("Production cannot be negative");
		}
		this.production = production;
	}

	@Override
	public int getIncome() {
		return 0;

	}

	@Override
	public int getTaxes() {

		return 0;
	}

}
