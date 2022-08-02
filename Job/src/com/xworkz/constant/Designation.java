package com.xworkz.constant;

public enum Designation {
	SYSTEMENGINEER("SoftwareDeveloper"),TECHNICALSUPPORTENGINEER("TechnicalSupportEngineer"),NETWORKENGINEER("NetworkEngineer"),DEFAULT("NA");

	private String designation;
	
	private Designation(String designation) {
		this.designation = designation;
	}
	
	public String getDesignation() {
		return designation;
		
	}
}