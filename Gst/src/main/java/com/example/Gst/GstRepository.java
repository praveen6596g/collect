package com.example.Gst;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GstRepository extends JpaRepository<GstEntity,Integer> {
	@Query (value="select percentage from gst_table where hsncode=?",nativeQuery =true)
	public int lamp(int a);
	

}
