package com.example.Gst;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GstController {
	@Autowired
	GstService gs;
	@GetMapping("/find/{a}")
	public int lamp(@PathVariable int a)
	{
		return gs.lamp(a);
	}
	

}
