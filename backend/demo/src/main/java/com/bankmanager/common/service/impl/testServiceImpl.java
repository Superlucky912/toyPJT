package com.bankmanager.common.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankmanager.common.service.testService;
import com.bankmanager.common.service.dao.testMapperDao;

@Service("testService")
public class testServiceImpl implements testService{

    @Autowired
    testMapperDao testDao;
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public List<Map<String, Object>> selectTest() {
        log.info("test====>{}", testDao.selectTest());

        return testDao.selectTest();
        
    }
    
}
