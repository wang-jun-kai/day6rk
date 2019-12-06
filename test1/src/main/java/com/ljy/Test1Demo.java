package com.ljy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
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
@EnableFeignClients
@EnableCircuitBreaker
public class Test1Demo {

    public static void main(String[] args){
        SpringApplication.run(Test1Demo.class,args);
    }

    @RequestMapping("helth1")
    public String helth1() {
    	System.out.println("----------test1健康------------");
    	return "test1----ok";
    }
}
