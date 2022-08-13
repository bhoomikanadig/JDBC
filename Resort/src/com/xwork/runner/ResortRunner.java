package com.xwork.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.entity.ResortEntity;
import com.xworkz.resort.resortDAO.ResortDAO;
import com.xworkz.resort.resortDAO.ResortDAOImpl;

public class ResortRunner {

	public static void main(String[] args) {
		ResortEntity resortentity=new ResortEntity();
		resortentity.setId(1);
		resortentity.setName("upavan");
		resortentity.setLocation("banglore");
		resortentity.setCheckInTime(LocalTime.of(12, 00));
		resortentity.setCheckOutTime(LocalTime.of(11, 00));
		resortentity.setCreateBy("bhoomika");
		resortentity.setCreateDate(LocalDate.now());
		resortentity.setOwner("vanitha");
		resortentity.setPricePerDay(3000);
		resortentity.setUpdateDate(LocalDate.of(2022, 8, 15));
		
		ResortDAO resortdao=new ResortDAOImpl();
		boolean save=resortdao.saveDetails(resortentity);
				System.out.println(save);
	
		
		
		

	}
	

}
