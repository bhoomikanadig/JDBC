package com.xworkz.Politiciandto;




import constant.PartyName;
import constant.PartySymbol;





public class PoliticianDTO {
	
	private Integer id;
	private String name;
	private PartyName partyName = PartyName.BJP;
	private String president;
	private Integer totalMembers;
	private Double totalBudget;
	private PartySymbol partySymbol = PartySymbol.LOTUS;
	private String location;
	private String headQuaters;
	public PoliticianDTO(Integer id, String name, PartyName partyName, String president, Integer totalMembers,
			Double totalBudget, PartySymbol partySymbol, String location, String headQuaters) {
		super();
		this.id = id;
		this.name = name;
		this.partyName = partyName;
		this.president = president;
		this.totalMembers = totalMembers;
		this.totalBudget = totalBudget;
		this.partySymbol = partySymbol;
		this.location = location;
		this.headQuaters = headQuaters;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PartyName getPartyName() {
		return partyName;
	}
	public void setPartyName(PartyName partyName) {
		this.partyName = partyName;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public Integer getTotalMembers() {
		return totalMembers;
	}
	public void setTotalMembers(Integer totalMembers) {
		this.totalMembers = totalMembers;
	}
	public Double getTotalBudget() {
		return totalBudget;
	}
	public void setTotalBudget(Double totalBudget) {
		this.totalBudget = totalBudget;
	}
	public PartySymbol getPartySymbol() {
		return partySymbol;
	}
	public void setPartySymbol(PartySymbol partySymbol) {
		this.partySymbol = partySymbol;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHeadQuaters() {
		return headQuaters;
	}
	public void setHeadQuaters(String headQuaters) {
		this.headQuaters = headQuaters;
	}
	

}
