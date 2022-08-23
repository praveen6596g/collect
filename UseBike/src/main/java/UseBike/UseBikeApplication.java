package UseBike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UseBikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseBikeApplication.class, args);
	}
	@Bean
	RestTemplate resttemplate() {
	return new RestTemplate();
	
	}
}
