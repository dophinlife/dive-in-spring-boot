package com.imooc.diveinspringboot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Spring 应用上下文引导类
 *
 * @author guangp
 * @since 2020/7/8
 */
@SpringBootApplication
public class SpringApplicationContextBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationContextBootstrap.class)
                .web(WebApplicationType.SERVLET)
                .run(args);

        System.out.println("context 类型 : " + context.getClass().getName());
        System.out.println("Environment 类型 : " + context.getEnvironment().getClass().getName());

        context.close();
    }
}
