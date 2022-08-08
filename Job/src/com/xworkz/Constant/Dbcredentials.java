package com.xworkz.Constant;

public enum Dbcredentials {

URL("jdbc:mysql://Localhost:3306/job"), USERNAME("root"),SECRET("root");
	
	private String value;
	
	private Dbcredentials(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
		
	}

}