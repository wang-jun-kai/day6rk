package com.ljy.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy.web
 * @作者:
 * @创建时间: 2019-12-06 08:47
 * @描述:
 **/
@RestController
public class Test2Controller {

    @RequestMapping("test2")
    public String test2(String name) {
    	System.out.println("------name-----"+name);
    	return "test2-ok";
    }
}
