package CustomerDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	CustomerDao cd;
	public int add(CustomerEntity large) {
	 return cd.add(large);

}
