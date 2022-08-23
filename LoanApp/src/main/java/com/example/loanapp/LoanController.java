package com.example.loanapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class LoanController {

		@Autowired
		LoanService ls;
		@PostMapping("/saveloandetail")
		public String saveIt(@RequestBody LoanEntity le) {
			return ls.saveIt(le);
		}
		@GetMapping("/getalldetail")
		public List<LoanEntity>findAllDetail() {
			return ls.findAllDetail();
			
		}
		@PostMapping("/savemany") 
//		public String saveAll(@RequestBody List<LoanEntity>l)
	//	{
	//		return ls.saveAll(l);	
	//		}
		@DeleteMapping("/deletedetail/{a}")
		public  String deleteIt(@PathVariable int a ) {
			return ls.deleteIt(a);
			 
		}
		@PutMapping("/replace")
		public String replaceIt(@RequestBody LoanEntity le)
		{
			return ls.replaceIt(le);
		}
	
	
	
	
	
	
	
	
	
	
	
	

}
