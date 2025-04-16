package com.bankmanager.common.service.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bankmanager.common.service.vo.loginVo;

@Mapper
public interface loginMapperDao {
    
    loginVo login(loginVo vo);
}
