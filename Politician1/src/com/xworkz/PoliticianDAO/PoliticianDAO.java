package com.xworkz.PoliticianDAO;

import java.util.Collections;
import java.util.List;

import com.xworkz.Politiciandto.PoliticianDTO;

public interface PoliticianDAO {
	public Boolean saveDetails(PoliticianDTO dto);
public PoliticianDTO finfById(Integer id);
public PoliticianDTO findByIdAndPresident(Integer id,String president);
public PoliticianDTO findByIdAndPresidentAndName(Integer id,String president,String name);
public PoliticianDTO findByIdAndName(Integer id, String name);
public String findNameById(Integer id);
public String findPresidentByIdAndName(Integer id,String name);
public int getTotal();
public String findPartyByMaxMembers();
default List<PoliticianDTO> findAll(){
	return Collections.EMPTY_LIST;
}
default List<String> findAllPartyName(){
	return null;		
}
default List<Integer> findAllIds(){
	return null;	
}
default List<Object> findAllNoOfMembersAndFundAndPartyName(){
	return null;
	
}

}
