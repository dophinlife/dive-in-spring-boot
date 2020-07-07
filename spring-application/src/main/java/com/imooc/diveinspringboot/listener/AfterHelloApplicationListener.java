package com.imooc.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

/**
 * AfterHello {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 *
 * @author guangp
 * @since 2020/7/7
 */
public class AfterHelloApplicationListener implements ApplicationListener<ContextRefreshedEvent>,Ordered {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("AfterHelloWorld : " + event.getApplicationContext().getId() +
                ", timestamp : " + event.getTimestamp());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
