package com.imooc.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * SpringApplication 引导类
 *
 * @author guangp
 * @since 2020/7/7
 */
public class SpringApplicationBootstrap {
    public static void main(String[] args) {
//        SpringApplication.run(ApplicationConfig.class, args);
        Set<String> sources = new HashSet<>();
        sources.add(ApplicationConfig.class.getName());
        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sources);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = springApplication.run(args);
        System.out.println("Bean: " +  context.getBean(ApplicationConfig.class));
    }

    @SpringBootApplication
    public static class ApplicationConfig {
    }
}
