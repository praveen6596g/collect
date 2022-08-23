package CustomerDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository cr;
	public int add(CustomerEntity large) {
		cr.save(large).getId();
	}

}
