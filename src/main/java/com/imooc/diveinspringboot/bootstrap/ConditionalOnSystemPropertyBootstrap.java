package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 系统属性条件引导类
 *
 * @author guangp
 * @since 2020/6/30
 */
public class ConditionalOnSystemPropertyBootstrap {
    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value = "guangp")
    public String helloWorld() {
        return "Hello, World. 2020";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        System.out.println(context.getBean("helloWorld", String.class));
        context.close();
    }
}
