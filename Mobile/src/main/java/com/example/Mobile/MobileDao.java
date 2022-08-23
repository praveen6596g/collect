package com.example.Mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class MobileDao {
	@Autowired
	MobileRepository mr;
	public List<MobileEntity>l(String a)
	{
		return mr.l(a);
	}
	public List<String> brand(int a) {
		return mr.brand(a);
	}
	public List<MobileEntity>comp(int a,int b) {
		return mr.comp(a,b);
	}

}
