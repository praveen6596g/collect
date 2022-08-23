package com.example.Sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/Web")

public class WebConnetivity {
	@GetMapping(value="/hi")
	public String getHi() {
		return "hello world";
	}
	@GetMapping(value="/add/{num1}/{num2}")
	public int add(@PathVariable int num1,@PathVariable int num2) {
		return num1+num2;
	}
	@GetMapping(value="/merge/{num1}/{num2}")
	public String merge(@PathVariable String num1,@PathVariable String num2) {
		return num1.concat(num2);
	}
	@RequestMapping(value="/mul/{num1}/{num2}")
	public String mul(@PathVariable String num1,@PathVariable String num2) {
		return num1.concat(num2);
	}
	@RequestMapping(value="/com/{num1}/{num2}/{num3}/{num4}")
	public String com(@PathVariable int num1,@PathVariable int num2,@PathVariable String num3,@PathVariable String num4) {
		return   num1+num2+(num3.concat(num4));
	}
	@GetMapping(value="/prime/{num1}")
	public String prime(@PathVariable int num1) {
	boolean prime=true;	
	
	for(int i=2;i>num1;i++)
	{
		if(num1%i==0)
		{
			prime=false;
		}
	}
		if(prime==true) {
			return num1+"is prime";
		}
		else {
			return num1+"is not prime";
		
	}
	}
	@RequestMapping(value="plural/{num}")
		public String plural(@PathVariable String num) {
		
			if(num.endsWith("s"))
			{
				return "plural";
			}
			else {
				return "singular";
			}
		
	}
	@GetMapping(value="/user")
	public String user(@RequestParam String name,@RequestParam String password) {
		if(name.equals("praveen")&&password.equals("6596")){
			
		
			return "access granted";
		}
		else
		{
			return "access denied";
		} 
	}
}


