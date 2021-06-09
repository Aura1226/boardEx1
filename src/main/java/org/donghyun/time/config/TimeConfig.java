package org.donghyun.time.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"org.donghyun.time.mapper"})
@ComponentScan(basePackages = {"org.donghyun.time.service"})
public class TimeConfig {


}
