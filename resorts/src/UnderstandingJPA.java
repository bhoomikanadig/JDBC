import com.xworkx.resorts.dao.ResortDAO;
import com.xworkx.resorts.dao.ResortDAOImpl;
import com.xworkz.resorts.entity.ResortEntity;

public class UnderstandingJPA {

	public static void main(String[] args) {
	    
		ResortDAO dao = new ResortDAOImpl();
	ResortEntity entity1 =dao.findByID(1);
		System.out.println(entity1);

    ResortEntity entity = new ResortEntity();
    		
	dao.updateOwnerAndLocationById("Bhoomika", "Shivmoga", 1);
	
	dao.deleteById(2);
	}

}
