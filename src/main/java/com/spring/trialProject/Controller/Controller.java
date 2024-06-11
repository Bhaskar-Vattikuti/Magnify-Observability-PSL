package com.spring.trialProject.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.trialProject.Entities.Entities;
import com.spring.trialProject.Service.myService;





@RestController

public class Controller {
    Logger logger= LoggerFactory.getLogger(Controller.class);
	@GetMapping("/home")
	public String home() {
		logger.info("Welcome to home page");
		return "home";
	}
	
	@Autowired
	myService ms;
	@GetMapping("/courses")
	public List<Entities> getCourses(){
		return ms.getCourses();
	}
}
