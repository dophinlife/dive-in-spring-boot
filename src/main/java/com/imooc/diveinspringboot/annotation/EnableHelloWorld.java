package com.imooc.diveinspringboot.annotation;

import com.imooc.diveinspringboot.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 注解方式 @Enable
 *
 * @author guangp
 * @since 2020/6/29
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloWorldConfiguration.class)
public @interface EnableHelloWorld {
}
