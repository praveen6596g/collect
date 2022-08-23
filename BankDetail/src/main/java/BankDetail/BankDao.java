package BankDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankDao {
	
	
	@Autowired
	BankRepository br;
	public List<BankEntity>find()
	{
		return br.findAll();
	}
	
	

}
