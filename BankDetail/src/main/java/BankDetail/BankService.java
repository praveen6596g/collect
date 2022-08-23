package BankDetail;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	
	
	
	@Autowired
	BankDao bd;
	public List<BankEntity>find()
	{
		return bd.find();
	}
	
	

}
