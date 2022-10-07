package com.vern.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @Author 滨
 * @Date 2022/8/21 18:36
 * @Description: TODO
 * @Version 1.0
 */
public class MyBatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean s = new SqlSessionFactoryBean();
        s.setDataSource(dataSource);
        s.setTypeAliasesPackage("com.vern.domain");
        return s;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.vern.dao");
        return mapperScannerConfigurer;
    }
}
