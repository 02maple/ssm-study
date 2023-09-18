package com.maple.config;

import com.maple.config.support.SpringMvcSupport;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.maple.controller","com.maple.config.support"})
@EnableWebMvc
//@Import(SpringMvcSupport.class)
public class SpringMvcConfig {
}
