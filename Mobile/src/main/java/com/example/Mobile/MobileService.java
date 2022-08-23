package com.example.Mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileService {
	@Autowired
	MobileDao md;
	public List<MobileEntity> l(String a)
	{
		return md.l(a);
	}
	public List<String>brand(int a) {
		return md.brand(a);
	}
	public List<MobileEntity>comp(int a,int b){
	return md.comp(a,b);
	
	}
}
