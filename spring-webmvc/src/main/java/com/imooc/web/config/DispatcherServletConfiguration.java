package com.imooc.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * {@link DispatcherServlet} 配置类
 *
 * @Author: guangp
 * @Date: 2020-07-18
 */
@Configuration
@ComponentScan(basePackages = "com.imooc.web")
public class DispatcherServletConfiguration {
}
