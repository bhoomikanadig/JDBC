package com.xworkz.resort.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "resort")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResortEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="checkInTime")
	private LocalTime checkInTime;
	@Column(name="checkOutTime")
	private LocalTime checkOutTime;
	@Column(name="createBy")
	private String createBy;
	@Column(name="createDate")
	private LocalDate createDate;
	@Column(name="updateDate")
	private LocalDate updateDate;
	@Column(name="owner")
	private String owner;
	@Column(name="pricePerDay")
	private double pricePerDay;
	

}


