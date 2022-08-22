package com.xworkz.supermarket.runner;

import java.time.LocalDateTime;

import com.xworkz.supermarket.entity.SuperMarket;
import com.xworkz.supermarket.service.ServiceDAO;
import com.xworkz.supermarket.service.ServiceDAOImpl;

public class MarketRunner {

	public static void main(String[] args) {
		SuperMarket market = new SuperMarket();
		market.setId(1);
		market.setName("DMart");
		market.setLocation("Jayanager");
		market.setNoofstalls(20);
		market.setCreatedDate(LocalDateTime.now());
		market.setCreatedBy("Boss");
		market.setUpdatedDate(LocalDateTime.now());
		market.setUpdatedBy("sharth");
		
		ServiceDAO dao = new ServiceDAOImpl();
		dao.save(market);
	}

}
