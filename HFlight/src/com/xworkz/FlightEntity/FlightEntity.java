package com.xworkz.FlightEntity;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "flight_details")

public class FlightEntity {

	@Id
	@Column (name = "fid")
	private Integer fid;
	@Column (name = "fName")
	private String flightName;
	@Column (name = "dLocation")
	private String departureLocation;
	@Column (name = "aLocation")
	private String arrivalLocation;
	@Column (name = "createdAt")
	private LocalDate createdAt;
	@Column (name = "createdBy")
	private String createdBy;
	@Column (name = "updatedBy")
	private String updatedBy;
	@Column (name = "updatedDate")
	private LocalDate updatedDate;
	@Column (name = "ticketFair")
	private Double ticketFair;
}
