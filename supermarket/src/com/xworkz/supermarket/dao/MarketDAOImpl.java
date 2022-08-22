package com.xworkz.supermarket.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.supermarket.entity.SuperMarket;

public class MarketDAOImpl implements MarketDAO  {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	
	@Override
	public Boolean save(SuperMarket entity) {
	EntityManager manager = null;
	try {
		manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
	}
	catch(PersistenceException p) {
		p.printStackTrace();
	}
	finally {
		manager.close();
	}
		return null;
	}

}
