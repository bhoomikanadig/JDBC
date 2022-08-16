package com.xworkz.PubDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.PubEntity.PubEntity;

public class PubDAOImpl implements PubDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(PubEntity entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		manager.persist(entity);
		tx.begin();
		tx.commit();
		manager.close();
		factory.close();
		return true;
	}

	@Override
	public PubEntity findByID(int id) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			PubEntity entity = manager.find(PubEntity.class, id);
			System.out.println(" Found by id : " + id);
			if (entity != null) {
				System.out.println(" id :" + entity);
				return entity;
			} else {
				System.err.println("id is not found ");
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateOwnerAndLocationById(String newOwner, String newLocation, int id) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			PubEntity entity = manager.find(PubEntity.class, id);
			entity.setOwner(newOwner);
			entity.setLocation(newLocation);
			manager.merge(entity);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

	}

	@Overridet
	public void deleteById(int id) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			PubEntity entity = manager.find(PubEntity.class, id);
			manager.remove(entity);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

	}

}