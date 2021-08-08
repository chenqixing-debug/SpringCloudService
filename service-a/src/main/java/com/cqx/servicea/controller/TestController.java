package com.cqx.servicea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author qixing.chen
 * @Date 2021/8/8 1:10 下午
 */
@RestController
public class TestController {


    @RequestMapping("testA")
    public String TestAController(){
        return "Hello,SpringCloud for TestA";
    }
}
