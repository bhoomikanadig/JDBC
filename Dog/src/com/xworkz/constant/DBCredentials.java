package com.xworkz.constant;

public enum DBCredentials {

	url("jdbc:mysql://localhost:3306/politician"),username("root"),password("root");
	String value;
	DBCredentials(String value){
		this.value=value;
		
	}
	String getname() {
	return value;

}
}