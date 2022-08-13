package com.xworkz.PubDAO;

import com.xworkz.PubEntity.PubEntity;

public interface PubDAO {
	boolean save(PubEntity entity);
	
PubEntity findByID(int id);
	
	void updateOwnerAndLocationById(String newOwner, String newLocation,int id);
	
	void deleteById(int id);

}
