package com.imooc.diveinspringboot;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 应用事件引导类
 *
 * @author guangp
 * @since 2020/7/8
 */
public class SpringApplicationEventBootstrap {
    public static void main(String[] args) {
        // 创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册应用事件监听器
        context.addApplicationListener(event -> {
            System.out.println("监听到事件：" + event);
        });
        // 启动
        context.refresh();

        context.publishEvent("Hello World");
        context.publishEvent("2020");
        context.publishEvent(new ApplicationEvent("Guangp") {
        });
        // 关闭
        context.close();
    }
}
