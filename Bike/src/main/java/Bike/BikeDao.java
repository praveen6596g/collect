package Bike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;
	public List<BikeEntity>find()
	{
		return br.findAll();
	}
	public BikeEntity find(int a)
	{
		return br.findById(a).get();
	}

}
