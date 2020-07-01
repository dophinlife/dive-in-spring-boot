package com.imooc.diveinspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Hello World 配置
 *
 * @author guangp
 * @since 2020/6/29
 */
//@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String helloWorld() {
        return "Hello World, 2020.";
    }
}
