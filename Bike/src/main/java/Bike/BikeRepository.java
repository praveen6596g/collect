package Bike;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BikeRepository extends JpaRepository<BikeEntity,Integer> {
	
}
