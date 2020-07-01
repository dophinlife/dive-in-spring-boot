package com.imooc.diveinspringboot.annotation;

import java.lang.annotation.*;

/**
 * 二级
 *
 * @author guangp
 * @since 2020/6/29
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default "";
}
