package com.xworkz.dao;

import com.xworkz.entity.PartyhallEntity;

public interface PartyhallDAO {

	

	PartyhallEntity findById(Integer id);

	void updateNameAndCreatedByById(String name, String createdBy, Integer id);

	void deleteById(Integer id);

	Boolean save(PartyhallEntity entity);
}
