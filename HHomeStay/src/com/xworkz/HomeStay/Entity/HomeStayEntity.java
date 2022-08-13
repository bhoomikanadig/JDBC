package com.xworkz.HomeStay.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="HomeStay")

public class HomeStayEntity {


	@Id
	@Column (name = "rId")
	private Integer id;
	@Column (name = "resortName")
	private String name;
	@Column (name = "location")
	private String location;
	@Column (name = "checkInTime")
	private LocalTime checkInTime;
	@Column (name = "checkOutTime")
	private LocalTime checkOutTime;
	@Column (name = "createdBy")
	private String createdBy;
	@Column (name = "createDate")
	private LocalDate createDate;
	@Column (name = "updateDate")
	private LocalDate updateDate;
	@Column (name = "owner")
	private String owner;
	@Column (name = "pricePerDay")
	private Double pricePerDay;
}
