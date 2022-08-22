package com.xworkz.supermarket.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@Table (name = "marketinfo")
@Entity

public class SuperMarket extends Market{
	
	@Id
	@Min(value=1,message="id is not valid")
	private Integer id;
	@NotNull
	private String name;
	@NotNull
	private String location;
	@Min(value = 10)
	@Max(value = 100)
	private Integer noofstalls;
	

	public SuperMarket(String marketName, String location, Integer noOfStalls, Integer maxCapacity,
			LocalDateTime createdDate, String createdBy, LocalDateTime updatedDate,String updatedBy) {
		
		super(createdDate,createdBy,updatedDate,updatedBy);
		this.name = marketName;
		this.location = location;
		this.noofstalls = noOfStalls;
	

}
}
