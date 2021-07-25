package com.xworkz.function;

import java.io.Serializable;

public class FishDTO implements Serializable {
	private String name;
	private String color;
	private String type;
	private int lifeSpan;
	private int cost;
	private String gender;

	
	public FishDTO() {
		System.out.println("defalult constr");
	}


	public FishDTO(String name, String color, String type, int lifeSpan, int cost, String gender) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.lifeSpan = lifeSpan;
		this.cost = cost;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "FishDTO [name=" + name + ", color=" + color + ", type=" + type + ", lifeSpan=" + lifeSpan + ", cost="
				+ cost + ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		return 850;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getLifeSpan() {
		return lifeSpan;
	}


	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
