import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkx.resorts.dao.ResortDAO;
import com.xworkx.resorts.dao.ResortDAOImpl;
import com.xworkz.resorts.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {
	
		ResortEntity resort = new ResortEntity();
		resort.setId(5);
		resort.setName("valmika");
		resort.setLocation("badravathi");
		resort.setCheckInTime(LocalTime.of(11, 00));
		resort.setCheckOutTime(LocalTime.of(12, 00));
		resort.setCreateBy("siddhu");
		resort.setCreateDate(LocalDate.now());
		resort.setOwner("monica");
		resort.setPricePerDay(4000);
		resort.setUpdateDate(LocalDate.of(2016, 6, 29));
		
		ResortDAO resortdao=new ResortDAOImpl();
		boolean save = resortdao.save(resort);
		System.out.println(save);

	}
	

}
