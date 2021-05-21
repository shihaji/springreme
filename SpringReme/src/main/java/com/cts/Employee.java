package com.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	
	private String name;
	
	private int salary;
	
	@Autowired
	private Bank bank;  //  Loosely coupled 
	
	
	Employee(){
		
	}
	
	Employee(Bank bank){
		this.bank=bank;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

		
	

}
