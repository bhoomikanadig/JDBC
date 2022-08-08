package constant;

public enum PartySymbol {

	CYCLE("Cycle"),LOTUS("Lotus"),PAM("Pam"),COCONUT("Coconut"),FOX("Fox"),FAN("Fan"),BAG("Bag"),ELEPHANT("Elephant"),CLOCK("Clock"),MOP("Mop");
	
	private String symbol;
	
	private PartySymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
		
	}

	public static PartySymbol getBySymbol(String symbol) {
		PartySymbol[] partySymbol = PartySymbol.values();
		for (PartySymbol partySymbol2 : partySymbol) {
			if(partySymbol2.symbol.equals(symbol)) {
				return partySymbol2;
			}
		}
		return null;
		
	}
}
