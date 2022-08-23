package Bike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {
	@Autowired
	BikeService bs;
	@GetMapping("/getall")
	public List<BikeEntity>find() {
		return bs.find();
	}
@GetMapping("/get/{a}")
public  BikeEntity find(@PathVariable int a)
{
	return bs.find(a);
}

}
