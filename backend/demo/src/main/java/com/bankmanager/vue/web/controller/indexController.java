package com.bankmanager.vue.web.controller;

import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.bankmanager.common.service.testService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class indexController {
    
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private testService test;

    @GetMapping("/")
	public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index.html");
        log.info("indexController====>{}",test.selectTest());
		return mv;
	}

    @PostMapping("/test")
    public Map<String, Object> test() {
        
        log.info("indexController====>{}",test.selectTest ());
        return test.selectTest();
    }
    

}