package com.xworkz.FlightRunner;

import java.time.LocalDate;

import com.xworkz.FlightDAO.FlightDAO;
import com.xworkz.FlightDAO.FlightDAOImpl;
import com.xworkz.FlightEntity.FlightEntity;

public class FlightRunner {

	public static void main(String[] args) {

		FlightEntity entity = new FlightEntity(1,"Indigo","Banglore","Kattar",LocalDate.now(),"Indona","Airport",LocalDate.now(),3000.00D);
		FlightEntity entity1 = new FlightEntity(2,"AirIndia","Banglore","Delhi",LocalDate.now(),"TATA","India",LocalDate.now(),5000.00D);
		FlightEntity entity2 = new FlightEntity(3,"KingFisher","Banglore","Spain",LocalDate.now(),"Malya","Airport",LocalDate.now(),2000.00D);
		
		
		FlightDAO dao = new FlightDAOImpl();
	Boolean save =dao.save(entity);
	System.out.println(entity);
//	Boolean save1 = dao.save(entity2);
//	Boolean save2 = dao.save(entity1);
//	System.out.println(save);
//	System.out.println(save1);
//	System.out.println(save2);
		
//		FlightEntity details = dao.finfById(1);
//		System.out.println(details);
//		
//		dao.updateNameAndLocationById("Asia","Delhi", 1);
		
//		dao.deleteById(1);
	}

}