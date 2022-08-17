package com.xworkz.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.entity.CartoonEntity;


public interface CartoonDAO {
	boolean save(List<CartoonEntity> entities);
	CartoonEntity findByName(String name);
	Integer total();
	CartoonEntity findByMaxCreatedDate();
	CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name,String country,String gender,String author);
	String findAuthorByName(String name);
	Object[] findNameAndCountryByAuthor(String author);
	LocalDateTime findCreadtedDateByAuthor(String author);
	void updateAuthorByName(String name,String Author);
	void updateTypeByName(String name,String type);
	void deleteByName();

}
