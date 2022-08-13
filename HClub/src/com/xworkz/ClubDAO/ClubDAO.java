package com.xworkz.ClubDAO;

import com.xworkz.ClubEntity.ClubEntity;

public interface ClubDAO {


	Boolean save(ClubEntity entity);
	ClubEntity finfById(Integer cid);
	void updateNameAndhappyHoursById(String name, String happy, Integer cid);
	void deleteById(Integer cid);
}
