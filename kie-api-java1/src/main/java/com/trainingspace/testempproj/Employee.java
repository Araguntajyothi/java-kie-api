package com.trainingspace.testempproj;

public class Employee  {

	private int id;

	private String name;

	public Employee() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int id, java.lang.String name) {
		this.id = id;
		this.name = name;
	}

}