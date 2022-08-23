package com.example.Gst;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GstService {
@Autowired
GstDao gd;
public int lamp(int a) {
	return gd.lamp(a);
}

}
