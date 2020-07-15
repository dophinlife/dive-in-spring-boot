package com.imooc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloWorld @{link Controller}
 *
 * @Author: guangp
 * @Date: 2020-07-10
 */
@Controller
public class HelloWorldController {
    @RequestMapping("")
    public String index(){
        return "index";
    }
}
