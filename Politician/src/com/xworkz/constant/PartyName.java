package com.xworkz.constant;


public enum PartyName {
	BJP("bjp"),JDS("jds"),CONGRESS("congress"),AAP("aap"),TDP("tdp"),KGP("kgp"),PRKY("prky"),PDP("pdp"),LDP("ldp");
	 private String Partyname;
	
	PartyName(String PartyName){
		this.Partyname=PartyName;
		}
	public String getPartyName() {
		return Partyname;
	}
	public static PartyName getByValue(String value) {
	PartyName[] partyname = PartyName.values();
	for (PartyName partyname2 : partyname) {
	System.out.println(partyname2.Partyname + "Comparing");
		if(partyname2.Partyname.equals(value)) {
			return partyname2;
		}
	}
	
	return null;
	
}
	
	}


