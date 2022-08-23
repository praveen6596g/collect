package BankDetail;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	@Autowired
		BankService bs;
		@GetMapping("/getall")
		public List<BankEntity>find() {
			return bs.find();
		}
	
	
	

}
