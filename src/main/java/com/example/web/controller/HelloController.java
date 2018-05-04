package com.example.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by s on 2018/3/1.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello!";
    }
}