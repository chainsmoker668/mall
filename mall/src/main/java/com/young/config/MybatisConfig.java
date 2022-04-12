package com.young.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 *
 */
@Configuration
@MapperScan(value = "com.young.mbg.mapper")
public class MybatisConfig {

}
