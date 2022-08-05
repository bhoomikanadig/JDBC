package com.xworkz.Constant;

public enum Designation {

	SYSTEMENGINEER("SoftwareDeveloper"),TECHNICALSUPPORTENGINEER("TechnicalSupportEngineer"),NETWORKENGINEER("NetworkEngineer"),DEFAULT("NA");

	private String designation;
	private Designation(String designation) {
		this.designation = designation;
	}
	
	public String getDesignation() {
		return designation;
		
	}
	
	public static Designation getByValue(String value) {
		Designation[] designation = Designation.values();
		for (Designation designation2 : designation) {
		System.out.println(designation2.designation + "Comparing");
			if(designation2.designation.equals(value)) {
				return designation2;
			}
		}
		
		return null;
		
	}
}