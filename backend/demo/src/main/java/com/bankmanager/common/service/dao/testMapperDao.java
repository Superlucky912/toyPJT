package com.bankmanager.common.service.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface testMapperDao {
    
    List<Map<String , Object>> selectTest();
}
