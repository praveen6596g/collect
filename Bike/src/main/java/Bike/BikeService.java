package Bike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeService {
@Autowired
BikeDao bd;
public List<BikeEntity>find()
{
	return bd.find();
}
public BikeEntity find(int  a)
{
	return bd.find(a);
}
}
