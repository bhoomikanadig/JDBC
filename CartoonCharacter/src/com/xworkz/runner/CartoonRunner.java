package com.xworkz.runner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.dao.CartoonDAO;
import com.xworkz.dao.CartoonDAOImpl;
import com.xworkz.entity.CartoonEntity;


public class CartoonRunner {
	public static void main(String[] args) {

		CartoonEntity doremon = new CartoonEntity(1, "Doremon","Japan","Male","Nagasoki","ForKinds","Nagasok",null, LocalDateTime.of(2008, 7, 11, 2, 30),"Dev",LocalDateTime.now());
		CartoonEntity goku = new CartoonEntity(2, "Goku","Japan","Male","Akira Toriyama","ForKinds","Akira",null, LocalDateTime.of(2012, 7, 11, 2, 30),"Dev",LocalDateTime.now());
		CartoonEntity motu = new CartoonEntity(3, "Motu","India","Male","Harvinder Mankkar","ForKinds","Mankkar",null, LocalDateTime.of(2018, 7, 11, 2, 30),"Sharath",LocalDateTime.now());
		CartoonEntity patlu = new CartoonEntity(4, "Patlu","India","Male","Harvinder Mankkar","ForKinds","Mankkar",null, LocalDateTime.of(2018, 7, 11, 2, 30),"Sharath",LocalDateTime.now());
		CartoonEntity naruto = new CartoonEntity(5, "Naruto","Japan","Male","Hakshi Tanu","Action","Azar",null, LocalDateTime.of(2011, 7, 11, 2, 30),"Neron",LocalDateTime.now());
		CartoonEntity vegeta = new CartoonEntity(6,"Vegeta","Japan","Male","Akira Toriyama","ForKinds","Akira",null, LocalDateTime.of(2008, 7, 11, 2, 30),"Nandish",LocalDateTime.now());
		CartoonEntity gohan = new CartoonEntity(7, "Gohan","Japan","Male","Akira Toriyama","Action","Akira",null, LocalDateTime.of(2008, 7, 11, 2, 30),"Sharath",LocalDateTime.now());
		CartoonEntity sataman = new CartoonEntity(8, "Sataman","Japan","Male","Akir Toriyama","ForKinds","Toriyama",null, LocalDateTime.of(2008, 7, 11, 2, 30),"Hanumanth",LocalDateTime.now());
		CartoonEntity popoye = new CartoonEntity(9, "PopeyeSailor-","German","Male","Akir Toriyama","ForKinds","Akir",null, LocalDateTime.of(2005, 7, 11, 2, 30),"Shadow",LocalDateTime.now());
		CartoonEntity heidi = new CartoonEntity(10, "Heldi","india","Female","Tomayo","Stories","Tory",null, LocalDateTime.of(2002, 7, 11, 2, 30),"Boss",LocalDateTime.now());
		
		List<CartoonEntity> list = new ArrayList<CartoonEntity>();
		list.add(doremon);
		list.add(goku);
		list.add(motu);
		list.add(patlu);
		list.add(naruto);
		list.add(vegeta);
		list.add(gohan);
		list.add(sataman);
		list.add(popoye);
		list.add(heidi);
		CartoonDAO dao = new CartoonDAOImpl();
	Boolean save = dao.save(list);
		System.out.println(save);
		
//		CartoonEntity cartoon = dao.findByName("Goku");
//		System.out.println(cartoon);
		
//		System.out.println(dao.total());
		
//		CartoonEntity row = dao.findByMaxCreatedDate();
//		System.out.println(row);

		
//		CartoonEntity cartoon = dao.findByNameAndCountryAndGenderAndAuthor("Goku", "Japan", "Male", "Akira Toriyama");
//		System.out.println(cartoon);
	
//		String author = dao.findAuthorByName("Goku");
//		System.out.println(author);
		
//		LocalDateTime history = dao.findCreadtedDateByAuthor("Hakshi Tanu");
//		System.out.println(history);
		
		//Object[] str = dao.findNameAndCountryByAuthor("Hakshi Tanu");
		//System.out.println(str[0]);
		//System.out.println(str[1]);
	}

}