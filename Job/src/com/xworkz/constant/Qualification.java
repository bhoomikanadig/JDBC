package com.xworkz.Constant;

public enum Qualification {


	BE("BE"),BCA("BCA"),BSC("BSC"),DEFAULT("Diploma");
	
	String education;
	
	private Qualification(String education) {
		this.education = education;
	}
	
	public String getQualification() {
		return education;
		
	}
	
	public static Qualification getByValue(String value) {
		Qualification[] qualification = Qualification.values();
			for (Qualification qualification2 : qualification) {
			System.out.println(qualification2.education + "Comparing");
				if(qualification2.education.equals(value)) {
					return qualification2;
				}	
			}
		
		return null;
}	
		


}