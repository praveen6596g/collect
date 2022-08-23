package com.example.Gst;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gr;
	public int lamp(int a) {
		return gr.lamp(a);
	}

}
