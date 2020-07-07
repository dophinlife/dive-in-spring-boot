package com.imooc.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * Hello {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 *
 * @author guangp
 * @since 2020/7/7
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("HelloWorld : " + event.getApplicationContext().getId() +
                ", timestamp : " + event.getTimestamp());
    }
}
