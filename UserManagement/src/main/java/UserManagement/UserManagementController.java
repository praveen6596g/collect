package UserManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class UserManagementController {
	
	@Autowired
	UserManagementService us;

	@GetMapping("/getall")
	public List<UserManagementEntity>find() {
		return us.find();
	
	}


}
