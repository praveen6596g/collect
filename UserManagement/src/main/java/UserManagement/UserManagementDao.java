package UserManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class UserManagementDao {
	@Autowired
	UserManagementRepository ur;
	public List<UserManagementEntity>find()
	{
		return ur.findAll();
	}
	

}
