package com.neosoft.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employeedto {

	private float m1;
	private float m2;
	
	private double avg;	

	private String garde;
	

	

	public float getM1() {
		return m1;
	}

	public void setM1(float m1) {
		this.m1 = m1;
	}

	public float getM2() {
		return m2;
	}

	public void setM2(float m2) {
		this.m2 = m2;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	
	public String getGarde() {
		return garde;
	}

	public void setGarde(String garde) {
		this.garde = garde;
	}

	public Employee getEmployeedto()
	{
		Employee employee =  new Employee();
		
		employee.setM1(m1);
		employee.setM2(m2);
		employee.setAvg(avg);
		employee.setGrade(garde);
		return employee;
	}
	
}
