package com.xworkz.PubRunner;

import com.xworkz.PubDAO.PubDAO;
import com.xworkz.PubDAO.PubDAOImpl;
import com.xworkz.PubEntity.PubEntity;

public class UnderstandingJPA {
	public static void main(String[] args) {
	    
		PubDAO dao = new PubDAOImpl();
	PubEntity entity1 =dao.findByID(1);
		System.out.println(entity1);

    PubEntity entity = new PubEntity();
    		
	dao.updateOwnerAndLocationById("bar", "Shivmoga", 1);
	
	dao.deleteById(2);
	}

}



