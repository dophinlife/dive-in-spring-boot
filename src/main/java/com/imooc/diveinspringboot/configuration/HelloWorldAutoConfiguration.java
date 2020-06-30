package com.imooc.diveinspringboot.configuration;

import com.imooc.diveinspringboot.annotation.EnableHelloWorld;
import com.imooc.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld 自动装配
 *
 * @author guangp
 * @since 2020/6/29
 */
@Configuration // Spring 模式注解装配
@EnableHelloWorld // Spring @Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "guangp") // 条件装配
public class HelloWorldAutoConfiguration {
}
