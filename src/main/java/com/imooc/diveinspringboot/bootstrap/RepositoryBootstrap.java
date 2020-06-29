package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 仓储引导类
 *
 * @author guangp
 * @since 2020/6/29
 */
@ComponentScan(basePackages = "com.imooc.diveinspringboot.repository")
public class RepositoryBootstrap {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        MyFirstLevelRepository myFirstLevelRepository =
                context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);

        System.out.println(myFirstLevelRepository);
        // 关闭上下文
        context.close();
    }
}
