package UseBike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UseBikeController {
@Autowired
RestTemplate rt;
@GetMapping(value="/getnetprice")
public List<UseBikeEntity>getnet(){
	String url1="http://localhost:8080/getall";
	String url2="http://localhost:8081/find/";
	ResponseEntity<List<UseBikeEntity>>response1=rt.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<UseBikeEntity>>(){});
	List<UseBikeEntity>a=response1.getBody();
	a.forEach(x->{
		int hsncode=x.getHsncode();
		ResponseEntity<Integer>response2=rt.exchange(url2+hsncode,HttpMethod.GET,null,Integer.class);
		int find=response2.getBody();
		x.setPrice(x.getPrice()+(x.getPrice()*find/100));});

	return a;
	
}
	

}
