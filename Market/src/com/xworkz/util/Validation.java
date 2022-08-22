package com.xworkz.util;

import javax.xml.bind.Validator;

public class Validation {

	private static Validator factory;
	
	public static Validator getFactory() {
		return factory;		
	}
	
	static {
		
		factory = javax.validation.Validation.buildDefaultValidatorFactory();
	}
	
}


