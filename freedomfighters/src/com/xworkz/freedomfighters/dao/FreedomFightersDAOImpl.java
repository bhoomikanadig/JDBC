package com.xworkz.freedomfighters.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import static com.xworks.freedomfighters.util.EMFUtil.*;
import com.xworkz.freedomfighters.entity.FreedomFightersEntity;

public class FreedomFightersDAOImpl implements FreedomFighterDAO{

	EntityManagerFactory factory = getFactory();
	@Override
	public boolean save(List<FreedomFightersEntity> entities) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx= manager.getTransaction();
			tx.begin();
			for (FreedomFightersEntity freedomFightersEntity : entities) {
				manager.persist(freedomFightersEntity);
			}
			tx.commit();
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return true;
	}

}
