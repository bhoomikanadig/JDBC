package com.xworkz.dao;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import com.xworkz.entity.CartoonEntity;

public interface CartoonDAO {
	Boolean save(List<CartoonEntity> entities);
	CartoonEntity findByName(String name);
	Integer total();
	CartoonEntity findByMaxCreatedDate();
	CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name,String country,String gender,String author);
	String findAuthorByName(String name);
	Object[] findNameAndCountryByAuthor(String author);
	LocalDateTime findCreadtedDateByAuthor(String author);
	void updateAuthorByName(String name,String Author);
	void updateTypeByName(String name,String type);
	void deleteByName(String name);
	default List<CartoonEntity> findAll(){
		return Collections.emptyList();	
	}
	default List<CartoonEntity> findAllByAuthor(String author){
		return Collections.emptyList();
	}
	default List<CartoonEntity> findAllByAuthorAndGender(String author,String gender){
		return Collections.emptyList();
	}
	default List<String> findAllName(){
		return Collections.emptyList();
	}
	default List<String> findAllCountry(){
		return Collections.emptyList();
	}
	default List<Object[]> findAllNameAndCountry(){
		return Collections.emptyList();
	}
	default List<Object[]> findAllNameAndCountryAndAuthor(){
		return Collections.emptyList();
	}
}

