package com.xworkz.constant;

public enum Dbproperties {
	URL("jdbc:mysql://localhost:3306/job"),USERNAME("root"),SECRET("root");
	private String value;
   private Dbproperties(String value) {
	this.value=value;

}
	public String getValue() {
		return value;
	}
	

}