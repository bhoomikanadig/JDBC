package com.xworkz.politician.dto;


public class PoliticianDTO {
	private int id;
	private String Name;
	private String President;
	private int TotalMembers;
	private String PartySymbol;
	private String PartyLocation;
	private String PartyColor;
	private String PartyState;
	private int PartyBudget;
	
	
	
	public PoliticianDTO(int id, String Name, String Presedent, int TotalMembers, String PartySymbol, String PartyLocation, String PartyColor, String PartyState, int PartyBudget ) {
		this.id = id;
		this.Name=Name;
		this.President=President;
		this.TotalMembers=TotalMembers;
		this.PartySymbol=PartySymbol;
		this.PartyLocation=PartyLocation;
		this.PartyColor=PartyColor;
		this.PartyState=PartyState;
		this.PartyBudget=PartyBudget;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPresident() {
		return President;
	}
	public void setPresident(String president) {
		President = president;
	}
	public int getTotalMembers() {
		return TotalMembers;
	}
	public void setTotalMembers(int totalMembers) {
		TotalMembers = totalMembers;
	}
	public String getPartySymbol() {
		return PartySymbol;
	}
	public void setPartySymbol(String partySymbol) {
		PartySymbol = partySymbol;
	}
	public String getPartyLocation() {
		return PartyLocation;
	}
	public void setPartyLocation(String partyLocation) {
		PartyLocation = partyLocation;
	}
	public String getPartyColor() {
		return PartyColor;
	}
	public void setPartyColor(String partyColor) {
		PartyColor = partyColor;
	}
	public String getPartyState() {
		return PartyState;
	}
	public void setPartyState(String partyState) {
		PartyState = partyState;
	}
	public int getPartyBudget() {
		return PartyBudget;
	}
	public void setPartyBudget(int partyBudget) {
		PartyBudget = partyBudget;
	}
}