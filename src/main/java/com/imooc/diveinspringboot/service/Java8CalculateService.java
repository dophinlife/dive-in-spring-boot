package com.imooc.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Java7 for 循环实现
 *
 * @author guangp
 * @since 2020/6/30
 */
@Profile("Java8")
@Service
public class Java8CalculateService implements CalculateService {
    @Override
    public int sum(int... values) {
        System.out.println("Java 8 lambda 实现");
        int  sum = Arrays.stream(values).reduce(0, Integer::sum);
        return sum;
    }

    public static void main(String[] args) {
        CalculateService calculateService = new Java8CalculateService();
        System.out.println(calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
