package com.generation.tropico.model.entities;

public abstract class Activity extends Building{

	protected int salary, jobs;
	
	
	public Activity(int id, int x2, int x1, int y2, int y1, String name,int salary, int jobs) {
		super(id, x2, x1, y2, y1, name);
		this.salary = salary;
		this.jobs = jobs;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		if (salary < 0) {
			throw new IllegalArgumentException("Salary cannot be negative");
		}
		this.salary = salary;
	}


	public int getJobs() {
		return jobs;
	}


	public void setJobs(int jobs) {
		this.jobs = jobs;
	}
	
	
	public abstract int getIncome();
	public abstract int getTaxes();
	
	@Override
	public String toString() {
	    return "Activity: id=" + getId()+", name="+getName()+", area=" + getArea()+", salary="+salary+", jobs="+ jobs;
	}



}
