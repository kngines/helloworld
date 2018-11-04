package com.kngines;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;    

@Controller    
public class HelloWorldController { 
	
	public static final Logger LOG = Logger.getLogger(HelloWorldController.class);
	
    @RequestMapping(value="/hello",method=RequestMethod.GET)    
    public String sayHello(ModelMap model) {    
        model.addAttribute("message", "Hello Kngines!"); 
        LOG.info("========== {HelloWorldController} Log4j First Test. ==========");
        return "hello";    
    }    
}