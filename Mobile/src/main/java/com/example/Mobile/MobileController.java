package com.example.Mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
	@Autowired
	
    MobileService ms;
	@GetMapping("/findall/{a}")
	public List<MobileEntity>l(@PathVariable String a)
	{
	return ms.l(a);
		
	}
	@GetMapping("/find/{a}")
	public List<String>brand(@PathVariable int a) {
		return ms.brand(a);
	}
	@GetMapping("/price/{a}/{b}")
	public List<MobileEntity>comp(@PathVariable int a,@PathVariable int b) {
		return ms.comp(a,b);
	}
	
	
	
}
