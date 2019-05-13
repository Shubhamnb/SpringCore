package com.bridge.pojo;

public class Emplloyee {
	private int id;
	private String name;
	private String desg;
	private int salary;
	
	
	
	public Emplloyee() {
	}
	
	
	
	public Emplloyee(int id, String name, String desg, int salary) {
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Emplloyee [id=" + id + ", name=" + name + ", desg=" + desg + ", salary=" + salary + "]";
	}
	
	
}
