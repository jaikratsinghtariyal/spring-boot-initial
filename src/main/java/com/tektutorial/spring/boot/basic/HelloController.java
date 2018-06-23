package com.tektutorial.spring.boot.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
    	String str = "{\"name\":\"John\", \"age\":31, \"city\":\"New York\" }";
       // return "Hello";
        return str;
    }
}
