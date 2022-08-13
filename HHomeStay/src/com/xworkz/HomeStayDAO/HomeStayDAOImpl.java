package com.xworkz.HomeStayDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.HomeStay.Entity.HomeStayEntity;

public class HomeStayDAOImpl implements HomeStayDAO {

	@Override
	public Boolean save(HomeStayEntity entity) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			manager.close();
			factory.close();
			}
			catch (PersistenceException p) {
				p.printStackTrace();
			}
			return true;
		}

	}