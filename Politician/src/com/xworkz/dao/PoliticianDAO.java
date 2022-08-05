package com.xworkz.dao;

import com.xworkz.politician.dto.PoliticianDTO;

public interface PoliticianDAO {

	void save (PoliticianDTO dto);
	PoliticianDTO findById(int id);
	PoliticianDTO findByIdAndPresident(int id,String name);
	PoliticianDTO findByIdAndAndName(int id,String name,String president);
	PoliticianDTO findByIdName(int id,String name);
	String findNameById(int id);
	String friendPresidentByIdAndName(String name,int id);
	int getTotal();
	PoliticianDTO findPartyByMaxMembers();

	

}
