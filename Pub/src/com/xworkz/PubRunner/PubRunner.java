package com.xworkz.PubRunner;

import java.time.LocalDate;
import java.time.LocalTime;


import com.xworkz.PubDAO.PubDAO;
import com.xworkz.PubDAO.PubDAOImpl;
import com.xworkz.PubEntity.PubEntity;

public class PubRunner {
public static void main(String[] args) {
	

	PubEntity pub= new PubEntity();
	pub.setId(4);
	pub.setName("The Swan");
	pub.setLocation("Btm");
	pub.setCheckInTime(LocalTime.of(11, 00));
	pub.setCheckOutTime(LocalTime.of(12, 00));
	pub.setCreateBy("asha");
	pub.setCreateDate(LocalDate.now());
	pub.setOwner("kumar");
	pub.setPricePerDay(4000);
	pub.setUpdateDate(LocalDate.of(2016, 6, 29));
	
	PubDAO pubdao=new PubDAOImpl();
	boolean save = pubdao.save(pub);
	System.out.println(save);

}


}


