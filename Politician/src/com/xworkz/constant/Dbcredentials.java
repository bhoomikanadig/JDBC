package com.xworkz.constant;

public enum Dbcredentials {

URL("jdbc:mysql://Localhost:3306/politician"), USERNAME("root"),SECRET("root");
	
	private String value;
	
	private Dbcredentials(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
		
	}

}
