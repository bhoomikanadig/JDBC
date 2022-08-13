package com.xworkz.dto;
@get

public class DogDto {
	
	private int id;
	private String name;
	private String breed;
	private int price;
	private String color;
	private int age;
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
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public DogDto(int id, String name, String breed, int price, String color, int age) {
		super();
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.price = price;
		this.color = color;
		this.age = age;
	}
	
	
	
	
	

}