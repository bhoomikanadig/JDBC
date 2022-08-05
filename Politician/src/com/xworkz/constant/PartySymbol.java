package com.xworkz.constant;

public enum PartySymbol {
	BJPSYMBOL("lotus"),JDSSYMBOL("gross"),CONGRESSSYMBOL("palm"),AAPSYMBOL("broom"),TDPSYMBOL("cycle"),KGPSYMBOL("kite"),PRKYSYMBOL("pen"),PDPSYMBOL("pdp"),LDPSYMBOL("umbrella");
	 private String Partysymbol;
	
	  private PartySymbol(String Partysymbol ) {
		this.Partysymbol=Partysymbol;
	}
	public String getPartySymbol(String PartySymbol) {
			return Partysymbol;
		}
		public static PartySymbol getByValue(String value) {
		PartySymbol[] partysymbol = PartySymbol.values();
		for (PartySymbol partysymbol2 : partysymbol) {
		System.out.println(partysymbol2.Partysymbol + "Comparing");
			if(partysymbol2.Partysymbol.equals(value)) {
				return partysymbol2;
			}
		}
		
		return null;
		
	}
		
		}
