package com.xworkz.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name="Hospital")
@ToString


public class HospitalEntity {

	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="checkintime")
	private LocalTime checkInTime;
	@Column(name="checkouttime")
	private LocalTime checkOutTime;
	@Column(name="createdby")
	private String createdBy;
	@Column(name="createddate")
	private LocalDate createdDate;
	@Column(name="updatedby")
	private String updatedBy;
	@Column(name="updateddate")
	private LocalDate updatedDate;


}
