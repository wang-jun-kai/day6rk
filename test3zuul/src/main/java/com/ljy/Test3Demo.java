package com.ljy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
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
@EnableZuulProxy
public class Test3Demo {

    public static void main(String[] args){
        SpringApplication.run(Test3Demo.class,args);
    }

    @RequestMapping("helth3")
    public String helth3() {
        System.out.println("test3健康");
        return "test3----ok";
    }
}
