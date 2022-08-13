package com.xworkz.ClubEntity;

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

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="Club")
public class ClubEntity {

	@Id
	@Column (name = "cid")
	private Integer cid;
	@Column (name = "clubName")
	private String name;
	@Column (name = "clubLocation")
	private String location;
	@Column (name = "checkInTime")
	private LocalTime checkInTime;
	@Column (name = "checkOutTime")
	private LocalTime checkOutTime;
	@Column (name = "createdBy")
	private String createdBy;
	@Column (name = "createdDate")
	private LocalDate createdDate;
	@Column (name = "updatedBy")
	private String updatedBy;
	@Column (name = "HappyHours")
	private String happyHours;
}
	


