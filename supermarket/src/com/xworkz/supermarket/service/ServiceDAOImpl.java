package com.xworkz.supermarket.service;



import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.supermarket.dao.MarketDAO;
import com.xworkz.supermarket.dao.MarketDAOImpl;
import com.xworkz.supermarket.entity.SuperMarket;
import static com.xworkz.supermarket.util.Validation.*;

import java.util.Set;

public class ServiceDAOImpl implements ServiceDAO {

	MarketDAO dao = new MarketDAOImpl();
	@Override
	public Boolean save(SuperMarket entity) {
	
		ValidatorFactory factory = getFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SuperMarket>> violation = validator.validate(entity);
		if(violation.size() > 0) {
			
			System.out.println("Invalid Detais");
			
        } else {
            System.out.println("Valid Object");
            dao.save(entity);
        }
		return null;
	}

}
