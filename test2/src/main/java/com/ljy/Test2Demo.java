package com.ljy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy
 * @作者:
 * @创建时间: 2019-12-06 08:44
 * @描述:
 **/
@SpringBootApplication
@RestController
public class Test2Demo {

    public static void main(String[] args){
        SpringApplication.run(Test2Demo.class,args);
    }

    @RequestMapping("helth2")
    public String helth2() {
        System.out.println("test2健康");
        return "test2----ok";
    }
}
