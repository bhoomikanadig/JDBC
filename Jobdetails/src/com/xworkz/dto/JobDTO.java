package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class JobDTO {
	
	private Integer jid;
	private Designation designation=Designation.DEFAULT;
	private Double annualPackage;
	private Qualification qualification=Qualification.DEFAULT;
	private Double percentage;
	private String fresher;
	

		
	
}