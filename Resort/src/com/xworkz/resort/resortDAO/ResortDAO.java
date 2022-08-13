package com.xworkz.resort.resortDAO;

import com.xworkz.resort.entity.ResortEntity;

public interface ResortDAO {
	public Boolean saveDetails(ResortEntity entity);
	ResortEntity findByID(int id);
	
	void updateOwnerAndLocationById(String newOwner, String newLocation,int id);
	
	void deleteById(int id);

}

