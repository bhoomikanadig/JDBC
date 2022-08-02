package com.xwork.DAO;


import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.jdi.connect.spi.Connection;
import com.xworkz.DTO.BarDTO;





public class BarDAOimpl implements BarDAO{

	


	@Override
	public boolean save(BarDTO barDTO) {

		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			
		 String sql ="insert into bar_inf values("+barDTO.getId()+",'"+barDTO.getBarName()+"','"+barDTO.getLocation()+"','"+barDTO.getType()+"','"+barDTO.getAvrCollectionPerDay()+"','"+barDTO.getAvrCollectionPerMonth()+"')";
		 		
		 Statement statement=connection.createStatement();
		 
		 int noOfRowsAffected=statement.executeUpdate(sql);

		 System.out.println(noOfRowsAffected);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}