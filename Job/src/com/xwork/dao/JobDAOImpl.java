package com.xwork.dao;

import java.net.URL;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

import com.sun.jdi.connect.spi.Connection;
import com.xworkz.Constant.Dbcredentials;
import com.xworkz.Constant.Designation;
import com.xworkz.Constant.Qualification;
import com.xworkz.dto.JobDTO;

public class JobDAOImpl implements JobDAO {

	@Override
	public Boolean saveDetails(JobDTO jobDTO) {
		try {
			java.sql.Connection connection = DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
			String sql = "insert into job.jobdetails values (?,?,?,?,?,?)";
			PreparedStatement preStat = connection.prepareStatement(sql);
			preStat.setInt(1, jobDTO.getJid());
			preStat.setString(2, jobDTO.getDesignation().getDesignation());
			preStat.setDouble(3, jobDTO.getAnnualPackage());
			preStat.setString(4,jobDTO.getQualification().getQualification());
			preStat.setDouble(5, jobDTO.getPercentage());
			preStat.setString(6,jobDTO.getFresher());
			int noOfRowsAffected = preStat.executeUpdate();
			if(noOfRowsAffected > 0 ) {
			System.out.println("The Values Inserted Are :" + sql);
			System.out.println(noOfRowsAffected);
			} 
			else {
			System.out.println("Unable to insert Data..!!");
			}
		}	
		catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public JobDTO findByID(Integer id) {

		try {
			java.sql.Connection connection = DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
			String search = "select * from job.jobdetails where jid = ?";
			PreparedStatement preStat = connection.prepareStatement(search);
			preStat.setInt(1, id);
			ResultSet resultSet = preStat.executeQuery();
			while(resultSet.next()) {
				int jid = resultSet.getInt(1);
				String designation = resultSet.getString(2);
				Double ctc = resultSet.getDouble(3);
				String edu = resultSet.getString(4);
				Double perc = resultSet.getDouble(5);
				String eLevel = resultSet.getString(6);

				JobDTO jobDTO = new JobDTO();
				
				jobDTO.setJid(jid);
				jobDTO.setDesignation(Designation.getByValue(designation));
				jobDTO.setAnnualPackage(ctc);
				jobDTO.setQualification(Qualification.getByValue(edu));
				jobDTO.setPercentage(perc);
				jobDTO.setFresher(eLevel);
				return jobDTO;	
				
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public JobDTO findByIdAndDesignation(Integer id, String designation) {
		
		try {
			java.sql.Connection connection = DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
			String search = "select * from job.jobdetails where jid = ? AND designation = ?";
			PreparedStatement preStat = connection.prepareStatement(search);
			preStat.setInt(1, id);
			preStat.setString(2, designation);
			ResultSet resultSet = preStat.executeQuery();
			while(resultSet.next()) {
				System.out.println("inside while");
				int jid = resultSet.getInt(1);
				String desg = resultSet.getString(2);
				Double ctc = resultSet.getDouble(3);
				String edu = resultSet.getString(4);
				Double perc = resultSet.getDouble(5);
				String eLevel = resultSet.getString(6);

				JobDTO jobDTO = new JobDTO();
				
				jobDTO.setJid(jid);
				jobDTO.setDesignation(Designation.getByValue(desg));
				jobDTO.setAnnualPackage(ctc);
				jobDTO.setQualification(Qualification.getByValue(edu));
				jobDTO.setPercentage(perc);
				jobDTO.setFresher(eLevel);
				return jobDTO;		
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;


	}

	@Override
	public JobDTO findByIdAndDesignationAndQualification(Integer id, String designation, String qualification) {
		Connection connection;
		try {
			java.sql.Connection connection1 = DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
			String search = "select * from job.jobdetails where jid = ? and designation = ? and qualification = ?";
			PreparedStatement pStmt = connection1.prepareStatement(search);
			pStmt.setInt(1, id);
			pStmt.setString(2, designation);
			pStmt.setString(3,qualification);
			ResultSet resultSet = pStmt.executeQuery();
			while(resultSet.next()) {
				Integer jid = resultSet.getInt(1);
				String desg = resultSet.getString(2);
				Double ctc = resultSet.getDouble(3);
				String education = resultSet.getString(4);
				Double percentage = resultSet.getDouble(5);
				String level = resultSet.getString(6);
				
				JobDTO jobDTO = new JobDTO();
				jobDTO.setJid(jid);
				jobDTO.setDesignation(Designation.getByValue(desg));
				jobDTO.setAnnualPackage(ctc);
				jobDTO.setQualification(Qualification.getByValue(education));
				jobDTO.setPercentage(percentage);
				jobDTO.setFresher(level);
				return jobDTO;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Integer getTotal() {
		AtomicInteger atomicInteger = new AtomicInteger(0);
		try {
			java.sql.Connection connection = DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
			String query = "select * from job.jobdetails";
			PreparedStatement pStmt = connection.prepareStatement(query);
			ResultSet resultset = pStmt.executeQuery();
			while(resultset.next()) {
				atomicInteger.incrementAndGet();
			}
			System.out.println(atomicInteger);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean isFesherById(Integer id) {
		try {
			java.sql.Connection connection = DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
			String get = "select * from job.jobdetails where jid = ? and fresher";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return null;
	}

	@Override
	public Double getMaxPercentage() {
		// TODO Auto-generated method stub
		return null;
	}

}