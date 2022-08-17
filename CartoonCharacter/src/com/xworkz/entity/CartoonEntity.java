package com.xworkz.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="CartoonCharacter")
@AllArgsConstructor



public class CartoonEntity extends ParentEntity{
	@Id
	@Column
private int cid;
private String name;
private String country;
private  String location;
private String gender;
private String author;
private String type;

private String createdBy;
private LocalDateTime createdDate;
private String updatedBy;
private LocalDateTime updatedDate;

public CartoonEntity (Integer cId ,String name,String country, String location,String gender,String author,String type,String createdBY,LocalDateTime createdDate,String updatedBy,LocalDateTime updatedDate ){
	super(createdBY,createdDate,updatedBy,updatedDate);
	this.cid=cid;
	this.name=name;
	this.country=country;
	this.location=location;
	this.gender=gender;
	this.author=author;
	this.type=type;
	
	
	
	
}

}

