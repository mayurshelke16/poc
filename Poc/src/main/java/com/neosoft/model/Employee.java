package com.neosoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private float m1;
	private float m2;
	
	private double avg;

	private String grade;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	

	/*
	 * public double getAvg() { return avg=(m1+m2)/2; }
	 * 
	 * public void setAvg(double avg) { this.avg = (m1+m2)/2; }
	 * 
	 * public String getGrade() {
	 * 
	 * String grade = null; double avg = (m1+m2)/2; if(avg>3) { grade="A(Good)";
	 * }else if(avg<3){ grade="B(Bad)";
	 * 
	 * } return grade; }
	 * 
	 * public void setGrade(String grade) {
	 * 
	 * double avg = (m1+m2)/2; if(avg>3) { grade="A(Good)"; }else if(avg<3){
	 * grade="B(Bad)";
	 * 
	 * } this.grade=grade; }
	 */
	
}
