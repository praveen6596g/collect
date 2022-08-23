package CustomerDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.loanapp.LoanEntity;

import UseBike.UseBikeEntity;



@RestController
public class CustomerController {
	@Autowired RestTemplate rt;
	@Autowired
	 
	
    CustomerService cs;

	@PostMapping(value="/getcustomer")
	public String add (@RequestBody List<CustomerEntity>large){
		large.forEach(x->{
		String branch =x.getBranch();
	String url1="http://localhost:8080/getall";
	ResponseEntity<String>response=rt.exchange(url1+branch,HttpMethod.GET,null,String.class);
	String a=response.getBody(); 
	x.setIfscCode(a);
	
	});

		return cs.getcustomer(large);
	
	}
}