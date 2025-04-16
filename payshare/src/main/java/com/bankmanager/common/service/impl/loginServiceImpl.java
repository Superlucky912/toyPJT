package com.bankmanager.common.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankmanager.common.service.loginService;
import com.bankmanager.common.service.dao.loginMapperDao;
import com.bankmanager.common.service.vo.loginVo;

@Service("loginService")
public class loginServiceImpl implements loginService{

    @Autowired
    private loginMapperDao loginDao;

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public loginVo login(loginVo vo) {
        log.info("vo.id====>{}", vo.getId());
        log.info("vo.pw====>{}", vo.getPw());
        log.info("vo====>{}", loginDao.login(vo));

        return loginDao.login(vo);
        
    }
    
}
