package com.xworkz.service;

import javax.xml.validation.Validator;

import com.xworkz.entity.MarketEntity;

public class MarketServiceDAOImpl implements MarketServiceDAO {

	@Override
	public Boolean save(MarketEntity entity) {
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<MarketEntity>> violation = validator.validate(entity);
		if(violation.size() > 0) {
			
			System.out.println("Invalid Detais");
//            for (ConstraintViolation<MarketEntity> violation2 : violation) {
//                System.out.println(violation2.getMessage());
        } else {
            System.out.println("Valid Object");
            dao.save(entity);
        }
		return null;
	}

	
}