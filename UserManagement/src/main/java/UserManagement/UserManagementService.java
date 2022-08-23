package UserManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserManagementService {
@Autowired
	UserManagementDao ud;
	public List<UserManagementEntity>find()
	{
		return ud.find();
	}
	

}
