package com.xworkz.ClubDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.ClubEntity.ClubEntity;


public class ClubDAOImpl implements ClubDAO{
EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
EntityManager manager = null;
	@Override
	public Boolean save(ClubEntity entity) {
		try {
		manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		}
		catch (PersistenceException p){
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return true;
	}

	@Override
	public ClubEntity finfById(Integer cid) {
		try {
			manager = factory.createEntityManager();
			ClubEntity entity = manager.find(ClubEntity.class, cid);
			if(entity != null) {
				System.out.println("Here Is The Row Found"+cid);
				return entity;
			}
			else {
				System.out.println("Not able to Find The Details");
			}
			}
			catch (PersistenceException p){
				p.printStackTrace();
			}
			finally {
				manager.close();
			}
		
		
		return null;
	}

	@Override
	public void updateNameAndhappyHoursById(String name, String happy, Integer cid) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			ClubEntity entity = manager.find(ClubEntity.class, cid);
			if(entity != null) {
				entity.setName(name);
				entity.setHappyHours(happy);
				manager.merge(entity);
				
				System.out.println("The Updated Values are: "+ name+" "+happy );
			}
			else {
				System.out.println("Unable To Update");
			}
			tx.commit();
		}
		catch (PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
	}

	@Override
	public void deleteById(Integer cid) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			ClubEntity entity = manager.find(ClubEntity.class, cid);
			if(entity != null) {
				manager.remove(entity);
				System.out.println("The Delated Row ID is:" + cid);
			}
			else {
				System.out.println("Unable To Delete");
			}
			tx.commit();
		}
		catch (PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		
	}



}