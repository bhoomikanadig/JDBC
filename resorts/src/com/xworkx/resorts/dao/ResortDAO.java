package com.xworkx.resorts.dao;

import com.xworkz.resorts.entity.ResortEntity;

public interface ResortDAO {
	
	public Boolean save(ResortEntity entity);
 

	ResortEntity findByID(int id);
	
	void updateOwnerAndLocationById(String newOwner, String newLocation,int id);
	
	void deleteById(int id);

}

