package org.kp.com.controller;


import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class IndexController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	@RequestMapping("/")
	public String index(Locale local){
		logger.info("Welcome Index, Client Local is: " + local);
		
		
		return "index";
		
	}

}
