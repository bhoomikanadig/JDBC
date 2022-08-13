package com.xworkz.FlightDAO;

import com.xworkz.FlightEntity.FlightEntity;

public interface FlightDAO {
	Boolean save(FlightEntity entity);
	FlightEntity finfById(Integer fid);
	void updateNameAndLocationById(String name, String location,Integer fid);
	void deleteById(Integer fid);
}