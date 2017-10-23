package com.report.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by 刘东旭 on 2017/10/19.
 */
@Configuration
@ComponentScan(basePackages = {"com.report"},
        excludeFilters = {@Filter(EnableWebMvc.class), @Filter(Controller.class)})
public class AppConfig  {



}
