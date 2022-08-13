package com.xworkx.resorts.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.resorts.entity.ResortEntity;

public class ResortDAOImpl implements ResortDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public Boolean save(ResortEntity entity) {
		try {

			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			manager.close();
			factory.close();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return true;
	}


	@Override
	public ResortEntity findByID(int id) {
			EntityManager manager = null;
			try {
				manager = factory.createEntityManager();
				ResortEntity entity = manager.find(ResortEntity.class, id);
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
		ResortEntity entity	=manager.find(ResortEntity.class, id);
			entity.setOwner(newOwner);
			entity.setLocation(newLocation);
		    manager.merge(entity);	
			tx.commit();
			

		} catch (Exception e) {
           e.printStackTrace();
		}
		finally {
			manager.close();
		}

	}

	@Override
	public void deleteById(int id) {
		 EntityManager manager = null;
			try {
				manager = factory.createEntityManager();
			EntityTransaction tx=manager.getTransaction();
			tx.begin();
		ResortEntity entity=manager.find(ResortEntity.class, id);
			manager.remove(entity);
				tx.commit();
			}catch(Exception e) {
			e.printStackTrace();	
			}
			finally {
				manager.close();
			}
			
		}

	}