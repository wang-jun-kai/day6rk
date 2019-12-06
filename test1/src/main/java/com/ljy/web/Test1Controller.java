package com.ljy.web;

import com.ljy.api.TestApi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy.web
 * @作者:
 * @创建时间: 2019-12-06 08:49
 * @描述:
 **/
@RestController
public class Test1Controller {

    @Autowired
    private TestApi testApi;

    @RequestMapping("ceshi/{name}")
    @HystrixCommand(fallbackMethod = "testBack")
    public String ceshi(@PathVariable String name) {

    	System.out.println("---------ceshi-------------");
    	return testApi.test2(name);
    }

    @RequestMapping("testBack")
    public String testBack(String name){
        return "出错了";
    }
}
