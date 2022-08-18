package com.xworkz.runner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.dao.CartoonDAO;
import com.xworkz.dao.CartoonDAOImpl;
import com.xworkz.entity.CartoonEntity;

public class CartoonRunner {


	public static void main(String[] args) {
		
		CartoonEntity doremon = new CartoonEntity("Doremon","Japan","Male","Nagasoki","ForKinds","Nagasok",LocalDateTime.of(2008, 7, 11, 2, 30),"Dev",LocalDateTime.now());
	CartoonEntity goku = new CartoonEntity("Goku","Japan","Male","Akira Toriyama","ForKinds","Akira",LocalDateTime.of(2012, 7, 11, 2, 30),"Dev",LocalDateTime.now());
		CartoonEntity motu = new CartoonEntity("Motu","India","Male","Harvinder Mankkar","ForKinds","Mankkar",LocalDateTime.of(2018, 7, 11, 2, 30),"Sharath",LocalDateTime.now());
		CartoonEntity patlu = new CartoonEntity("Patlu","India","Male","Harvinder Mankkar","ForKinds","Mankkar",LocalDateTime.of(2018, 7, 11, 2, 30),"Sharath",LocalDateTime.now());
		CartoonEntity naruto = new CartoonEntity("Naruto","Japan","Male","Hakshi Tanu","Action","Azar",LocalDateTime.of(2011, 7, 11, 2, 30),"Neron",LocalDateTime.now());
		CartoonEntity vegeta = new CartoonEntity("Vegeta","Japan","Male","Akira Toriyama","ForKinds","Akira",LocalDateTime.of(2008, 7, 11, 2, 30),"Nandish",LocalDateTime.now());
		CartoonEntity gohan = new CartoonEntity("Gohan","Japan","Male","Akira Toriyama","Action","Akira",LocalDateTime.of(2008, 7, 11, 2, 30),"Sharath",LocalDateTime.now());
	CartoonEntity sataman = new CartoonEntity("Sataman","Japan","Male","Akir Toriyama","ForKinds","Toriyama",LocalDateTime.of(2008, 7, 11, 2, 30),"Hanumanth",LocalDateTime.now());
	CartoonEntity popoye = new CartoonEntity("PopeyeSailor","German","Male","Akir Toriyama","ForKinds","Akir",LocalDateTime.of(2005, 7, 11, 2, 30),"Shadow",LocalDateTime.now());
	CartoonEntity heidi = new CartoonEntity("Heldi","india","Female","Tomayo","Stories","Tory",LocalDateTime.of(2002, 7, 11, 2, 30),"Boss",LocalDateTime.now());
		
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
//	Boolean save = dao.save(list);
	//	System.out.println(save);
	
		//CartoonEntity cartoon = dao.findByName("Goku");
		//System.out.println(cartoon);
	//System.out.println(dao.total());
//		
//CartoonEntity row = dao.findByMaxCreatedDate();
		//System.out.println(row);
//
//		
	//CartoonEntity cartoon = dao.findByNameAndCountryAndGenderAndAuthor("Goku", "Japan", "Male", "Akira Toriyama");
	//System.out.println(cartoon);
//	
		//String author = dao.findAuthorByName("Goku");
		//System.out.println(author);
//		
LocalDateTime history = dao.findCreadtedDateByAuthor("Hakshi Tanu");
		System.out.println(history);
//		
	//	Object[] str = dao.findNameAndCountryByAuthor("Hakshi Tanu");
		//System.out.println(str[0]);
		//System.out.println(str[1]);
	
	//	dao.updateAuthorByName("bhoomika", "Doremon");		
	//	dao.updateTypeByName("Training","Sataman");
		
	//	dao.deleteByName("Doremon");
	

	dao.findAll().forEach(System.out::println);
	
	System.out.println("*********************************This Is the Second Method***********************************");

      dao.findAllByAuthor("Akira Toriyama").forEach(System.out::println);
	
	System.out.println("*********************************This Is the Third Method***********************************");
	
	dao.findAllByAuthorAndGender("Akira Toriyama", "Male").forEach(System.out::println);
	
	System.out.println("*********************************This Is the Fourth Method***********************************");
	
	dao.findAllName().forEach(System.out::println);
	
	System.out.println("*********************************This Is the Fifth Method***********************************");
	
	dao.findAllCountry().forEach(System.out::println);
	
	System.out.println("*********************************This Is the Sixth Method***********************************");
	
	dao.findAllNameAndCountry().forEach(obj->System.out.println(obj[0]+"::"+ obj[1]));
	
	System.out.println("*********************************This Is the Seventh Method***********************************");
	
	dao.findAllNameAndCountryAndAuthor().forEach(obj->System.out.println(obj[0]+"::"+ obj[1]+"::"+obj[2]));
}

}


	
