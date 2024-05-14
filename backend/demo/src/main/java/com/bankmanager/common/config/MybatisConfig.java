package com.bankmanager.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.bankmanager.common.service.dao"})
public class MybatisConfig {
    
}
