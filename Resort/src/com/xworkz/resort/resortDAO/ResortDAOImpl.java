package com.xworkz.resort.resortDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.resort.entity.ResortEntity;

public class ResortDAOImpl implements ResortDAO {

	@Override
	public Boolean saveDetails(ResortEntity entity) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);//save
		tx.commit();
		factory.close();
		manager.close();

		return true;
				
	}

}
