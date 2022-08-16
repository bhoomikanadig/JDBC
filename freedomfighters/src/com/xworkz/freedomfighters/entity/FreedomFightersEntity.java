package com.xworkz.freedomfighters.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table (name = "fighters_details")

public class FreedomFightersEntity extends ParentEntity {
	
	@Id
	@Column (name = "fighter_id")
	private Integer fightersId;
	private String fighterName;
	private LocalDateTime fighterDOB;
	private String FighterBornLocation;

	public FreedomFightersEntity (Integer fightersId ,String fightersName,LocalDateTime fighterDOB, String FightersBornLocation,String createdBY,LocalDateTime createdDate,String updatedBy,LocalDateTime updatedDate ){
		
		super(createdBY,createdDate,updatedBy,updatedDate);
		this.fightersId = fightersId;
		this.fighterName = fightersName;
		this.fighterDOB = fighterDOB;
		this.FighterBornLocation = FightersBornLocation;
	}

}
