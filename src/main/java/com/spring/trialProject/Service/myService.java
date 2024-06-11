package com.spring.trialProject.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.trialProject.Entities.Entities;

@Service
public class myService {

	List<Entities> list;
	
	public myService() {
		list = new ArrayList<>();
		list.add(new Entities(1,"Java","Java Course for Beginners"));
		list.add(new Entities(2,"Python","Python Course for Beginners"));
	}
		
		public List<Entities> getCourses(){
			return list;
	}
}
