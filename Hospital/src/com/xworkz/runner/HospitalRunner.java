package com.xworkz.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.dao.HospitalDAO;
import com.xworkz.dao.HospitalDAOImpl;
import com.xworkz.entity.HospitalEntity;

public class HospitalRunner {
	public static void main(String[] args) {
		HospitalEntity hospitalEntity = new HospitalEntity();
		hospitalEntity.setId(3);
		hospitalEntity.setName("Nanjappa");
		hospitalEntity.setLocation("Shivmogga");
		hospitalEntity.setCheckInTime(LocalTime.of(4, 00));
		hospitalEntity.setCheckOutTime(LocalTime.of(6, 00));
		hospitalEntity.setCreatedBy("nanjappa");
		hospitalEntity.setCreatedDate(LocalDate.now());
		hospitalEntity.setUpdatedBy("kumar");
		hospitalEntity.setUpdatedDate(LocalDate.now());

		HospitalDAO dao = new HospitalDAOImpl();
		// Boolean saved = dao.save(hospitalEntity);
		// System.out.println(saved);
		// HospitalEntity t=dao.findById(2);
		// System.out.println(t);
		//dao.updateNameAndCreatedBYBYId("Portis", "Sm Krishna", 1);
		dao.deleteById(1);
	}

}
