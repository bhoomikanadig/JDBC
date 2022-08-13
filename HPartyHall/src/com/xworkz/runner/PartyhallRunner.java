package com.xworkz.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.dao.PartyhallDAO;
import com.xworkz.dao.PartyhallDaoImpl;
import com.xworkz.entity.PartyhallEntity;

public class PartyhallRunner {

	public static void main(String[] args) {
		
		
		PartyhallEntity entity = new PartyhallEntity(1, "belgavi", "Mysore", LocalTime.of(12, 00), LocalTime.of(4, 00),
				"bhoomi", LocalDate.now(), "moni", LocalDate.now());

		PartyhallDAO dao = new PartyhallDaoImpl();

		 Boolean saved = dao.save(entity);
		 System.out.println(saved);

		// PartyhallEntity entity2=dao.findById(1);
		// System.out.println(entity2);
		// dao.updateNameAndCreatedByById("Krishna convention hall", "Malatesh", 1);

		//dao.deleteById(2);

	}

}
