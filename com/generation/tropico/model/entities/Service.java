package com.generation.tropico.model.entities;

public class Service  extends Activity{

	protected ServiceType serviceType;
	
	public Service(int id, int x2, int x1, int y2, int y1, String name, int salary, int jobs, ServiceType serviceType) {
		super(id, x2, x1, y2, y1, name, salary, jobs);
		
	}

	
	
	public ServiceType getServiceType() {
		return serviceType;
	}



	public void setServiceType(ServiceType serviceType) {
		if (serviceType == null) {
	        throw new IllegalArgumentException("Choose your Service Type");
	    }
		this.serviceType = serviceType;
	}



	@Override
	public int getIncome() {
	
		return (int)((jobs * salary)*0.1);
	}

	@Override
	public int getTaxes() {
		
		return (int)(getIncome()*serviceType.getTaxPercentage());
	}

}
