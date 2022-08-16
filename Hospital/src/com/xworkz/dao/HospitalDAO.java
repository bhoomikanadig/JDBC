package com.xworkz.dao;

import com.xworkz.entity.HospitalEntity;

public interface HospitalDAO {

	Boolean save(HospitalEntity hospitalEntity);

	HospitalEntity findById(Integer id);

	void updateNameAndCreatedBYBYId(String name, String createdby, Integer id);

	void deleteById(Integer id);
}
