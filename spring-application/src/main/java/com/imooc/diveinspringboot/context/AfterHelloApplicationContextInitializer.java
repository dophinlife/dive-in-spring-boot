package com.imooc.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * AfterHelloApplicationContext 初始化器实现
 *
 * @author guangp
 * @since 2020/7/7
 */
public class AfterHelloApplicationContextInitializer implements ApplicationContextInitializer, Ordered {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("After ApplicationContext.id = " + applicationContext.getId());
    }

    @Override
    public int getOrder() {
        return LOWEST_PRECEDENCE;
    }
}
