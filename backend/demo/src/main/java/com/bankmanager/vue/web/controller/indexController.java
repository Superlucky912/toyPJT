package com.bankmanager.vue.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bankmanager.common.service.testService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class indexController {
    
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    testService test;

    @GetMapping("/")
	public String index() {
        
		return "index.html";
	}

    @PostMapping("/index")
    public void test() {
        
        log.info("indexController====>{}",test.selectTest());
        
    }
    

}