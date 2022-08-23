package com.example.Mobile;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MobileRepository extends JpaRepository<MobileEntity,Integer>  {
 @Query(value="select * from mobile_table where brand like %:a%",nativeQuery=true)
        public List<MobileEntity>l(String a);
 
	 @Query(value="select brand from mobile_table where ram=?",nativeQuery=true)
	 public List<String>brand(int a);
	 @Query(value="select * from mobile_table where price>=10000 and price<=20000",nativeQuery=true)
	 public List<MobileEntity>comp(int a,int b);
 
}

