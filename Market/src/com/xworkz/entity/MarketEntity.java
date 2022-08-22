package com.xworkz.entity;

import java.time.LocalDateTime;

import javax.persistence.Id;

import com.sun.istack.NotNull;

public class MarketEntity  extends ParentEntity{
	@Id
	@Min(value=1,message="id is not valid")
	private Integer mid;
	@NotNull
	private String marketName;
	@NotNull
	private String loaction;
	@Min(value = 10)
	@Max(value = 100)
	private Integer noOfStalls;
	@Min(value = 1000)
	@Max(value = 20000)
	private Integer maxCapacity;

	public MarketEntity(String marketName, String location, Integer noOfStalls, Integer maxCapacity,
			LocalDateTime createdDate, String createdBy, LocalDateTime updatedDate,String updatedBy) {
		
		super(createdDate,createdBy,updatedDate,updatedBy);
		this.marketName = marketName;
		this.loaction = location;
		this.noOfStalls = noOfStalls;
		this.maxCapacity = maxCapacity;

	}
}
	
	

}
