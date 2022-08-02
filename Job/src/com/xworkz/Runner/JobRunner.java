package com.xworkz.Runner;

import com.xworkz.DAO.JobDAO;
import com.xworkz.DAO.JobDAOImpl;
import com.xworkz.DTO.JobDTO;
import com.xworkz.constant.Designation;
import com.xworkz.constant.Qualification;

public class JobRunner {

	public static void main(String[] args) {
		


		JobDTO jobDTO = new JobDTO(1,Designation.SYSTEMENGINEER,300000.00D,Qualification.BE,63.51D,"NO");
		JobDAO jobDAO = new JobDAOImpl();
//		jobDAO.saveDetails(jobDTO);
		jobDAO.findByID(2);
	}

}
	

	

	