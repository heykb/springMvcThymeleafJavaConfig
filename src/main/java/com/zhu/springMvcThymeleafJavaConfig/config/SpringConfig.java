package com.zhu.springMvcThymeleafJavaConfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(value = "com.zhu.springMvcThymeleafJavaConfig",excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,value = EnableWebMvc.class)
})
//指定不适合组件扫描的类型。这段代码的含义就是除开使用了@EnableWebMvc注解的WebConfig配置类扫描的bean。
public class SpringConfig {

}
