package com.example.loanapp;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoanDao {
	@Autowired
	LoanRepository lr;
	public String saveIt(LoanEntity le) {
	 lr.save(le);
	 return "saved";
	}
	public List<LoanEntity>findAllDetail() {
		return lr.findAll();
	}
//	public String saveAll(List<LoanEntity>l) {
//	lr.saveAll(l);
//	return "savedall";
//	}
	public String deleteIt(int a) {
		lr.deleteById(a);
		return "deleted";
	}
	public String replaceIt(LoanEntity le) {
		lr.save(le).getId();
	return "updated"; 
		
	}
	
	
}