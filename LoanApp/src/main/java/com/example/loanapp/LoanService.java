package com.example.loanapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;

@Service
public class LoanService {
	@Autowired
	LoanDao ld;
	public String saveIt(LoanEntity le) {
		return ld.saveIt(le);
	}
	public List<LoanEntity>findAllDetail() {
		return ld.findAllDetail();
	}
//  public String saveAll(List<LoanEntity>l) {
//		return ld.saveAll(l)
//   }
   
	public String deleteIt( int a) {
		return ld.deleteIt(a);
	}
	public String replaceIt(LoanEntity le) {
		return ld.replaceIt(le);
	}
	
	
	
	}

