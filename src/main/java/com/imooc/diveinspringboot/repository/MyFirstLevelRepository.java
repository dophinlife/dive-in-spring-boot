package com.imooc.diveinspringboot.repository;

import com.imooc.diveinspringboot.annotation.SecondLevelRepository;

@SecondLevelRepository(value = "myFirstLevelRepository")
public class MyFirstLevelRepository {
}
