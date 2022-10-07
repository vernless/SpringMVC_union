package com.vern.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author 滨
 * @Date 2022/8/21 18:44
 * @Description: TODO
 * @Version 1.0
 */
@Configuration
@ComponentScan({"com.vern.controller","com.vern.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
