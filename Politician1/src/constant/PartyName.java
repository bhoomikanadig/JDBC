package constant;

public enum PartyName {


	AAP("AAP"),BJP("BJP"),KJP("KJP"),SIV("SIV"),CONG("CONG"),RSS("RSS"),PRKY("PRKY"),SP("SP"),KYLP("KYLP"),SS("SS");

	
	private String party;
	
	private PartyName(String party) {
		this.party = party;
	}
	
	public String getPartyName() {
		return party;
		
	}
	
	public static PartyName getByParty(String party) {
		PartyName[] partynName = PartyName.values();
		for (PartyName partyName2 : partynName) {
			if(partyName2.party.equals(party)){
				return partyName2;
			}
		}
		return null;
		
	}
}
