package com.imooc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * HelloWorld @{link Controller}
 *
 * @Author: guangp
 * @Date: 2020-07-10
 */
@Controller
@ControllerAdvice()
public class HelloWorldController {
    @RequestMapping("")
    public String index(Model model) {
        return "index";
    }

    @ModelAttribute("message")
    public String message() {
        return "Hello World";
    }

    @ModelAttribute("acceptLanguage")
    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage) {
        return acceptLanguage;
    }

    @ModelAttribute("jSessionId")
    public String jSessionId(@CookieValue("JSESSIONID") String jSessionId) {
        return jSessionId;
    }
}
