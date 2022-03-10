package com.github.romanes1.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(
            @RequestParam(value = "name", required = false) String name
    ){
        if (name!=null){
            return "Hello," + name + "!";
        }
        return "Hello, world!";
    }
}
