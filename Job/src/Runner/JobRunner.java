package Runner;

import com.xwork.dao.JobDAO;
import com.xwork.dao.JobDAOImpl;
import com.xworkz.Constant.Designation;
import com.xworkz.Constant.Qualification;
import com.xworkz.dto.JobDTO;

public class JobRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JobDTO jobDTO = new JobDTO();
		JobDAO jobDAO = new JobDAOImpl();
//		jobDAO.saveDetails(jobDTO);
//		JobDTO gon =jobDAO.findByID(2);
//		System.out.println(gon);
//	JobDTO details=jobDAO.findByIdAndDesignation(4, "NetworkEngineer");
//	System.out.println(details);
//		JobDTO de = jobDAO.findByIdAndDesignationAndQualification(6, "Developer", "BE");
//		System.out.println(de);
		jobDAO.getTotal();
		
	}

}