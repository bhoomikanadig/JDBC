package com.xworkz.Runner;

import com.xworkz.dao.PoliticianDAO;
import com.xworkz.dao.politicianDAOImpl;
import com.xworkz.politician.dto.PoliticianDTO;

public class PoliticianRunner {

	
	public static void main(String[] args) {
	
		
		PoliticianDTO pdto = new PoliticianDTO(4,  "aap", "aaa", 100, "groom", "banglore", "tanjavur", "tamilnadu", 120000000);
		
		
		PoliticianDAO pdao = new politicianDAOImpl();
//pdao.save(pdto);


	
	PoliticianDTO pdto1=pdao.findById(3);
	//System.out.println(pdto1);
	
	PoliticianDTO pdto2 = pdao.findByIdAndPresident(3,"kumarswamy");
	//System.out.println(pdto2);
	
	PoliticianDTO pdto3 = pdao.findByIdName(1,"bjp");
	System.out.println(pdto3);
	
	//PoliticianDTO pdto3 = pdao.findByIdAndAndName(10,"Nandesh","BJP");
	//System.out.println(pdto3);
	
	System.out.println("___________");
	PoliticianDTO pdto4 = pdao.findByIdAndPresident(5, "KJP"); 
	System.out.println("findByIdAndName :"+pdto4);
	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	PoliticianDTO pdto5 = pdao.findById(10);
	System.out.println(pdto5);
	
	System.out.println(": : :  : : : : : : : : :");
	//String pdto6 = pdao.findPresidentByIdAndName(2, "BJP");
//	System.out.println(pdto5);
	
	System.out.println("Get total ");
	int pdto7 = pdao.getTotal();
//	System.out.println(pdto7);
	
	System.out.println(" ^^^^^^^^^^^^^");
	PoliticianDTO pdto8 =pdao.findPartyByMaxMembers();
	System.out.println("findPartyByMaxMembers:"+pdto8);
		
	}
	
	


}

