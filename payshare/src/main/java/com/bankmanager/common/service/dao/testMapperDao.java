package com.bankmanager.common.service.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface testMapperDao {
    
    Map<String , Object> selectTest2();
}
